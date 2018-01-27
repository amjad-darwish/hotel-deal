package com.hotel.deal.log.factory;
/**
 * 
 */

import com.hotel.deal.log.messages.DefaultLogMessageBuilder;

/**
 * @author amjad_darwish
 *
 */
public class LogMessageBuilderFactory {
	public static DefaultLogMessageBuilder newDefaultLogMessageBuilder() {
		return new DefaultLogMessageBuilder();
	}
}
