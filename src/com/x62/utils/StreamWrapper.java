package com.x62.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 流包装
 * 
 * @author GSXL
 *
 */
public class StreamWrapper
{
	public void wrap() throws Exception
	{
		InputStream is=null;
		BufferedReader reader=new BufferedReader(new InputStreamReader(is));
		reader.readLine();

	}
}