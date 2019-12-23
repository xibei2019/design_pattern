package com.bmzlzl.designpattern.lazysingleton;

/**
 * 懒汉模式
 * <p>
 * 延迟加载，只有真正使用的时候才开始实例化
 * 1、线程安全问题
 * 2、double check加锁优化
 * 3、编译器（JIT）,CPU有可能对指令进行重排序、导致使用到尚未初始化的实例，可以通过添加volatile关键字进行修饰，对于volatile修饰的字段，可以防止指令重排。
 * </p>
 *
 * @author jagger
 * @create 2019-12-23 14:50
 **/
public class LazySingletonTest {

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }
}

class LazySingleton {
    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}