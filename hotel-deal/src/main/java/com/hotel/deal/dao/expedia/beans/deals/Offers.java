/**
 * 
 */
package com.hotel.deal.dao.expedia.beans.deals;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author amjad_darwish
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Offers {
	@JsonProperty("Hotel")
	private List<Hotel> hotel;

	/**
	 * @return the hotel
	 */
	public List<Hotel> getHotel() {
		return hotel;
	}

	/**
	 * @param hotel the hotel to set
	 */
	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Offer [hotel=" + hotel + "]";
	}
}
