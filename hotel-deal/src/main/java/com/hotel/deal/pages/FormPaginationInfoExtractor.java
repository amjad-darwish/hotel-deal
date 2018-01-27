/**
 * 
 */
package com.hotel.deal.pages;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.hotel.deal.log.Level;
import com.hotel.deal.log.LoggerManager;
import com.hotel.deal.log.factory.LogMessageBuilderFactory;

/**
 * @author amjad_darwish
 *
 */
@Component
public class FormPaginationInfoExtractor implements PaginationInfoExtractor {
	private static final String LOGGER_NAME = FormPaginationInfoExtractor.class.getName();
	
	@Autowired
	private LoggerManager loggerManager; 
	
	/**
	 * 
	 */
	@Override
	public void extract(HttpServletRequest request, PaginationInfo paginationInfo, Pageable pageable) {
		try {
			if(!StringUtils.isEmpty(request.getParameter(pageable.pageNoFieldName()))) {				
				paginationInfo.setPageNo(Integer.valueOf(request.getParameter(pageable.pageNoFieldName())));
			} else {
				loggerManager.log(
						LogMessageBuilderFactory.newDefaultLogMessageBuilder()
												.setLoggerName(LOGGER_NAME)
												.addMessage("PageNo is Not provided, default value will be used!")
												.build(Level.INFO));
				
				paginationInfo.setPageNo(pageable.pageNo());
			}
			
			if(!StringUtils.isEmpty(request.getParameter(pageable.pageSizeFieldName()))) {				
				paginationInfo.setPageSize(Integer.valueOf(request.getParameter(pageable.pageSizeFieldName())));
			} else {
				loggerManager.log(
						LogMessageBuilderFactory.newDefaultLogMessageBuilder()
												.setLoggerName(LOGGER_NAME)
												.addMessage("PageSize is Not provided, default value will be used!")
												.build(Level.INFO));
				
				paginationInfo.setPageSize(pageable.pageSize());
			}
		} catch (Exception e) {
			loggerManager.log(
					LogMessageBuilderFactory.newDefaultLogMessageBuilder()
											.setLoggerName(LOGGER_NAME)
											.addMessage("An error occured while trying to extract pagination info!")
											.addMessage("Default values will be used!")
											.setThrowable(e)
											.build(Level.ERROR));
			
			paginationInfo.setPageNo(pageable.pageNo());
			paginationInfo.setPageSize(pageable.pageSize());
		}
	}
}
