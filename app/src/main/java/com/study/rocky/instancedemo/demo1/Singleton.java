package com.study.rocky.instancedemo.demo1;

/**
 * Created by Administrator on 2018/3/22 0022.
 * 单利模式 懒汉式 单线程
 * <p>
 * 懒汉式的特点是 需要才给
 */

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //这样实例化的有点是可以一定层度减少内存开销
        //但是有多线程的问题 并发的时候 创建多个
        if (instance == null) {
            instance = new Singleton();
            //此处是需要的时候才检查 是否有实例化
        }
        return instance;
    }

}


