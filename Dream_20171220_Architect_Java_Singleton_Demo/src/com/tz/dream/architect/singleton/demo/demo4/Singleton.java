package com.tz.dream.architect.singleton.demo.demo4;

//单例模式->静态内部类->多线程情况下，使用合理一些->推荐
public final class Singleton {
	
	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return SingletonHolder.singleton;
	}
	
	public static class SingletonHolder {
		private static Singleton singleton = new Singleton();
	}
	
}
