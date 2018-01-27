/**
 * 
 */
package com.hotel.deal.dto.criteria;

/**
 * @author amjad_darwish
 *
 */
public class DealResultDTO {
	private String destinationName;
	private long hotelId;
	private String hotelName;
	private String hotelImageUrl;
	private String hotelDesc;
	private String language;
	private String hotelRating;
	private String averagePricePerNight;
	private String feesAndTax;
	private String currency;
	private String hotelUrl;
	
	/**
	 * @return the hotelId
	 */
	public long getHotelId() {
		return hotelId;
	}

	/**
	 * @param hotelId the hotelId to set
	 */
	public void setHotelId(long hotelId) {
		this.hotelId = hotelId;
	}

	/**
	 * @return the hotelName
	 */
	public String getHotelName() {
		return hotelName;
	}

	/**
	 * @param hotelName the hotelName to set
	 */
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	/**
	 * @return the destinationName
	 */
	public String getDestinationName() {
		return destinationName;
	}

	/**
	 * @param destinationName the destinationName to set
	 */
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	/**
	 * @return the hotelImageUrl
	 */
	public String getHotelImageUrl() {
		return hotelImageUrl;
	}

	/**
	 * @param hotelImageUrl the hotelImageUrl to set
	 */
	public void setHotelImageUrl(String hotelImageUrl) {
		this.hotelImageUrl = hotelImageUrl;
	}

	/**
	 * @return the hotelDesc
	 */
	public String getHotelDesc() {
		return hotelDesc;
	}

	/**
	 * @param hotelDesc the hotelDesc to set
	 */
	public void setHotelDesc(String hotelDesc) {
		this.hotelDesc = hotelDesc;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the hotelRating
	 */
	public String getHotelRating() {
		return hotelRating;
	}

	/**
	 * @param hotelRating the hotelRating to set
	 */
	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}

	/**
	 * @return the averagePricePerNight
	 */
	public String getAveragePricePerNight() {
		return averagePricePerNight;
	}

	/**
	 * @param averagePricePerNight the averagePricePerNight to set
	 */
	public void setAveragePricePerNight(String averagePricePerNight) {
		this.averagePricePerNight = averagePricePerNight;
	}

	/**
	 * @return the feesAndTax
	 */
	public String getFeesAndTax() {
		return feesAndTax;
	}

	/**
	 * @param feesAndTax the feesAndTax to set
	 */
	public void setFeesAndTax(String feesAndTax) {
		this.feesAndTax = feesAndTax;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the hotelUrl
	 */
	public String getHotelUrl() {
		return hotelUrl;
	}

	/**
	 * @param hotelUrl the hotelUrl to set
	 */
	public void setHotelUrl(String hotelUrl) {
		this.hotelUrl = hotelUrl;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DealResultDTO [destinationName=" + destinationName + ", hotelId=" + hotelId + ", hotelName=" + hotelName
				+ ", hotelImageUrl=" + hotelImageUrl + ", hotelDesc=" + hotelDesc + ", language=" + language
				+ ", hotelRating=" + hotelRating + ", averagePricePerNight=" + averagePricePerNight + ", feesAndTax="
				+ feesAndTax + ", currency=" + currency + ", hotelUrl=" + hotelUrl + "]";
	}
}
