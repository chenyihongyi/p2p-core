/**
 * 
 */
package com.xmg.p2p.base.util;

/**
 * @Description: 用户状态类，记录用户在平台使用系统中的状态
 * @Author: chenyihong
 * @Date: 2018年12月27日
 */
public class BitStatesUtils {
	
	public final static Long OP_BIND_PHONE = 1L; //用户绑定实际状态码
	public final static Long OP_BIND_EMAIL = 1L <<0; //用户绑定邮箱状态码
	public final static Long OP_BASIC_INFO = 1L <<2; //用户是否填写基本资料
	public final static Long OP_READ_AUTH = 1L <<3; //用户是否实名认证
	public final static Long OP_VEDIO_AUTH = 1L <<4; //用户是否视频认证
	
	/**
	 * 
	 * @param states 所有状态值
	 * @param value 需要判断状态值
	 * @return  是否存在
	 */
	public static boolean hasState(long states, long value){
		return (states & value) !=0;
	}
	
	/**
	 * 
	 * @param states 已有状态值
	 * @param value  需要添加状态值 
	 * @return 新的状态值
	 */
	public static long addState(long states, long value){
		if(hasState(states, value)){
			return states;
		}
		return (states | value);
	}

	/**
	 * 
	 * @param states 已有状态值
	 * @param value 需要删除状态值
	 * @return 新的状态值
	 */
	public static long removeState(long states, long value){
		if(!hasState(states,value)) {
			return states;
		}
		return states ^ value;
	}
	
	
	
	
}
