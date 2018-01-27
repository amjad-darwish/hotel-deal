package com.hotel.deal.log;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.hotel.deal.log.log4j.Log4jLogger;
import com.hotel.deal.log.messages.LogMessage;

/**
 * @author amjad_darwish
 *
 */
@Component
@Qualifier("loggerManager")
public class LoggerManager {
	@Autowired
	@Qualifier("log4jLogger")
	private Log4jLogger LOGGER;
	
	private Set<Logger> loggers;
	
	/**
	 * @param loggers
	 */
	public void setLoggers(Set<Logger> loggers) {
		this.loggers = loggers;
	}
	
	/**
	 * @param logMessage
	 */
	@Async
	public void log(LogMessage logMessage) {
		if(loggers == null || loggers.isEmpty()) {
			LOGGER.log(logMessage);
		} else {
			loggers.stream()
				   .filter(logger -> logger.isLoggeable(logMessage.getLevel()))
				   .forEach(logger -> logger.log(logMessage));
		}
	}
}