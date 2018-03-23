package com.tz.dream.architect.singleton.demo.demo6;

import java.util.HashMap;
import java.util.Map;

public class ObjectManager {

	private Map<String, Singleton> map;
	
	public ObjectManager(){
		this.map = new HashMap<String, Singleton>();
	}
	
	public void putObject(String key, Singleton value){
		Singleton singleton = this.map.get(key);
		if (singleton == null) {
			this.map.put(key, singleton);
		}
	}
	
}
