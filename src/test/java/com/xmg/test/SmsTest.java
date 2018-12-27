/**
 * 
 */
package com.xmg.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xmg.p2p.base.service.IVerifyCodeService;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月27日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SmsTest {
	
	@Autowired
	private IVerifyCodeService verifyCodeService;
	
	@Test
	public void testSendSms(){
		
	}

}
