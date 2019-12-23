package com.bmzlzl.designpattern.singleton.enumsingleton;

/**
 * 枚举方式
 *
 * @author jagger
 * @create 2019-12-23 15:39
 **/
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

enum EnumSingleton {
    INSTANCE
}