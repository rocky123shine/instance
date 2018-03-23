package com.study.rocky.instancedemo.demo4;

/**
 * Created by Administrator on 2018/3/22 0022.
 * 单利模式 静态内部类
 官方推荐的

 优势：既能够保证内存优化，同时也能够保证安全
 */

public class Singleton {

    private Singleton(){

    }

    public static Singleton getInstance(){
        return SingletonHolder.singleton;
    }

    public static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

}


