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

	/**
	 * 绑定手机号
	 * @param phoneNumber
	 * @param verifyCode
	 */
	void bindPhone(String phoneNumber, String verifyCode);

	/**
	 * 发送绑定邮箱邮件
	 * @param email
	 */
	void sendVerifyEmail(String email);
	
	/**
	 * 得到当前的userinfo对象
	 * @return
	 */
	Userinfo getCurrent();

	/**
	 * 执行邮箱绑定
	 * @param uuid
	 */
	void bindEmail(String uuid);
}
