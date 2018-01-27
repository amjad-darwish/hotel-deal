/**
 * 
 */
package com.hotel.deal.dao.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.hotel.deal.connectors.Connector;
import com.hotel.deal.connectors.config.HttpRestConnectorConfig;
import com.hotel.deal.dao.DealDAO;
import com.hotel.deal.dao.expedia.beans.deals.Deal;
import com.hotel.deal.dto.convertors.HotelToDealResultDTOConvertor;
import com.hotel.deal.dto.criteria.DealResultDTO;
import com.hotel.deal.dto.criteria.DealSearchCriteriaDTO;
import com.hotel.deal.exceptions.DealException;
import com.hotel.deal.log.Level;
import com.hotel.deal.log.LoggerManager;
import com.hotel.deal.log.factory.LogMessageBuilderFactory;
import com.hotel.deal.log.messages.LogMessage;
import com.hotel.deal.pages.ExpediaPaginationInfoInjector;

/**
 * @author amjad_darwish
 *
 */
@Repository
@Qualifier("expediaDealDAOImpl")
public class ExpediaDealDAOImpl implements DealDAO {
	private static final String LOGGER_NAME = ExpediaDealDAOImpl.class.getName();
	
	@Autowired
	private LoggerManager loggerManager;
	
	@Autowired
	@Qualifier("expediaRestConnectorConfig")
	private HttpRestConnectorConfig CONFIG;
	
	@Autowired
	@Qualifier("httpRestConnector")
	private Connector connector;
	
	@Autowired
	private ExpediaPaginationInfoInjector expediaPaginationInfoInjector;
	
	@PostConstruct
	private void init() {
	}
	
	/**
	 * @see com.hotel.deal.dao.DealDAO#listDeals(com.hotel.deal.dto.criteria.DealSearchCriteriaDTO)
	 */
	@Override
	public List<DealResultDTO> listDeals(DealSearchCriteriaDTO searchCriteriaDTO) throws DealException {
		try {
			HttpRestConnectorConfig config = (HttpRestConnectorConfig) CONFIG.clone();
			
			config.addUrlParameter("scenario", "deal-finder");
			config.addUrlParameter("page", "foo");
			config.addUrlParameter("uid", "foo");
			config.addUrlParameter("productType", "Hotel");
			
			DateFormat distFormatter = new SimpleDateFormat("yyyy-MM-dd");
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getDestinationCity())) {
				config.addUrlParameter("destinationCity", searchCriteriaDTO.getDestinationCity());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getDestinationName())) {
				config.addUrlParameter("destinationName", searchCriteriaDTO.getDestinationName());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getRegionIds())) {
				config.addUrlParameter("regionIds", searchCriteriaDTO.getRegionIds());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMinTripStartDate())) {
				config.addUrlParameter("minTripStartDate", distFormatter.format(searchCriteriaDTO.getMinTripStartDate()));
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMaxTripStartDate())) {
				config.addUrlParameter("maxTripStartDate", distFormatter.format(searchCriteriaDTO.getMaxTripStartDate()));
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getLengthOfStay())) {
				config.addUrlParameter("lengthOfStay", searchCriteriaDTO.getLengthOfStay());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMinStarRating())) {
				config.addUrlParameter("minStarRating", searchCriteriaDTO.getMinStarRating());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMaxStarRating())) {
				config.addUrlParameter("maxStarRating", searchCriteriaDTO.getMaxStarRating());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMinTotalRate())) {
				config.addUrlParameter("minTotalRate", searchCriteriaDTO.getMinTotalRate());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMaxTotalRate())) {
				config.addUrlParameter("maxTotalRate", searchCriteriaDTO.getMaxTotalRate());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMinGuestRating())) {
				config.addUrlParameter("minGuestRating", searchCriteriaDTO.getMinGuestRating());
			}
			
			if(!StringUtils.isEmpty(searchCriteriaDTO.getMaxGuestRating())) {
				config.addUrlParameter("maxGuestRating", searchCriteriaDTO.getMaxGuestRating());
			}
			
			expediaPaginationInfoInjector.inject(config);
			
			Deal deal = connector.send(config, Deal.class);
			
			loggerManager.log(
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.addMessage(deal)
											.setLoggerName(LOGGER_NAME)
											.build(Level.INFO));
			
			if(deal.getOffers().getHotel() != null) {
				List<DealResultDTO> results =
						deal.getOffers()
							.getHotel()
							.stream()
							.map(HotelToDealResultDTOConvertor::convert)
							.collect(Collectors.toList());
					
				
				return results;
			}
			
			return new ArrayList<>(0);
		} catch (Exception e) {		
			LogMessage logMessage = 
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setThrowable(e)
											.addMessage("An error occured while trying to list deals with these info \"" + searchCriteriaDTO + "\"")
											.setLoggerName(LOGGER_NAME)
											.build(Level.ERROR);
			
			loggerManager.log(logMessage);
			
			throw new DealException(e);
		}
	}
}
