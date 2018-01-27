/**
 * 
 */
package com.hotel.deal.dto.criteria;

/**
 * @author amjad_darwish
 *
 */
public class DealResultDTO {
	private String hotelName;
	private String hotelImageUrl;
	private String hotelRating;
	private double guestReview;
	private String hotelUrl;	
	private int numberOfReviews;
	private double newPrice;
	private double oldPrice;
	private String currency;
	private String destinationLongName;
	private String hotelCity;
	
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
	 * @return the guestReview
	 */
	public double getGuestReview() {
		return guestReview;
	}

	/**
	 * @param guestReview the guestReview to set
	 */
	public void setGuestReview(double guestReview) {
		this.guestReview = guestReview;
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
	 * @return the numberOfReviews
	 */
	public int getNumberOfReviews() {
		return numberOfReviews;
	}

	/**
	 * @param numberOfReviews the numberOfReviews to set
	 */
	public void setNumberOfReviews(int numberOfReviews) {
		this.numberOfReviews = numberOfReviews;
	}

	/**
	 * @return the newPrice
	 */
	public double getNewPrice() {
		return newPrice;
	}

	/**
	 * @param newPrice the newPrice to set
	 */
	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

	/**
	 * @return the oldPrice
	 */
	public double getOldPrice() {
		return oldPrice;
	}

	/**
	 * @param oldPrice the oldPrice to set
	 */
	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}

	/**
	 * @return the destinationLongName
	 */
	public String getDestinationLongName() {
		return destinationLongName;
	}

	/**
	 * @param destinationLongName the destinationLongName to set
	 */
	public void setDestinationLongName(String destinationLongName) {
		this.destinationLongName = destinationLongName;
	}

	/**
	 * @return the hotelCity
	 */
	public String getHotelCity() {
		return hotelCity;
	}

	/**
	 * @param hotelCity the hotelCity to set
	 */
	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DealResultDTO [hotelName=" + hotelName + ", hotelImageUrl=" + hotelImageUrl + ", hotelRating="
				+ hotelRating + ", guestReview=" + guestReview + ", hotelUrl=" + hotelUrl + ", numberOfReviews="
				+ numberOfReviews + ", newPrice=" + newPrice + ", oldPrice=" + oldPrice + ", currency=" + currency
				+ ", destinationLongName=" + destinationLongName + ", hotelCity=" + hotelCity + "]";
	}
}
