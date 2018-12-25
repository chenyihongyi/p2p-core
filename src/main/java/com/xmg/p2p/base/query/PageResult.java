/**
 * 
 */
package com.xmg.p2p.base.query;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月19日
 */

public class PageResult {

	private List listData;
	private Integer totalCount;
	private Integer currentPage = 1;
	private Integer pageSize = 10;
	private Integer prevPage;
	private Integer nextPage;
	private Integer totalPage;

	public static PageResult empty(Integer pageSize){
		return new PageResult(new ArrayList<>(), 0, 1, pageSize);
	}

	public PageResult(List listData, Integer totalCount, Integer currentPage, Integer pageSize) {
		this.listData = listData;
		this.totalCount = totalCount;
		this.currentPage = currentPage;

		//计算数据
		this.totalPage = this.totalCount % this.pageSize == 0 ? this.totalCount
				/ this.pageSize :  this.totalCount/ this.pageSize + 1 ;

		this.prevPage = this.currentPage - 1 >= 1 ? this.currentPage -1 :1 ;
		this.nextPage = this.currentPage + 1 <= this.totalPage ? this.currentPage + 1 : this.totalPage;
		
		
	}

	public List getListData() {
		return listData;
	}

	public void setListData(List listData) {
		this.listData = listData;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public Integer getPrevPage() {
		return prevPage;
	}

	public void setPrevPage(Integer prevPage) {
		this.prevPage = prevPage;
	}

	public Integer getNextPage() {
		return nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
}