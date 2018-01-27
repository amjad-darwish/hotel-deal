/**
 * 
 */
package com.hotel.deal.pages;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * @author amjad_darwish
 *
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface Pageable {
	RequestType requestType() default RequestType.FORM;
	String pageNoFieldName() default PaginationInfo.PAGE_NO;
	String pageSizeFieldName() default PaginationInfo.PAGE_SIZE;
	int pageNo() default 0;
	int pageSize() default 10;
}
