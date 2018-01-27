/**
 * 
 */
package com.hotel.deal.connectors.exceptions;

import java.io.IOException;

/**
 * @author amjad_darwish
 *
 */
public class ConnectorException extends IOException {
	private static final long serialVersionUID = -246801357466277610L;

	public ConnectorException() {
	}
	
	public ConnectorException(String message) {
		super(message);
	}
	
	public ConnectorException(Throwable throwable) {
		super(throwable);
	}
	
	public ConnectorException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
