package com.xmg.p2p.base.service;

/**
 * 手机验证码相关服务
 * @Author Elvis Chen
 * @Date 2018/12/27 17:17
 * @Version 1.0
 **/
public interface IVerifyCodeService {

    /**
     * 给指定的手机发送验证码
     * @param phoneNumber
     */
    void sendVerifyCode(String phoneNumber);
}
