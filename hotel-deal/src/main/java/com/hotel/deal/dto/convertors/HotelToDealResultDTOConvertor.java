/**
 * 
 */
package com.hotel.deal.dto.convertors;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import com.hotel.deal.dao.expedia.beans.deals.Hotel;
import com.hotel.deal.dto.criteria.DealResultDTO;

/**
 * @author amjad_darwish
 *
 */
public class HotelToDealResultDTOConvertor {
	/**
	 * @param hotel
	 * @return
	 */
	public static DealResultDTO convert(Hotel hotel) {
		DealResultDTO dealResultDTO = new DealResultDTO();
		
		dealResultDTO.setAveragePricePerNight(hotel.getHotelPricingInfo().getAveragePriceValue().toString());
		dealResultDTO.setCurrency(hotel.getHotelPricingInfo().getCurrency());
		dealResultDTO.setDestinationName(hotel.getDestination().getLongName());
		
		if(hotel.getHotelPricingInfo().getHotelTotalMandatoryTaxesAndFees() != null) {
			dealResultDTO.setFeesAndTax(hotel.getHotelPricingInfo().getHotelTotalMandatoryTaxesAndFees().toString());
		} else {
			dealResultDTO.setFeesAndTax("0");
		}
		
		dealResultDTO.setHotelDesc(hotel.getHotelInfo().getDescription());
		dealResultDTO.setHotelImageUrl(hotel.getHotelInfo().getHotelImageUrl());
		dealResultDTO.setHotelName(hotel.getHotelInfo().getHotelLongDestination());
		dealResultDTO.setHotelRating(hotel.getHotelInfo().getHotelStarRating());
		
		try {
			dealResultDTO.setHotelUrl(URLDecoder.decode(hotel.getHotelUrls().getHotelInfositeUrl(), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			dealResultDTO.setHotelUrl(hotel.getHotelUrls().getHotelInfositeUrl());
		}
		
		dealResultDTO.setLanguage(hotel.getHotelInfo().getLanguage());
		dealResultDTO.setHotelId(hotel.getHotelInfo().getHotelId());
		
		return dealResultDTO;
	}
}
