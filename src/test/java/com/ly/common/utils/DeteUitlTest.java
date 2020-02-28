package com.ly.common.utils;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DeteUitlTest {
	@Test
	public void testEndMonth() {
		Date date = DeteUitl.getEndMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	
	@Test
	public void testInitMonth() {
		//Date date = DeteUitl.getInitMonth(new Date());
		Date date = DeteUitl.getInitMonth(new Date(9999999999991l));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	
	@Test
	public void testRandomDate() {
		//获取日历类
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);//为日历类设置
		Date date = DeteUitl.randomDate(c.getTime(), new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}
	

}
