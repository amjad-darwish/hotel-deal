/**
 * 
 */
package com.hotel.deal.connectors;

import com.hotel.deal.connectors.config.ConnectorConfig;
import com.hotel.deal.connectors.exceptions.ConnectorException;

/**
 * @author amjad_darwish
 *
 */
public interface Connector {
	<RES> RES send(ConnectorConfig config, Class<RES> responseType) throws ConnectorException; 
}
