package com.ly.common.utils;

import java.io.FileNotFoundException;

import org.junit.Test;

public class StringUtilTest {
	@Test
	public void getPlaceholderValue() {
		String src="http://news.cnstock.com/news,yw-201908-4413224.htm";
		String regex="^\\d{7}+\\.+[a-z]+$";
		String placeholderValue = StringUtil.getPlaceholderValue(src, regex);
		System.out.println(placeholderValue);
	}
	@Test
	public void testValue() {
		String value = StringUtil.getValue("八维教育", 2);
		/* int x=1/0; */
		System.out.println(value);
	}
	
	@Test
	public void testNum() {
		boolean b = StringUtil.isNum("123");
		System.out.println(b);
	}
	
	@Test
	public void testEmail() {
		boolean b = StringUtil.isEmail("805764579@qq.com");
		System.out.println(b);
	}
	@Test
	public void testPhone() {
		boolean b = StringUtil.isPhone("19710137879");
		System.out.println(b);
	}
	@Test
	public void testHasLength() {
		String str = "";
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}

	@Test
	public void testHasText() {
		String str = "";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
	}

	@Test
	public void testRandomChineseString() {
		String c = StringUtil.randomChineseString(100);
		System.out.println(c);
	}

	@Test
	public void testGenerateChineseName() {		
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
