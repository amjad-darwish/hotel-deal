/**
 * 
 */
package com.hotel.deal.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hotel.deal.dto.criteria.DealResultDTO;
import com.hotel.deal.dto.criteria.DealSearchCriteriaDTO;
import com.hotel.deal.exceptions.DealException;
import com.hotel.deal.log.Level;
import com.hotel.deal.log.LoggerManager;
import com.hotel.deal.log.factory.LogMessageBuilderFactory;
import com.hotel.deal.log.messages.LogMessage;
import com.hotel.deal.pages.Pageable;
import com.hotel.deal.pages.RequestType;
import com.hotel.deal.services.DealService;

/**
 * @author amjad_darwish
 *
 */
@Controller
@RequestMapping("deals")
public class DealController {
	private static final String LOGGER_NAME = DealController.class.getName();

	@Autowired
	private DealService dealService;
	
	@Autowired
	private LoggerManager loggerManager;
	
	private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
	
	/**
	 * @param webDataBinder
	 */
	@InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
		formatter.setLenient(false);
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(formatter, true));
	}
	
	@Pageable(requestType=RequestType.FORM)
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String listDeals(DealSearchCriteriaDTO searchCriteriaDTO, Model model) {
		try {
			List<DealResultDTO> results = dealService.listDeals(searchCriteriaDTO);
			
			model.addAttribute("hotels", results);
			
			return "result";
		} catch (DealException e) {
			return "500";
		} catch (Exception e) {		
			LogMessage logMessage = 
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setThrowable(e)
											.addMessage("An error occured while trying to list deals with these info \"" + searchCriteriaDTO + "\"")
											.setLoggerName(LOGGER_NAME)
											.build(Level.ERROR);
			
			loggerManager.log(logMessage);
			
			return "500";
		}
	}
}
