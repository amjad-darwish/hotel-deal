/**
 * 
 */
package com.hotel.deal.connectors.config;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author amjad_darwish
 *
 */
public class HttpRestConnectorConfig extends ConnectorConfig {
	public enum HttpMethod {GET};
	
	private HttpMethod method;
	private String contextRoot;
	private String uri;
	private Object request;
	private Map<String, List<String>> urlParameters;
	private Map<String, List<String>> headers;
	
	/**
	 * @return the contextRoot
	 */
	public String getContextRoot() {
		return contextRoot;
	}
	
	/**
	 * @param contextRoot the contextRoot to set
	 */
	public void setContextRoot(String contextRoot) {
		this.contextRoot = contextRoot;
	}

	/**
	 * @return the method
	 */
	public HttpMethod getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(HttpMethod method) {
		this.method = method;
	}

	/**
	 * @return the uri
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * @param uri the uri to set
	 */
	public void setUri(String uri) {
		this.uri = uri;
	}

	/**
	 * @return the request
	 */
	public Object getRequest() {
		return request;
	}

	/**
	 * @param request the request to set
	 */
	public void setRequest(Object request) {
		this.request = request;
	}

	/**
	 * @return the headers
	 */
	public Map<String, List<String>> getHeaders() {
		return headers;
	}

	/**
	 * @param headers the headers to set
	 */
	public void setHeaders(Map<String, List<String>> headers) {
		this.headers = headers;
	}
	
	/**
	 * @param name
	 * 
	 * @param value
	 */
	public void addUrlParameter(String name, String value) {
		if(urlParameters == null) {
			urlParameters = new HashMap<>();
		}
		
		if(urlParameters.get(name) == null) {
			urlParameters.put(name, new ArrayList<>());
		}
		
		urlParameters.get(name).add(value);
	}
	
	/**
	 * @return
	 */
	public Map<String, List<String>> getUrlParameters() {
		return Collections.unmodifiableMap(urlParameters);
	}

	/**
	 * @return
	 */
	public String getFullURL() {
		String url = getHost();
		
		if(getPort() > -1) {
			url += ":" + getPort();
		}
		
		url += "/" + getContextRoot() + "/" + getUri();
		
		url = url.replaceAll("//", "/");
		
		url = getProtocol() + "://" + url;
		
		if(urlParameters != null) {
			url += "?";
			
			for(Entry<String, List<String>> entry: urlParameters.entrySet()) {
				for(String value: entry.getValue()) {
					url += entry.getKey() + "=" + value + "&";
				}
			}
		}
		
		return url.substring(0, url.length()-1);
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HttpConnectorConfig [method=" + method + ", contextRoot=" + contextRoot + ", uri=" + uri
				+ ", parameters=" + request + ", headers=" + headers + ", toString()=" + super.toString() + "]";
	}
}
