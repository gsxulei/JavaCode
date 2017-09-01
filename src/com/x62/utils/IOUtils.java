package com.x62.utils;

import java.io.Closeable;
import java.io.Flushable;

/**
 * IO工具
 * 
 * @author 徐雷
 * @since 2017-08-16
 * 
 */
public class IOUtils
{
	/**
	 * 关闭流
	 * 
	 * @param closeables
	 */
	public static void close(Closeable...closeables)
	{
		if(closeables==null)
		{
			return;
		}

		for(Closeable closeable:closeables)
		{
			if(closeable==null)
			{
				continue;
			}

			try
			{
				if(closeable instanceof Flushable)
				{
					((Flushable)closeable).flush();
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

			try
			{
				closeable.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}