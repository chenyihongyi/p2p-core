/**
 * 
 */
package com.xmg.p2p.base.util;


import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

/**
 * @Description: 得到一天的最后一秒
 * @Author: chenyihong
 * @Date: 2018年12月19日
 */
public class DateUtil {

	public static Date endOfDay(Date d){
		return DateUtils.addSeconds(DateUtils.addDays(DateUtils.truncate(d, Calendar.DATE), 1),-1);
	}
}
