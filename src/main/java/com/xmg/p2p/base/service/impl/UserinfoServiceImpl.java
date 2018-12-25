/**
 * 
 */
package com.xmg.p2p.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmg.p2p.base.domain.Userinfo;
import com.xmg.p2p.base.mapper.UserinfoMapper;
import com.xmg.p2p.base.service.IUserinfoService;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月18日
 */
@Service
public class UserinfoServiceImpl implements IUserinfoService{

	@Autowired
	private UserinfoMapper userinfoMapper;

	@Override
	public void update(Userinfo userinfo) {
		int ret = this.userinfoMapper.updateByPrimaryKey(userinfo);
		if(ret == 0){
			throw new RuntimeException("乐观锁失败,Userinfo:"+userinfo.getId());
		}
	}

	@Override
	public void add(Userinfo ui) {
		this.userinfoMapper.insert(ui);
	}

	@Override
	public Userinfo get(Long id) {
		return this.userinfoMapper.selectByPrimaryKey(id);
	}

}
