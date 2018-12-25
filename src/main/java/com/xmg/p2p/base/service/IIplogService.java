/**
 * 
 */
package com.xmg.p2p.base.service;

import com.xmg.p2p.base.query.IplogQueryObject;
import com.xmg.p2p.base.query.PageResult;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月19日
 */
public interface IIplogService {
	
	/**
	 * 分页查询
	 * @param qo
	 * @return
	 */
	PageResult query(IplogQueryObject qo);

}
