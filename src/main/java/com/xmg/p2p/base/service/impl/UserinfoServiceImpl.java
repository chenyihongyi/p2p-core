/**
 * 
 */
package com.xmg.p2p.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xmg.p2p.base.domain.Userinfo;
import com.xmg.p2p.base.mapper.UserinfoMapper;
import com.xmg.p2p.base.service.IUserinfoService;
import com.xmg.p2p.base.service.IVerifyCodeService;
import com.xmg.p2p.base.util.BitStatesUtils;
import com.xmg.p2p.base.util.UserContext;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月18日
 */
@Service
public class UserinfoServiceImpl implements IUserinfoService{

	@Autowired
	private UserinfoMapper userinfoMapper;
	
	@Autowired
	private IVerifyCodeService verifyCodeService;

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

	@Override
	public void bindPhone(String phoneNumber, String verifyCode) {
	Userinfo current =this.get(UserContext.getCurrent().getId());
		if(!current.getIsBindPhone()){
			//验证验证码合法
			boolean ret = this.verifyCodeService.verify(phoneNumber, verifyCode);
			if(ret){
				current.addState(BitStatesUtils.OP_BIND_PHONE);
				this.update(current);
			} else {
				throw new RuntimeException("绑定手机失败!");
			}
			//如果合法,给用户绑定手机
			//抛出异常
		}
	}

}
