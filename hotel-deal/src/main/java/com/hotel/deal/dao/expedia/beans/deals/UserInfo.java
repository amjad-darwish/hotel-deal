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
public class UserInfo {
	private String userId;
	private Persona persona;
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}
	
	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", persona=" + persona + "]";
	}
}
