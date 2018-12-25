/**
 * 
 */
package com.xmg.p2p.base.domain;

/**
 * @Description: 数据字典明细
 * @Author: chenyihong
 * @Date: 2018年12月17日
 */
public class SystemDictionaryItem extends BaseDomain{

	private Long parentId;
	private String title;
	private int sequence;
	
	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	
	
	

}
