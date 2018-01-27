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
public class HotelPricingInfo {
	private BigDecimal averagePriceValue;
	private BigDecimal totalPriceValue;
	private BigDecimal originalPricePerNight;
	private BigDecimal hotelTotalBaseRate;
	private BigDecimal hotelTotalTaxesAndFees;
	private BigDecimal hotelTotalMandatoryTaxesAndFees;
	private BigDecimal percentSavings;
	private boolean drr;
	private String currency;
	
	/**
	 * @return the averagePriceValue
	 */
	public BigDecimal getAveragePriceValue() {
		return averagePriceValue;
	}
	
	/**
	 * @param averagePriceValue the averagePriceValue to set
	 */
	public void setAveragePriceValue(BigDecimal averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	/**
	 * @return the totalPriceValue
	 */
	public BigDecimal getTotalPriceValue() {
		return totalPriceValue;
	}

	/**
	 * @param totalPriceValue the totalPriceValue to set
	 */
	public void setTotalPriceValue(BigDecimal totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	/**
	 * @return the originalPricePerNight
	 */
	public BigDecimal getOriginalPricePerNight() {
		return originalPricePerNight;
	}

	/**
	 * @param originalPricePerNight the originalPricePerNight to set
	 */
	public void setOriginalPricePerNight(BigDecimal originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	/**
	 * @return the hotelTotalBaseRate
	 */
	public BigDecimal getHotelTotalBaseRate() {
		return hotelTotalBaseRate;
	}

	/**
	 * @param hotelTotalBaseRate the hotelTotalBaseRate to set
	 */
	public void setHotelTotalBaseRate(BigDecimal hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}

	/**
	 * @return the hotelTotalTaxesAndFees
	 */
	public BigDecimal getHotelTotalTaxesAndFees() {
		return hotelTotalTaxesAndFees;
	}

	/**
	 * @param hotelTotalTaxesAndFees the hotelTotalTaxesAndFees to set
	 */
	public void setHotelTotalTaxesAndFees(BigDecimal hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
	}

	/**
	 * @return the hotelTotalMandatoryTaxesAndFees
	 */
	public BigDecimal getHotelTotalMandatoryTaxesAndFees() {
		return hotelTotalMandatoryTaxesAndFees;
	}

	/**
	 * @param hotelTotalMandatoryTaxesAndFees the hotelTotalMandatoryTaxesAndFees to set
	 */
	public void setHotelTotalMandatoryTaxesAndFees(BigDecimal hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}

	/**
	 * @return the percentSavings
	 */
	public BigDecimal getPercentSavings() {
		return percentSavings;
	}

	/**
	 * @param percentSavings the percentSavings to set
	 */
	public void setPercentSavings(BigDecimal percentSavings) {
		this.percentSavings = percentSavings;
	}

	/**
	 * @return the drr
	 */
	public boolean isDrr() {
		return drr;
	}

	/**
	 * @param drr the drr to set
	 */
	public void setDrr(boolean drr) {
		this.drr = drr;
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HotelPricingInfo [averagePriceValue=" + averagePriceValue + ", totalPriceValue=" + totalPriceValue
				+ ", originalPricePerNight=" + originalPricePerNight + ", hotelTotalBaseRate=" + hotelTotalBaseRate
				+ ", hotelTotalTaxesAndFees=" + hotelTotalTaxesAndFees + ", hotelTotalMandatoryTaxesAndFees="
				+ hotelTotalMandatoryTaxesAndFees + ", percentSavings=" + percentSavings + ", drr=" + drr
				+ ", currency=" + currency + "]";
	}
}
