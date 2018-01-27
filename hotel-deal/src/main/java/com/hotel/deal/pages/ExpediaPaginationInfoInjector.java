/**
 * 
 */
package com.hotel.deal.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.hotel.deal.connectors.config.HttpRestConnectorConfig;

/**
 * @author amjad_darwish
 *
 */
@Component
public class ExpediaPaginationInfoInjector implements PaginationInfoInjector<HttpRestConnectorConfig> {
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public void inject(HttpRestConnectorConfig config) {
		PaginationInfo paginationInfo = applicationContext.getBean(PaginationInfo.class);
		
		config.addUrlParameter("pageNumber", paginationInfo.getPageNo()+"");
		config.addUrlParameter("maxCount", paginationInfo.getPageSize()+"");
	}

}
