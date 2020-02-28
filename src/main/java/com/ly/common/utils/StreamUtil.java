package com.ly.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	/*
	 * public static List<String> read(InputStream InputStream){ return null;
	 * 
	 * }
	 * 
	 * public static List<String> read(String filePath){ return null;
	 * 
	 * }
	 */
	//读取文件内容放入集合
	public static List<String> read(File file) throws IOException{
		List<String> list = new ArrayList<String>();
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line="";
		while ((line=reader.readLine())!=null) {
			list.add(line);
		}
		
		return list;
	}
}
