package com.bmzlzl.designpattern.innerclasssingleton;

/**
 * 静态内部类方式
 * <p>
 * 1、本质上是利用类的加载机制来保证线程安全
 * 2、只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一种形式。
 * </p>
 *
 * @author jagger
 * @create 2019-12-23 15:04
 **/
public class InnerClassSingletonTest {
    public static void main(String[] args) {
        System.out.println(InnerClassSingleton.getInstance());
        System.out.println(InnerClassSingleton.getInstance());
    }
}

class InnerClassSingleton {
    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
        // 防止反编译进行初始化
        if (InnerClassHolder.instance != null) {
            throw new RuntimeException("单例不允许多个实例");
        }
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }
}
