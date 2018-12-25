/**
 * 
 */
package com.xmg.p2p.base.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @Description: 用户登陆信息
 * @Author: chenyihong
 * @Date: 2018年12月15日
 */
@Setter
@Getter
public class Logininfo extends BaseDomain{

	public static final int STATE_NORMAL = 0; //正常
	public static final int STATE_LOCK = 1;  //锁定
	
	public static final int USER_MANAGER=0;//后台用户
	public static final int USER_CLIENT=1;//前台用户

	private  Long id;
	private String username;
	private String password;
	private int state;
	
	private int userType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}


}
