/**
 * 
 */
package com.hotel.deal.connectors.exceptions;

import org.springframework.http.HttpStatus;

/**
 * @author amjad_darwish
 *
 */
public class HttpConnectorException extends ConnectorException {
	private static final long serialVersionUID = 3245714451131012717L;

	private HttpStatus statusCode;
	
	public HttpConnectorException(HttpStatus status) {
		this.statusCode = status;
	}
	
	public HttpConnectorException(String message, HttpStatus status) {
		super(message);
		
		this.statusCode = status;
	}
	
	public HttpConnectorException(Throwable throwable, HttpStatus status) {
		super(throwable);
		
		this.statusCode = status;
	}
	
	public HttpConnectorException(String message, Throwable throwable, HttpStatus status) {
		super(message, throwable);
		
		this.statusCode = status;
	}
	
	public HttpStatus getStatusCode() {
		return statusCode;
	}
}
