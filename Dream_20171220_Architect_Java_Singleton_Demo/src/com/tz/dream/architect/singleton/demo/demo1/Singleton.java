package com.tz.dream.architect.singleton.demo.demo1;

//单例模式->恶汉式
public final class Singleton {
	
	private static Singleton instance = new Singleton();

	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		return instance;
	}
	
}
