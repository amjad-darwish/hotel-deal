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
public class Persona {
	private String personaType;

	/**
	 * @return the personaType
	 */
	public String getPersonaType() {
		return personaType;
	}

	/**
	 * @param personaType the personaType to set
	 */
	public void setPersonaType(String personaType) {
		this.personaType = personaType;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [personaType=" + personaType + "]";
	}
}
