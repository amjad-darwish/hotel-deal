/**
 * 
 */
package com.hotel.deal.pages;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author amjad_darwish
 *
 */
@Component
@Aspect
public class PaginationInterceptor {
	@Pointcut(value="@annotation(pageable)", argNames = "pageable")
	public void paggeableAnotationPointCut(Pageable pageable){};
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private PaginationInfoExtractorFactory factory;
	
	@Before(value = "paggeableAnotationPointCut(pageable)")
	public void intercept(Pageable pageable) {
		HttpServletRequest request = 
				((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		
		PaginationInfo paginationInfo = applicationContext.getBean(PaginationInfo.class);
		
		factory.getExtractor(pageable.requestType()).extract(request, paginationInfo, pageable);
	}
}
