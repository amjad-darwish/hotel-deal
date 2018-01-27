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
public class Destination {
	private String regionID;
	private String longName;
	private String country;
	private String province;
	private String city;
	
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the regionID
	 */
	public String getRegionID() {
		return regionID;
	}

	/**
	 * @param regionID the regionID to set
	 */
	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	/**
	 * @return the longName
	 */
	public String getLongName() {
		return longName;
	}

	/**
	 * @param longName the longName to set
	 */
	public void setLongName(String longName) {
		this.longName = longName;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Destination [regionID=" + regionID + ", longName=" + longName + ", country=" + country + ", province="
				+ province + ", city=" + city + "]";
	}
}
