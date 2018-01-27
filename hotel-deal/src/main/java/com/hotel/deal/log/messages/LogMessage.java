package com.hotel.deal.log.messages;
/**
 * 
 */

import java.util.ArrayList;
import java.util.List;

import com.hotel.deal.log.Level;

/**
 * @author amjad_darwish
 *
 */
public abstract class LogMessage {
	private String code;
	private List<Object> messages = new ArrayList<>();
	private String loggerName;
	private Level level;
	private Throwable throwable;
	
	/**
	 * @return
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * 
	 * @param code
	 */
	void setCode(String code) {
		this.code = code;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Object> getMessages() {
		return messages;
	}
	
	/**
	 * 
	 * @param message
	 */
	void setMessage(List<Object> messages) {
		this.messages = messages;
	}
	
	/**
	 * @return the loggerName
	 */
	public String getLoggerName() {
		return loggerName;
	}

	/**
	 * @param loggerName the loggerName to set
	 */
	void setLoggerName(String loggerName) {
		this.loggerName = loggerName;
	}

	/**
	 * 
	 * @return
	 */
	public Level getLevel() {
		return level;
	}
	
	/**
	 * 
	 * @param level
	 */
	void setLevel(Level level) {
		this.level = level;
	}

	/**
	 * @return the throwable
	 */
	public Throwable getThrowable() {
		return throwable;
	}

	/**
	 * @param throwable the throwable to set
	 */
	void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LogMessage [code=" + code + ", messages=" + messages + ", loggerName=" + loggerName + ", level=" + level
				+ ", throwable=" + throwable + "]";
	}
}
