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
public class HotelUrgencyInfo {
	private int airAttachRemainingTime;
	private int numberOfPeopleViewing;
	private int numberOfPeopleBooked;
	private int numberOfRoomsLeft;
	private long lastBookedTime;
	private String almostSoldStatus;
	private String link;
	private String[] almostSoldOutRoomTypeInfoCollection;
	private boolean airAttachEnabled;
	
	/**
	 * @return the airAttachEnabled
	 */
	public boolean isAirAttachEnabled() {
		return airAttachEnabled;
	}
	
	/**
	 * @param airAttachEnabled the airAttachEnabled to set
	 */
	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}

	/**
	 * @return the airAttachRemainingTime
	 */
	public int getAirAttachRemainingTime() {
		return airAttachRemainingTime;
	}

	/**
	 * @param airAttachRemainingTime the airAttachRemainingTime to set
	 */
	public void setAirAttachRemainingTime(int airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	/**
	 * @return the numberOfPeopleViewing
	 */
	public int getNumberOfPeopleViewing() {
		return numberOfPeopleViewing;
	}

	/**
	 * @param numberOfPeopleViewing the numberOfPeopleViewing to set
	 */
	public void setNumberOfPeopleViewing(int numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	/**
	 * @return the numberOfPeopleBooked
	 */
	public int getNumberOfPeopleBooked() {
		return numberOfPeopleBooked;
	}

	/**
	 * @param numberOfPeopleBooked the numberOfPeopleBooked to set
	 */
	public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	/**
	 * @return the numberOfRoomsLeft
	 */
	public int getNumberOfRoomsLeft() {
		return numberOfRoomsLeft;
	}

	/**
	 * @param numberOfRoomsLeft the numberOfRoomsLeft to set
	 */
	public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	/**
	 * @return the lastBookedTime
	 */
	public long getLastBookedTime() {
		return lastBookedTime;
	}

	/**
	 * @param lastBookedTime the lastBookedTime to set
	 */
	public void setLastBookedTime(long lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	/**
	 * @return the almostSoldStatus
	 */
	public String getAlmostSoldStatus() {
		return almostSoldStatus;
	}

	/**
	 * @param almostSoldStatus the almostSoldStatus to set
	 */
	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}

	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}

	/**
	 * @return the almostSoldOutRoomTypeInfoCollection
	 */
	public String[] getAlmostSoldOutRoomTypeInfoCollection() {
		return almostSoldOutRoomTypeInfoCollection;
	}

	/**
	 * @param almostSoldOutRoomTypeInfoCollection the almostSoldOutRoomTypeInfoCollection to set
	 */
	public void setAlmostSoldOutRoomTypeInfoCollection(String[] almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HotelUrgencyInfo [airAttachRemainingTime=" + airAttachRemainingTime + ", numberOfPeopleViewing="
				+ numberOfPeopleViewing + ", numberOfPeopleBooked=" + numberOfPeopleBooked + ", numberOfRoomsLeft="
				+ numberOfRoomsLeft + ", lastBookedTime=" + lastBookedTime + ", almostSoldStatus=" + almostSoldStatus
				+ ", link=" + link + ", almostSoldOutRoomTypeInfoCollection="
				+ Arrays.toString(almostSoldOutRoomTypeInfoCollection) + ", airAttachEnabled=" + airAttachEnabled + "]";
	}
}
