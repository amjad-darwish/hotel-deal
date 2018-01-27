/**
 * 
 */
package com.hotel.deal.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hotel.deal.dao.DealDAO;
import com.hotel.deal.dto.criteria.DealResultDTO;
import com.hotel.deal.dto.criteria.DealSearchCriteriaDTO;
import com.hotel.deal.exceptions.DealException;
import com.hotel.deal.services.DealService;

/**
 * @author amjad_darwish
 *
 */
@Service
@Qualifier("defaultServiceImpl")
public class DealServiceImpl implements DealService {
	@Autowired
	@Qualifier("expediaDealDAOImpl")
	private DealDAO dealDAO;
	
	/**
	 * @see com.hotel.deal.services.DealService#listDeals(com.hotel.deal.dto.criteria.DealSearchCriteriaDTO)
	 */
	@Override
	public List<DealResultDTO> listDeals(DealSearchCriteriaDTO searchCriteriaDTO) throws DealException {
		return dealDAO.listDeals(searchCriteriaDTO);
	}

}
