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
public class OfferInfo {
	private String siteID;
	private String language;
	private String currency;
	
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
	 * @return the siteID
	 */
	public String getSiteID() {
		return siteID;
	}

	/**
	 * @param siteID the siteID to set
	 */
	public void setSiteID(String siteID) {
		this.siteID = siteID;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OfferInfo [siteID=" + siteID + ", language=" + language + ", currency=" + currency + "]";
	}
}
