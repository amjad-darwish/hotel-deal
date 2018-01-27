/**
 * 
 */
package com.hotel.deal.connectors;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

import com.hotel.deal.connectors.config.ConnectorConfig;
import com.hotel.deal.connectors.config.HttpRestConnectorConfig;
import com.hotel.deal.connectors.exceptions.ConnectorException;
import com.hotel.deal.connectors.exceptions.HttpConnectorException;
import com.hotel.deal.log.Level;
import com.hotel.deal.log.LoggerManager;
import com.hotel.deal.log.factory.LogMessageBuilderFactory;

/**
 * @author amjad_darwish
 *
 */
@Component
@Qualifier("httpRestConnector")
public class HttpRestConnector implements Connector {
	private static final String LOGGER_NAME = HttpRestConnector.class.getName();
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoggerManager loggerManager;

	/**
	 * @param restTemplate
	 */
	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/**
	 * @param loggerManager
	 */
	public void setLoggerManager(LoggerManager loggerManager) {
		this.loggerManager = loggerManager;
	}
	
	/**
	 */
	@Override
	public <RES> RES send(ConnectorConfig config, Class<RES> responseType) throws ConnectorException {
		if(!(config instanceof HttpRestConnectorConfig)) {
			throw new IllegalArgumentException("config is NOT Http Rest Connector Config!");
		}
		
		String uuid = UUID.randomUUID().toString();
		
		try {
			HttpRestConnectorConfig restConfig = (HttpRestConnectorConfig) config;
			
			String url = restConfig.getFullURL();
			
			loggerManager.log(
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setLoggerName(LOGGER_NAME)
											.addMessage("Transaction Id: " + uuid)
											.addMessage("Http Connector URL: " + url)
											.addMessage("Http Method: " + restConfig.getMethod())
											.addMessage("Http Request: " + restConfig.getRequest())
											.build(Level.INFO));
			
			ResponseEntity<RES> responseEntity = 
					restTemplate.exchange(url, getHttpMethod(restConfig.getMethod()), 
										  new HttpEntity<Object>(restConfig.getRequest()), 
										  responseType);
			
			loggerManager.log(
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setLoggerName(LOGGER_NAME)
											.addMessage("Transaction Id: " + uuid)
											.addMessage("Http status: " + responseEntity.getStatusCode())
											.addMessage("Http Response: " + responseEntity.getBody())
											.build(Level.INFO));
			
			if(responseEntity.getStatusCode() == HttpStatus.OK) {
				if(responseEntity.hasBody()) {
					return responseEntity.getBody();
				} 
			} else {
				throw new HttpConnectorException("http status code: " + responseEntity.getStatusCode(), responseEntity.getStatusCode());
			}
			
			return null;
		} catch (HttpConnectorException e) {
			loggerManager.log(
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setLoggerName(LOGGER_NAME)
											.addMessage("Transaction Id: " + uuid)
											.addMessage("http status code: " + e.getStatusCode())
											.setThrowable(e)
											.build(Level.ERROR));
			
			throw e;
		} catch (HttpClientErrorException|HttpServerErrorException e) {
			loggerManager.log(
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setLoggerName(LOGGER_NAME)
											.addMessage("Transaction Id: " + uuid)
											.addMessage("http status code: " + e.getStatusCode())
											.setThrowable(e)
											.build(Level.ERROR));
			
			throw new HttpConnectorException("http status code: " + e.getStatusCode(), e.getStatusCode());
		} catch (Exception e) {
			loggerManager.log(
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setLoggerName(LOGGER_NAME)
											.addMessage("Transaction Id: " + uuid)
											.setThrowable(e)
											.build(Level.ERROR));
			
			throw new ConnectorException("An error occured while calling backend!");
		}
	}

	private HttpMethod getHttpMethod(com.hotel.deal.connectors.config.HttpRestConnectorConfig.HttpMethod method) {
		switch (method) {
		case GET:
			return HttpMethod.GET;
		default:
			return HttpMethod.GET;
		}		
	}
}