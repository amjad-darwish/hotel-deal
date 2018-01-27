/**
 * 
 */
package com.hotel.deal.dao.expedia.beans.deals;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author amjad_darwish
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelInfo {
	private long hotelId;
	private String hotelName;
	private String hotelDestination;
	private long hotelDestinationRegionID;
	private String hotelLongDestination;
	private String hotelStreetAddress;
	private String hotelCity;
	private String hotelProvince;
	private String hotelCountryCode;
	private String hotelLocation;
	private BigDecimal hotelLatitude;
	private BigDecimal hotelLongitude;
	private String hotelStarRating;
	private BigDecimal hotelGuestReviewRating;
	private String travelStartDate;
	private String travelEndDate;
	private String hotelImageUrl;
	private BigDecimal carPackageScore;
	private String description;
	private BigDecimal distanceFromUser;
	private String language;
	private BigDecimal movingAverageScore;
	private BigDecimal promotionAmount;
	private String promotionDescription;
	private String promotionTag;
	private BigDecimal rawAppealScore;
	private BigDecimal relevanceScore;
	private String statusCode;
	private String statusDescription;
	private boolean carPackage;
	private boolean allInclusive;
	private int hotelReviewTotal;
	
	/**
	 * @return the allInclusive
	 */
	public boolean isAllInclusive() {
		return allInclusive;
	}
	
	/**
	 * @param allInclusive the allInclusive to set
	 */
	public void setAllInclusive(boolean allInclusive) {
		this.allInclusive = allInclusive;
	}

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
	 * @return the hotelDestination
	 */
	public String getHotelDestination() {
		return hotelDestination;
	}

	/**
	 * @param hotelDestination the hotelDestination to set
	 */
	public void setHotelDestination(String hotelDestination) {
		this.hotelDestination = hotelDestination;
	}

	/**
	 * @return the hotelDestinationRegionID
	 */
	public long getHotelDestinationRegionID() {
		return hotelDestinationRegionID;
	}

	/**
	 * @param hotelDestinationRegionID the hotelDestinationRegionID to set
	 */
	public void setHotelDestinationRegionID(long hotelDestinationRegionID) {
		this.hotelDestinationRegionID = hotelDestinationRegionID;
	}

	/**
	 * @return the hotelLongDestination
	 */
	public String getHotelLongDestination() {
		return hotelLongDestination;
	}

	/**
	 * @param hotelLongDestination the hotelLongDestination to set
	 */
	public void setHotelLongDestination(String hotelLongDestination) {
		this.hotelLongDestination = hotelLongDestination;
	}

	/**
	 * @return the hotelStreetAddress
	 */
	public String getHotelStreetAddress() {
		return hotelStreetAddress;
	}

	/**
	 * @param hotelStreetAddress the hotelStreetAddress to set
	 */
	public void setHotelStreetAddress(String hotelStreetAddress) {
		this.hotelStreetAddress = hotelStreetAddress;
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

	/**
	 * @return the hotelProvince
	 */
	public String getHotelProvince() {
		return hotelProvince;
	}

	/**
	 * @param hotelProvince the hotelProvince to set
	 */
	public void setHotelProvince(String hotelProvince) {
		this.hotelProvince = hotelProvince;
	}

	/**
	 * @return the hotelCountryCode
	 */
	public String getHotelCountryCode() {
		return hotelCountryCode;
	}

	/**
	 * @param hotelCountryCode the hotelCountryCode to set
	 */
	public void setHotelCountryCode(String hotelCountryCode) {
		this.hotelCountryCode = hotelCountryCode;
	}

	/**
	 * @return the hotelLocation
	 */
	public String getHotelLocation() {
		return hotelLocation;
	}

	/**
	 * @param hotelLocation the hotelLocation to set
	 */
	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	/**
	 * @return the hotelLatitude
	 */
	public BigDecimal getHotelLatitude() {
		return hotelLatitude;
	}

	/**
	 * @param hotelLatitude the hotelLatitude to set
	 */
	public void setHotelLatitude(BigDecimal hotelLatitude) {
		this.hotelLatitude = hotelLatitude;
	}

	/**
	 * @return the hotelLongitude
	 */
	public BigDecimal getHotelLongitude() {
		return hotelLongitude;
	}

	/**
	 * @param hotelLongitude the hotelLongitude to set
	 */
	public void setHotelLongitude(BigDecimal hotelLongitude) {
		this.hotelLongitude = hotelLongitude;
	}

	/**
	 * @return the hotelStarRating
	 */
	public String getHotelStarRating() {
		return hotelStarRating;
	}

	/**
	 * @param hotelStarRating the hotelStarRating to set
	 */
	public void setHotelStarRating(String hotelStarRating) {
		this.hotelStarRating = hotelStarRating;
	}

	/**
	 * @return the hotelGuestReviewRating
	 */
	public BigDecimal getHotelGuestReviewRating() {
		return hotelGuestReviewRating;
	}

	/**
	 * @param hotelGuestReviewRating the hotelGuestReviewRating to set
	 */
	public void setHotelGuestReviewRating(BigDecimal hotelGuestReviewRating) {
		this.hotelGuestReviewRating = hotelGuestReviewRating;
	}

	/**
	 * @return the travelStartDate
	 */
	public String getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * @param travelStartDate the travelStartDate to set
	 */
	public void setTravelStartDate(String travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * @return the travelEndDate
	 */
	public String getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * @param travelEndDate the travelEndDate to set
	 */
	public void setTravelEndDate(String travelEndDate) {
		this.travelEndDate = travelEndDate;
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
	 * @return the carPackageScore
	 */
	public BigDecimal getCarPackageScore() {
		return carPackageScore;
	}

	/**
	 * @param carPackageScore the carPackageScore to set
	 */
	public void setCarPackageScore(BigDecimal carPackageScore) {
		this.carPackageScore = carPackageScore;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the distanceFromUser
	 */
	public BigDecimal getDistanceFromUser() {
		return distanceFromUser;
	}

	/**
	 * @param distanceFromUser the distanceFromUser to set
	 */
	public void setDistanceFromUser(BigDecimal distanceFromUser) {
		this.distanceFromUser = distanceFromUser;
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
	 * @return the movingAverageScore
	 */
	public BigDecimal getMovingAverageScore() {
		return movingAverageScore;
	}

	/**
	 * @param movingAverageScore the movingAverageScore to set
	 */
	public void setMovingAverageScore(BigDecimal movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}

	/**
	 * @return the promotionAmount
	 */
	public BigDecimal getPromotionAmount() {
		return promotionAmount;
	}

	/**
	 * @param promotionAmount the promotionAmount to set
	 */
	public void setPromotionAmount(BigDecimal promotionAmount) {
		this.promotionAmount = promotionAmount;
	}

	/**
	 * @return the promotionDescription
	 */
	public String getPromotionDescription() {
		return promotionDescription;
	}

	/**
	 * @param promotionDescription the promotionDescription to set
	 */
	public void setPromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	/**
	 * @return the promotionTag
	 */
	public String getPromotionTag() {
		return promotionTag;
	}

	/**
	 * @param promotionTag the promotionTag to set
	 */
	public void setPromotionTag(String promotionTag) {
		this.promotionTag = promotionTag;
	}

	/**
	 * @return the rawAppealScore
	 */
	public BigDecimal getRawAppealScore() {
		return rawAppealScore;
	}

	/**
	 * @param rawAppealScore the rawAppealScore to set
	 */
	public void setRawAppealScore(BigDecimal rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	/**
	 * @return the relevanceScore
	 */
	public BigDecimal getRelevanceScore() {
		return relevanceScore;
	}

	/**
	 * @param relevanceScore the relevanceScore to set
	 */
	public void setRelevanceScore(BigDecimal relevanceScore) {
		this.relevanceScore = relevanceScore;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}

	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}

	/**
	 * @return the carPackage
	 */
	public boolean isCarPackage() {
		return carPackage;
	}

	/**
	 * @param carPackage the carPackage to set
	 */
	public void setCarPackage(boolean carPackage) {
		this.carPackage = carPackage;
	}

	/**
	 * @return the hotelReviewTotal
	 */
	public int getHotelReviewTotal() {
		return hotelReviewTotal;
	}

	/**
	 * @param hotelReviewTotal the hotelReviewTotal to set
	 */
	public void setHotelReviewTotal(int hotelReviewTotal) {
		this.hotelReviewTotal = hotelReviewTotal;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HotelInfo [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelDestination=" + hotelDestination
				+ ", hotelDestinationRegionID=" + hotelDestinationRegionID + ", hotelLongDestination="
				+ hotelLongDestination + ", hotelStreetAddress=" + hotelStreetAddress + ", hotelCity=" + hotelCity
				+ ", hotelProvince=" + hotelProvince + ", hotelCountryCode=" + hotelCountryCode + ", hotelLocation="
				+ hotelLocation + ", hotelLatitude=" + hotelLatitude + ", hotelLongitude=" + hotelLongitude
				+ ", hotelStarRating=" + hotelStarRating + ", hotelGuestReviewRating=" + hotelGuestReviewRating
				+ ", travelStartDate=" + travelStartDate + ", travelEndDate=" + travelEndDate + ", hotelImageUrl="
				+ hotelImageUrl + ", carPackageScore=" + carPackageScore + ", description=" + description
				+ ", distanceFromUser=" + distanceFromUser + ", language=" + language + ", movingAverageScore="
				+ movingAverageScore + ", promotionAmount=" + promotionAmount + ", promotionDescription="
				+ promotionDescription + ", promotionTag=" + promotionTag + ", rawAppealScore=" + rawAppealScore
				+ ", relevanceScore=" + relevanceScore + ", statusCode=" + statusCode + ", statusDescription="
				+ statusDescription + ", carPackage=" + carPackage + ", allInclusive=" + allInclusive
				+ ", isAllInclusive()=" + isAllInclusive() + ", getHotelId()=" + getHotelId() + ", getHotelName()="
				+ getHotelName() + ", getHotelDestination()=" + getHotelDestination()
				+ ", getHotelDestinationRegionID()=" + getHotelDestinationRegionID() + ", getHotelLongDestination()="
				+ getHotelLongDestination() + ", getHotelStreetAddress()=" + getHotelStreetAddress()
				+ ", getHotelCity()=" + getHotelCity() + ", getHotelProvince()=" + getHotelProvince()
				+ ", getHotelCountryCode()=" + getHotelCountryCode() + ", getHotelLocation()=" + getHotelLocation()
				+ ", getHotelLatitude()=" + getHotelLatitude() + ", getHotelLongitude()=" + getHotelLongitude()
				+ ", getHotelStarRating()=" + getHotelStarRating() + ", getHotelGuestReviewRating()="
				+ getHotelGuestReviewRating() + ", getTravelStartDate()=" + getTravelStartDate()
				+ ", getTravelEndDate()=" + getTravelEndDate() + ", getHotelImageUrl()=" + getHotelImageUrl()
				+ ", getCarPackageScore()=" + getCarPackageScore() + ", getDescription()=" + getDescription()
				+ ", getDistanceFromUser()=" + getDistanceFromUser() + ", getLanguage()=" + getLanguage()
				+ ", getMovingAverageScore()=" + getMovingAverageScore() + ", getPromotionAmount()="
				+ getPromotionAmount() + ", getPromotionDescription()=" + getPromotionDescription()
				+ ", getPromotionTag()=" + getPromotionTag() + ", getRawAppealScore()=" + getRawAppealScore()
				+ ", getRelevanceScore()=" + getRelevanceScore() + ", getStatusCode()=" + getStatusCode()
				+ ", getStatusDescription()=" + getStatusDescription() + ", isCarPackage()=" + isCarPackage()
				+ ", getHotelReviewTotal()=" + getHotelReviewTotal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
