package com.tz.dream.architect.singleton.demo.demo2;

//单例模式->懒汉式->单线程
public final class Singleton {
	
	private static Singleton instance;

	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
