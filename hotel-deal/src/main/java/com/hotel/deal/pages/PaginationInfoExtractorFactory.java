package com.hotel.deal.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 
 * @author amjad_darwish
 */
@Component
public class PaginationInfoExtractorFactory {
	@Autowired
	private FormPaginationInfoExtractor formPaginationInfoExtractor; 
	
	/**
	 * @param requestType
	 * @return
	 */
	public PaginationInfoExtractor getExtractor(RequestType requestType) {
		switch(requestType) {
		case FORM:
			return formPaginationInfoExtractor;
		default:
			return formPaginationInfoExtractor;
		}
	}
}
