/**
 * 
 */
package com.xmg.p2p.base.service;

/**
 * @Description: 发送邮件的服务
 * @Author: chenyihong
 * @Date: 2018年12月29日
 */
public interface IMailService {

	/**
	 * 发送邮件
	 * @param target 目标邮件地址
	 * @param title
	 * @param content
	 */
	void sendMail(String target, String title, String content);
}
