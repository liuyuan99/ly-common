package com.ly.common.utils;

public class NumberUtil {

	/**
	 * 
	 * @Title: getPercent 
	 * @Description: 百分比
	 * @param current
	 * @param total
	 * @return
	 * @return: int
	 */
	public static int getPercent(int current,int total) {
		return (int) ((current *1.0 / total)*100);
		
	}
}
