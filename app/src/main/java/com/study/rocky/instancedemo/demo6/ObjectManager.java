package com.study.rocky.instancedemo.demo6;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/22 0022.
 */

public class ObjectManager {
    private Map<String,Singleton> map;
    public ObjectManager(){
        map = new HashMap<>();
    }

    public void putObject(String key,Singleton singleton){
        Singleton singleton1 = map.get(key);
        if (singleton1==null) {
            map.put(key,singleton);
        }
    }
}
