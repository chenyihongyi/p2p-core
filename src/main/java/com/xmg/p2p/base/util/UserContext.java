/**
 * 
 */
package com.xmg.p2p.base.util;

import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.xmg.p2p.base.domain.Logininfo;

/**
 * @Description:用于存放当前用户的上下文 
 * @Author: chenyihong
 * @Date: 2018年12月16日
 */
public class UserContext {

	public static final String USER_IN_SESSION = "logininfo";


	private static HttpSession getSession(){
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
	}

	public static void putCurrent(Logininfo current){
		getSession().setAttribute(USER_IN_SESSION, current);
	}

	public static Logininfo getCurrent(){
		return (Logininfo) getSession().getAttribute(USER_IN_SESSION);
	}
}
