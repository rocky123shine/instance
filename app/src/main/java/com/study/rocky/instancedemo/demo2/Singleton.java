package com.study.rocky.instancedemo.demo2;

/**
 * Created by Administrator on 2018/3/22 0022.
 * 单利模式 恶汉式
 * <p>
 * 恶汉式 的特点是 上来就给 不管是否需要
 */

public class Singleton {

    //这种实例化的方式  内存消耗
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        //直接实例化  不会出现为空的情况
        return instance;
    }

}


