/**
 * 
 */
package com.hotel.deal.connectors.config;

/**
 * @author amjad_darwish
 *
 */
public class ConnectorConfig implements Cloneable {
	private String host;
	private int port = -1;
	private String protocol;
	
	/**
	 * @return the host
	 */
	public String getHost() {
		return host;
	}
	
	/**
	 * @param host the host to set
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}

	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * @return the protocol
	 */
	public String getProtocol() {
		return protocol;
	}

	/**
	 * @param protocol the protocol to set
	 */
	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ConnectorConfig [host=" + host + ", port=" + port + ", protocol=" + protocol + "]";
	}
	
	/**
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
