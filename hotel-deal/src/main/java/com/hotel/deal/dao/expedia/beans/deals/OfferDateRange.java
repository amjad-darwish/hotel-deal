/**
 * 
 */
package com.hotel.deal.dao.expedia.beans.deals;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author amjad_darwish
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferDateRange {
	private int[] travelStartDate;
	private int[] travelEndDate;
	private int lengthOfStay;
	
	/**
	 * @return the lengthOfStay
	 */
	public int getLengthOfStay() {
		return lengthOfStay;
	}
	
	/**
	 * @param lengthOfStay the lengthOfStay to set
	 */
	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	/**
	 * @return the travelStartDate
	 */
	public int[] getTravelStartDate() {
		return travelStartDate;
	}

	/**
	 * @param travelStartDate the travelStartDate to set
	 */
	public void setTravelStartDate(int[] travelStartDate) {
		this.travelStartDate = travelStartDate;
	}

	/**
	 * @return the travelEndDate
	 */
	public int[] getTravelEndDate() {
		return travelEndDate;
	}

	/**
	 * @param travelEndDate the travelEndDate to set
	 */
	public void setTravelEndDate(int[] travelEndDate) {
		this.travelEndDate = travelEndDate;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OfferDateRange [travelStartDate=" + Arrays.toString(travelStartDate) + ", travelEndDate="
				+ Arrays.toString(travelEndDate) + ", lengthOfStay=" + lengthOfStay + "]";
	}
}
