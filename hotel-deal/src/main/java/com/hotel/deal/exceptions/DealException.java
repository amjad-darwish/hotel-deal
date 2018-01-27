/**
 * 
 */
package com.hotel.deal.exceptions;

/**
 * @author amjad_darwish
 *
 */
public class DealException extends Exception {
	private static final long serialVersionUID = 493940352653778751L;
	
	public DealException() {
	}

	/**
	 * @param e
	 */
	public DealException(Exception e) {
		super(e);
	}
}
