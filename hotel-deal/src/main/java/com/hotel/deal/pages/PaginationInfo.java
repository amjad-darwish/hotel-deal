/**
 * 
 */
package com.hotel.deal.pages;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author amjad_darwish
 *
 */
@Component
@Scope("request")
public class PaginationInfo {
	public static final String PAGE_NO = "pageNo";
	public static final String PAGE_SIZE = "pageSize";
	
	private Integer pageNo;
	private Integer pageSize;
	
	/**
	 * @return the pageNo
	 */
	public Integer getPageNo() {
		return pageNo;
	}
	
	/**
	 * @param pageNo the pageNo to set
	 */
	public void setPageNo(Integer pageNo) {
		if(pageNo >= 0) {
			this.pageNo = pageNo;
		}
	}
	
	/**
	 * @return the pageSize
	 */
	public Integer getPageSize() {
		return pageSize;
	}
	
	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(Integer pageSize) {
		if(pageSize > 0) {
			this.pageSize = pageSize;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaginationInfo [pageNo=" + pageNo + ", pageSize=" + pageSize + "]";
	}
}
