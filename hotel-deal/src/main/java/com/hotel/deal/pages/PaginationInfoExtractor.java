/**
 * 
 */
package com.hotel.deal.pages;

import javax.servlet.http.HttpServletRequest;

/**
 * @author amjad_darwish
 *
 */
public interface PaginationInfoExtractor {
	void extract(HttpServletRequest request, PaginationInfo paginationInfo, Pageable pageable);
}
