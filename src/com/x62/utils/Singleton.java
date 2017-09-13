package com.x62.utils;

public class Singleton
{
	private static class Loader
	{
		private static final Singleton INSTANCE=new Singleton();
	}

	private Singleton()
	{
	}

	public Singleton getInstance()
	{
		return Loader.INSTANCE;
	}
}