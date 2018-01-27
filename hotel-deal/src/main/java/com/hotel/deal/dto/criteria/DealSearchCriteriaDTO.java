/**
 * 
 */
package com.hotel.deal.dto.criteria;

import java.util.Date;

/**
 * @author amjad_darwish
 *
 */
public class DealSearchCriteriaDTO {
	private String destinationName;
	private String destinationCity;
	private String regionIds;
	private Date minTripStartDate;
	private Date maxTripStartDate;
	private String lengthOfStay;
	private String minStarRating;
	private String maxStarRating;
	private String minTotalRate;
	private String maxTotalRate;
	private String minGuestRating;
	private String maxGuestRating;
	
	/**
	 * @return the destinationCity
	 */
	public String getDestinationCity() {
		return destinationCity;
	}
	
	/**
	 * @param destinationCity the destinationCity to set
	 */
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
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
	 * @return the regionIds
	 */
	public String getRegionIds() {
		return regionIds;
	}

	/**
	 * @param regionIds the regionIds to set
	 */
	public void setRegionIds(String regionIds) {
		this.regionIds = regionIds;
	}

	/**
	 * @return the minTripStartDate
	 */
	public Date getMinTripStartDate() {
		return minTripStartDate;
	}

	/**
	 * @param minTripStartDate the minTripStartDate to set
	 */
	public void setMinTripStartDate(Date minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	/**
	 * @return the maxTripStartDate
	 */
	public Date getMaxTripStartDate() {
		return maxTripStartDate;
	}

	/**
	 * @param maxTripStartDate the maxTripStartDate to set
	 */
	public void setMaxTripStartDate(Date maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	/**
	 * @return the lengthOfStay
	 */
	public String getLengthOfStay() {
		return lengthOfStay;
	}

	/**
	 * @param lengthOfStay the lengthOfStay to set
	 */
	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	/**
	 * @return the minStarRating
	 */
	public String getMinStarRating() {
		return minStarRating;
	}

	/**
	 * @param minStarRating the minStarRating to set
	 */
	public void setMinStarRating(String minStarRating) {
		this.minStarRating = minStarRating;
	}

	/**
	 * @return the maxStarRating
	 */
	public String getMaxStarRating() {
		return maxStarRating;
	}

	/**
	 * @param maxStarRating the maxStarRating to set
	 */
	public void setMaxStarRating(String maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	/**
	 * @return the minTotalRate
	 */
	public String getMinTotalRate() {
		return minTotalRate;
	}

	/**
	 * @param minTotalRate the minTotalRate to set
	 */
	public void setMinTotalRate(String minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	/**
	 * @return the maxTotalRate
	 */
	public String getMaxTotalRate() {
		return maxTotalRate;
	}

	/**
	 * @param maxTotalRate the maxTotalRate to set
	 */
	public void setMaxTotalRate(String maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	/**
	 * @return the minGuestRating
	 */
	public String getMinGuestRating() {
		return minGuestRating;
	}

	/**
	 * @param minGuestRating the minGuestRating to set
	 */
	public void setMinGuestRating(String minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	/**
	 * @return the maxGuestRating
	 */
	public String getMaxGuestRating() {
		return maxGuestRating;
	}

	/**
	 * @param maxGuestRating the maxGuestRating to set
	 */
	public void setMaxGuestRating(String maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DealSearchCriteriaDTO [destinationName=" + destinationName + ", destinationCity=" + destinationCity
				+ ", regionIds=" + regionIds + ", minTripStartDate=" + minTripStartDate + ", maxTripStartDate="
				+ maxTripStartDate + ", lengthOfStay=" + lengthOfStay + ", minStarRating=" + minStarRating
				+ ", maxStarRating=" + maxStarRating + ", minTotalRate=" + minTotalRate + ", maxTotalRate="
				+ maxTotalRate + ", minGuestRating=" + minGuestRating + ", maxGuestRating=" + maxGuestRating + "]";
	}
}
