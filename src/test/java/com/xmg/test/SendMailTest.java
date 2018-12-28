/**
 * 
 */
package com.xmg.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xmg.p2p.base.service.IMailService;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月29日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SendMailTest {
	
	@Autowired
	private IMailService mailService;
	
	@Test
	public void testSend(){
		mailService.sendMail("stef@elvis.com", "你在XMGp2p上的验证邮箱邮件", "点击<a href='xxx.do'>这里</a>完成邮箱验证!");
	}

}
