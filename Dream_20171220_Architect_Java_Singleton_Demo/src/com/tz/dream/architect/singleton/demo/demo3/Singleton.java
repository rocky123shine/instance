package com.tz.dream.architect.singleton.demo.demo3;

//单例模式->双重检查->折中方案
public final class Singleton {
	
	private static volatile Singleton instance;

	private Singleton(){
		
	}
	
	public static Singleton getInstance(){
		if (instance == null) {
			//同步代码快
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
}
