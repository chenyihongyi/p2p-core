/**
 * 
 */
package com.xmg.p2p.base.util;

import java.math.BigDecimal;

/**
 * @Description: 系统中的常量
 * @Author: chenyihong
 * @Date: 2018年12月17日
 */
public class BidConst {

	/**
	 * 定义存储精度
	 */
	public static final int STORE_SCALE = 4;

	/**
	 * 定义运算精度
	 */
	public static final int CAL_SCALE = 8;

	/**
	 * 定义显示精度
	 */
	public static final int DISPLAY_SCALE = 2;

	/**
	 * 定义系统级别的0
	 */
	public static final BigDecimal ZERO = new BigDecimal("0.0000");

	/**
	 * 定义初始授信额度
	 */
	public static final BigDecimal INIT_BORROW_LIMIT = new BigDecimal("5000.0000");
	
	/**
	 * 默认管理员的用户名和密码
	 */
	public static final String DEFAULT_ADMIN_NAME="admin";
	public static final String DEFAULT_ADMIN_PASSWORD="1111";
	
	/**
	 * 手机验证码的有效时间
	 */
	public static final int VERIFYCODE_VAILDATE_SECOND=300;
	
	/**
	 * 验证邮箱的有效期
	 */
	public static final int VERIFYEMAIL_VAILDATE_DAY = 5;
	
	/**
	 * 借款达到的最低风控分数
	 */
	public static final int BASE_BORROW_SCORE = 30;
}
