/**
 * 
 */
package com.hotel.deal.dao.expedia.beans.deals;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author amjad_darwish
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hotel {
	private OfferDateRange offerDateRange;
	private Destination destination;
	private HotelInfo hotelInfo;
	private HotelUrgencyInfo hotelUrgencyInfo;
	private HotelPricingInfo hotelPricingInfo;
	private HotelUrls hotelUrls;
	private HotelScores hotelScores;
	
	/**
	 * @return the destination
	 */
	public Destination getDestination() {
		return destination;
	}
	
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	/**
	 * @return the offerDateRange
	 */
	public OfferDateRange getOfferDateRange() {
		return offerDateRange;
	}

	/**
	 * @param offerDateRange the offerDateRange to set
	 */
	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	/**
	 * @return the hotelInfo
	 */
	public HotelInfo getHotelInfo() {
		return hotelInfo;
	}

	/**
	 * @param hotelInfo the hotelInfo to set
	 */
	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	/**
	 * @return the hotelUrgencyInfo
	 */
	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return hotelUrgencyInfo;
	}

	/**
	 * @param hotelUrgencyInfo the hotelUrgencyInfo to set
	 */
	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	/**
	 * @return the hotelPricingInfo
	 */
	public HotelPricingInfo getHotelPricingInfo() {
		return hotelPricingInfo;
	}

	/**
	 * @param hotelPricingInfo the hotelPricingInfo to set
	 */
	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	/**
	 * @return the hotelUrls
	 */
	public HotelUrls getHotelUrls() {
		return hotelUrls;
	}

	/**
	 * @param hotelUrls the hotelUrls to set
	 */
	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	/**
	 * @return the hotelScores
	 */
	public HotelScores getHotelScores() {
		return hotelScores;
	}

	/**
	 * @param hotelScores the hotelScores to set
	 */
	public void setHotelScores(HotelScores hotelScores) {
		this.hotelScores = hotelScores;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hotel [offerDateRange=" + offerDateRange + ", destination=" + destination + ", hotelInfo=" + hotelInfo
				+ ", hotelUrgencyInfo=" + hotelUrgencyInfo + ", hotelPricingInfo=" + hotelPricingInfo + ", hotelUrls="
				+ hotelUrls + ", hotelScores=" + hotelScores + "]";
	}
}
