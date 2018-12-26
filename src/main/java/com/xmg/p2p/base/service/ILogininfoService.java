/**
 * 
 */
package com.xmg.p2p.base.service;

import com.xmg.p2p.base.domain.Logininfo;

/**
 * @Description: 登陆相关服务
 * @Author: chenyihong
 * @Date: 2018年12月15日
 */
public interface ILogininfoService {
	/**
	 * 用户注册
	 * @param username
	 * @param password
	 */
	void register(String username, String password);

	boolean checkUsername(String username);
	
	Logininfo login(String username, String password, String ip, int userType);

	/**
	 * 初始化第一个管理员
	 */
	void initAdmin();
}
