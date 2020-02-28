package com.ly.common.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void test() throws IOException {
		List<String> list = StreamUtil.read(new File("d:\\data.text"));
		for (String string : list) {
			System.out.println(string);
		}
	}

}
