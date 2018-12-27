package com.xmg.p2p.base.service.impl;

import com.xmg.p2p.base.service.IVerifyCodeService;
import com.xmg.p2p.base.util.DateUtil;
import com.xmg.p2p.base.util.UserContext;
import com.xmg.p2p.base.vo.VerifyCodeVO;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Service;

/**
 * @Author Elvis Chen
 * @Date 2018/12/27 17:21
 * @Version 1.0
 **/
@Service
public class VerifyCodeServiceImpl implements IVerifyCodeService {

    @Override
    public void sendVerifyCode(String phoneNumber) {

        VerifyCodeVO vc = UserContext.getCurrentVerifyCode();
        if (vc == null || DateUtil.secondsBetween(new Date(), vc.getLastSendTime()) > 90) {
            String verifyCode = UUID.randomUUID().toString().substring(0, 4);
            System.out.println("给手机"+phoneNumber + "发送验证码:"+verifyCode);
        vc = new VerifyCodeVO();
        vc.setLastSendTime(new Date());
        vc.setPhoneNumber(phoneNumber);
        vc.setVerifyCode(verifyCode);
        UserContext.putVerifyCode(vc);
        } else {
            throw new RuntimeException("发送过于频繁!");
        }
    }
}
