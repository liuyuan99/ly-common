package com.ly.common.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;


import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testRead() throws IOException {
		List<String> list = StreamUtil.read(new File("d:\\data.text"));
		for (String string : list) {
			System.out.println(string);
		}
	}

	/*
	 * @RunWith(SpringJUnit4ClassRunner.class)
	 * 
	 * @ContextConfiguration(locations = "classpath:spring-beans.xml") public class
	 * NewsServiceImplTest {
	 * 
	 * @Resource private NewsService service;
	 * 
	 * //添加
	 * 
	 * @Test public void test() throws IOException, ParseException { List<News> news
	 * = new ArrayList<News>(); List<String> list2 =
	 * StreamUtil.read(this.getClass().getResourceAsStream("/news.txt")); for
	 * (String str : list2) { News ne = new News(); String[] n = str.split("|");
	 * String id1 = StringUtil.getPlaceholderValue("445444565", "2"); // 判断是否为数字
	 * if(StringUtil.isNum(id1)) { ne.setId(Integer.valueOf(id1)); } //标题 判断是否有值
	 * String title1 = n[0]; if(StringUtil.hasText(title1)) { ne.setTitle(n[0]); }
	 * //链接 ne.setUrl(n[1]);
	 * 
	 * String score1 = n[2]; //权重 判断是否为数字 if(StringUtil.isNum(score1)) {
	 * ne.setId(Integer.valueOf(n[2])); } //发布时间 //判断是否有值
	 * 
	 * String created1 = n[3]; if(StringUtil.hasText(created1)) {
	 * 
	 * SimpleDateFormat df = new SimpleDateFormat(created1); Date sDate =
	 * df.parse(n[3].substring(0, n[3].length()-1));
	 * 
	 * ne.setCreated(n[3]); }
	 * 
	 * news.add(ne); } service.insert(news); }
	 * 
	 * }
	 */

}
