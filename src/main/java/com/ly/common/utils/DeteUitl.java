package com.ly.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DeteUitl 
 * @Description: TODO
 * @author: 刘媛
 * @date: 2020年2月28日 上午8:58:57
 */
public class DeteUitl {
	/**
	 * 
	 * @Title: getEndMonth 
	 * @Description: TODO
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getEndMonth(Date date){
		//获取日历
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//让月份+1,再变成月初-1
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	
	}
	/**
	 * 
	 * @Title: getInitMonth 
	 * @Description: TODO
	 * @param date
	 * @return
	 * @return: Date
	 */
	public static Date getInitMonth(Date date){
		//获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH,1);//月
		c.set(Calendar.HOUR_OF_DAY, 0);//小时
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date min,Date max) {
		//获取最小日期的毫秒数
		long t1 = min.getTime();
		long t2 = max.getTime();
		if(t1>t2){
			return null;
		}
		double d = Math.random(); //返回0-1之间的值
		long x = (long)(d*(t2-t1+1)+t1);
		
		return new Date(x);
	}
}
