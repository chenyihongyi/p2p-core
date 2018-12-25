/**
 * 
 */
package com.xmg.p2p.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmg.p2p.base.domain.Account;
import com.xmg.p2p.base.mapper.AccountMapper;
import com.xmg.p2p.base.service.IAccountService;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月18日
 */
@Service
public class AccountServiceImpl implements IAccountService{

	@Autowired
	private AccountMapper accountMapper;

	@Override
	public void update(Account account) {
		int ret = this.accountMapper.updateByPrimaryKey(account);
		if(ret == 0){
			throw new RuntimeException("乐观锁失败, Account:"+account.getId());
		}

	}

	@Override
	public void add(Account account) {
		this.accountMapper.insert(account);
	}

	@Override
	public Account get(Long id) {
		return this.accountMapper.selectByPrimaryKey(id);
	}

}
