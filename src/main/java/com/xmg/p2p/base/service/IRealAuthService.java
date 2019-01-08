package com.xmg.p2p.base.service;

import com.xmg.p2p.base.domain.RealAuth;
import com.xmg.p2p.base.query.PageResult;
import com.xmg.p2p.base.query.RealAuthQueryObject;

/**
 * 实名认证对象服务
 * @Author Elvis Chen
 * @Date 2019/1/4 21:54
 * @Version 1.0
 **/
public interface IRealAuthService {

    RealAuth get(Long id);

    void apply(RealAuth realAuth);

    PageResult query(RealAuthQueryObject qo);
}
