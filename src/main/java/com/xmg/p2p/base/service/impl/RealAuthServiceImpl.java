package com.xmg.p2p.base.service.impl;

import com.xmg.p2p.base.domain.RealAuth;
import com.xmg.p2p.base.mapper.RealAuthMapper;
import com.xmg.p2p.base.service.IRealAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Elvis Chen
 * @Date 2019/1/4 21:56
 * @Version 1.0
 **/
@Service
public class RealAuthServiceImpl implements IRealAuthService{

    @Autowired
    private RealAuthMapper realAuthMapper;

    @Override
    public RealAuth get(Long id) {
        return realAuthMapper.selectByPrimaryKey(id);
    }
}
