/**
 * 
 */
package com.xmg.p2p.base.service;

import com.xmg.p2p.base.domain.Userinfo;

/**
 * @Description: 用户相关信息服务
 * @Author: chenyihong
 * @Date: 2018年12月18日
 */
public interface IUserinfoService {

	/**
	 * 乐观锁支持
	 * @param iserinfo
	 */
	void update(Userinfo iserinfo);

	/**
	 * 添加userinfo
	 * @param ui
	 */
	void add(Userinfo ui);

	/**
	 * @param id
	 * @return
	 */
	Userinfo get(Long id);
}
