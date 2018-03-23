package com.study.rocky.instancedemo.demo3;

/**
 * Created by Administrator on 2018/3/22 0022.
 * 单利模式 双重校验 单线程
 * <p>
 * 既保证了单例性 有解决了并发 保证了多线程的安全
 */

public class Singleton {


    //分析编译器编译过程
    //Singleton instance = new Singleton()
    //这句代码的意义是实例化一个对象
    // 那么他的执行顺序是 new 开辟空间（分配内存）（1）--> 调用构造函数 初始化参数（2）-->将instance 对象 指向这块内存空间（3）
    //在jvm 1.5之前 cash 寄存器 顺序可能是 1-2-3  有可能是 1-3-2  区别在于 是不是先初始化数据在指向内存 还是先指向空内存 在初始化
    //此时 为了解决这个问题 引入了volatile 。使用没有进行优化过编译器或者共享内存处理器，正常运行
    //volatile含义：去掉虚拟机优化代码到主内存回写顺序可能会乱序

    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        //第一次检查
        if (instance == null) {
            //同步代码快  枷锁
            synchronized (Singleton.class) {
                //第二次检查
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}


