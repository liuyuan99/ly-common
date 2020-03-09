package com.ly.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		int i = NumberUtil.getPercent(51, 68);
		System.out.println(i);
	}

}
