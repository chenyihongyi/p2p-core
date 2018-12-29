/**
 * 
 */
package com.xmg.p2p.base.service;

import com.xmg.p2p.base.domain.Account;

/**
 * @Description:账户相关服务 
 * @Author: chenyihong
 * @Date: 2018年12月18日
 */
public interface IAccountService {
	
	/**
	 * 支持乐观锁
	 * @param account
	 */
	void update(Account account);

	/**
	 * @param account
	 */
	void add(Account account);

	/**
	 * @param id
	 * @return
	 */
	Account get(Long id);
	
	/**
	 * 得到当前登陆用户对应的账户信息
	 * @return
	 */
	Account getCurrent();
}
