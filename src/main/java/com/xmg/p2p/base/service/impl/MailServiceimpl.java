/**
 * 
 */
package com.xmg.p2p.base.service.impl;

import java.util.Properties;

import javax.mail.internet.MimeMessage;

import org.aspectj.lang.reflect.CatchClauseSignature;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.xmg.p2p.base.service.IMailService;

/**
 * @Description: 
 * @Author: chenyihong
 * @Date: 2018年12月29日
 */
@Service
public class MailServiceimpl implements IMailService{

	@Value("${mail.host}")
	private String host;

	@Value("${mail.username}")
	private String username;

	@Value("${mail.password}")
	private String password;

	@Override
	public void sendMail(String target, String title, String content) {
		try{
			JavaMailSenderImpl sender = new JavaMailSenderImpl();
			//设置SMTP服务器地址
			sender.setHost(host);
			//创建邮件对象
			MimeMessage message = sender.createMimeMessage();
			//创建邮件助手
			MimeMessageHelper helper=new MimeMessageHelper(message);
			//通过helper设置邮件相关内容
			//设置目标
			helper.setTo(target);
			//设置from
			helper.setFrom("p2p");
			helper.setSubject(title);
			//设置邮件内容
			helper.setText(content,true);


			//设置发送邮件的账号和密码
			sender.setUsername(username);
			sender.setPassword(password);

			//
			Properties prop = new Properties();
			prop.put("mail.smtp.auth", "true");
			prop.put("mail.smtp.timeout", 25000);

			sender.setJavaMailProperties(prop);
			sender.send(message);
		} catch (Exception e){
			e.printStackTrace();
			throw new RuntimeException("发送邮件失败!");
		}
	}

}
