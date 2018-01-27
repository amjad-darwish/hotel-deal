package com.hotel.deal.log;
/**
 * 
 */

import com.hotel.deal.log.messages.LogMessage;

/**
 * @author amjad_darwish
 *
 */
public interface Logger {
	public void log(LogMessage logMessage);
	public Level getLevel();
	public boolean isLoggeable(Level level);
}
