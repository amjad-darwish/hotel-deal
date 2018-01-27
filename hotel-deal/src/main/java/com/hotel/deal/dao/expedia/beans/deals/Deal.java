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
public class Deal {
	private OfferInfo offerInfo;
	private UserInfo userInfo;
	private Offers offers;
	
	/**
	 * @return the offerInfo
	 */
	public OfferInfo getOfferInfo() {
		return offerInfo;
	}
	
	/**
	 * @param offerInfo the offerInfo to set
	 */
	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	/**
	 * @return the userInfo
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}

	/**
	 * @param userInfo the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	/**
	 * @return the offers
	 */
	public Offers getOffers() {
		return offers;
	}

	/**
	 * @param offers the offers to set
	 */
	public void setOffers(Offers offers) {
		this.offers = offers;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Deal [offerInfo=" + offerInfo + ", userInfo=" + userInfo + ", offers=" + offers + "]";
	}
}
