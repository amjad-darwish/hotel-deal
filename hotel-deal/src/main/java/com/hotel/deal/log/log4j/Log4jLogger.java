/**
 * 
 */
package com.hotel.deal.log.log4j;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.hotel.deal.log.Level;
import com.hotel.deal.log.Logger;
import com.hotel.deal.log.messages.LogMessage;

/**
 * @author amjad_darwish
 *
 */
@Component
@Qualifier("log4jLogger")
public class Log4jLogger implements Logger {
	private Level minLevel = Level.INFO;
	
	/**
	 * 
	 * @param minLevel
	 */
	public void setMinLevel(Level minLevel) {
		this.minLevel = minLevel;
	}

	/**
	 * @see com.hotel.deal.log.Logger#log(com.hotel.deal.log.messages.LogMessage)
	 */
	@Override
	public void log(LogMessage logMessage) {
		org.slf4j.Logger logger = LoggerFactory.getLogger(logMessage.getLoggerName());
		
		String message = logMessage.getCode();
		
		if(message != null) {
			message += " ";
		} else {
			message = "";
		}
		
		message += logMessage.getMessages();
		
		switch (logMessage.getLevel()) {
		case DEBUG:
			logger.debug(message);
			break;
		case ERROR:
		case FATAL:
			logger.error(message, logMessage.getThrowable());
			break;
		case WARN:
			logger.warn(message, logMessage.getThrowable());
			break;
		case INFO:
			logger.info(message, logMessage.getThrowable());
			break;
		case TRACE:
			logger.trace(message, logMessage.getThrowable());
			break;
		}
	}

	/**
	 * @see com.hotel.deal.log.Logger#getLevel()
	 */
	@Override
	public Level getLevel() {
		return minLevel;
	}

	/**
	 * @see com.hotel.deal.log.Logger#isLoggeable(com.hotel.deal.log.Level)
	 */
	@Override
	public boolean isLoggeable(Level level) {
		// level.ordinal >= minLevel.ordinal();
		return minLevel.compareTo(level) < 0 ;
	}
}
