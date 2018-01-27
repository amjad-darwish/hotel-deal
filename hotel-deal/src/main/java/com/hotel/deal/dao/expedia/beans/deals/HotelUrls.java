/**
 * 
 */
package com.hotel.deal.dao.expedia.beans.deals;

/**
 * @author amjad_darwish
 *
 */
public class HotelUrls {
	private String hotelInfositeUrl;
	private String hotelSearchResultUrl;
	
	/**
	 * @return the hotelInfositeUrl
	 */
	public String getHotelInfositeUrl() {
		return hotelInfositeUrl;
	}
	
	/**
	 * @param hotelInfositeUrl the hotelInfositeUrl to set
	 */
	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}
	
	/**
	 * @return the hotelSearchResultUrl
	 */
	public String getHotelSearchResultUrl() {
		return hotelSearchResultUrl;
	}
	
	/**
	 * @param hotelSearchResultUrl the hotelSearchResultUrl to set
	 */
	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HotelUrls [hotelInfositeUrl=" + hotelInfositeUrl + ", hotelSearchResultUrl=" + hotelSearchResultUrl
				+ "]";
	}
}
