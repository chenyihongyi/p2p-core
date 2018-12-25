/**
 * 
 */
package com.xmg.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月15日
 */
@Getter
@Setter
abstract public class BaseDomain {
	protected Long id;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


}
