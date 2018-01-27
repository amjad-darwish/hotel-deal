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
public class HotelScores {
	private BigDecimal rawAppealScore;
	private BigDecimal movingAverageScore;
	
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HotelScores [rawAppealScore=" + rawAppealScore + ", movingAverageScore=" + movingAverageScore + "]";
	}
}
