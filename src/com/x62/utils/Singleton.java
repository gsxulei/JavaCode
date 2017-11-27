package com.x62.utils;

/**
 * 单例模式<br/>
 * 静态内部类实现方式
 *
 */
public class Singleton
{
	private static class Loader
	{
		private static final Singleton INSTANCE=new Singleton();
	}

	private Singleton()
	{
	}

	public static Singleton getInstance()
	{
		return Loader.INSTANCE;
	}
}