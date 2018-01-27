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
		
		dealResultDTO.setCurrency(hotel.getHotelPricingInfo().getCurrency());
		dealResultDTO.setGuestReview(hotel.getHotelInfo().getHotelGuestReviewRating().doubleValue());
		dealResultDTO.setHotelCity(hotel.getHotelInfo().getHotelCity());
		dealResultDTO.setHotelImageUrl(hotel.getHotelInfo().getHotelImageUrl());
		dealResultDTO.setDestinationLongName(hotel.getDestination().getLongName());
		dealResultDTO.setHotelName(hotel.getHotelInfo().getHotelName());
		dealResultDTO.setHotelRating(hotel.getHotelInfo().getHotelStarRating());
		dealResultDTO.setNewPrice(hotel.getHotelPricingInfo().getAveragePriceValue().doubleValue());
		dealResultDTO.setNumberOfReviews(hotel.getHotelInfo().getHotelReviewTotal());
		dealResultDTO.setOldPrice(hotel.getHotelPricingInfo().getOriginalPricePerNight().doubleValue());
		
		try {
			dealResultDTO.setHotelUrl(URLDecoder.decode(hotel.getHotelUrls().getHotelInfositeUrl(), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			dealResultDTO.setHotelUrl(hotel.getHotelUrls().getHotelInfositeUrl());
		}
		
		return dealResultDTO;
	}
}
