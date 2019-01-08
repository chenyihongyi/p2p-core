package com.xmg.p2p.base.service.impl;

import com.xmg.p2p.base.domain.RealAuth;
import com.xmg.p2p.base.domain.Userinfo;
import com.xmg.p2p.base.mapper.RealAuthMapper;
import com.xmg.p2p.base.query.PageResult;
import com.xmg.p2p.base.query.RealAuthQueryObject;
import com.xmg.p2p.base.service.IRealAuthService;
import com.xmg.p2p.base.service.IUserinfoService;
import com.xmg.p2p.base.util.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author Elvis Chen
 * @Date 2019/1/4 21:56
 * @Version 1.0
 **/
@Service
public class RealAuthServiceImpl implements IRealAuthService{

    @Autowired
    private RealAuthMapper realAuthMapper;

    @Autowired
    private IUserinfoService userinfoService;

    @Override
    public RealAuth get(Long id) {
        return realAuthMapper.selectByPrimaryKey(id);
    }

	@Override
	public void apply(RealAuth realAuth) {
        Userinfo current = this.userinfoService.getCurrent();
        if(!current.getIsRealAuth() && current.getRealAuthId() ==null){
            realAuth.setState(RealAuth.STATE_NORMAL);
            realAuth.setApplier(UserContext.getCurrent());
            realAuth.setApplyTime(new Date());
            this.realAuthMapper.insert(realAuth);
            current.setRealAuthId(realAuth.getId());
            this.userinfoService.update(current);
        }
		
	}

	@Override
	public PageResult query(RealAuthQueryObject qo) {
		int count=this.realAuthMapper.queryForCount(qo);
		if(count > 0) {
		    List<RealAuth> list = this.realAuthMapper.query(qo);
		    return new PageResult(list, count, qo.getCurrentPage(), qo.getPageSize());
        }
        return PageResult.empty(qo.getPageSize());
	}
}
