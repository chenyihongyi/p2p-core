/**
 * 
 */
package com.xmg.p2p.base.query;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月19日
 */
abstract public class QueryObject {

	private Integer currentPage = 1;
	private Integer pageSize = 5;

	public int getStart(){
		return (currentPage -1)*pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}



}
