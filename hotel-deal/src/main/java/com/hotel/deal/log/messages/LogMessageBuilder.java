package com.hotel.deal.log.messages;
/**
 * 
 */

import com.hotel.deal.log.Level;

/**
 * @author amjad_darwish
 *
 */
public abstract class LogMessageBuilder {
	LogMessage logMessage;
	
	LogMessageBuilder(LogMessage logMessage) {
		this.logMessage = logMessage;
	}
	
	/**
	 * @param logMessageBuilder
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private <T> T cast(LogMessageBuilder logMessageBuilder) {
		return (T) logMessageBuilder;
	}
	
	public <T extends LogMessageBuilder> T setCode(String code) {
		logMessage.setCode(code);
		
		return cast(this);
	}

	public <T extends LogMessageBuilder> T addMessage(Object message) {
		logMessage.getMessages().add(message);
		
		return cast(this);
	}
	
	public <T extends LogMessageBuilder> T setLoggerName(String loggerName) {
		logMessage.setLoggerName(loggerName);
		
		return cast(this);
	}
	
	public <T extends LogMessageBuilder> T setThrowable(Throwable t) {
		logMessage.setThrowable(t);
		
		return cast(this);
	}
	
	public LogMessage build(Level level) {
		logMessage.setLevel(level);
		
		return logMessage;
	}
}
