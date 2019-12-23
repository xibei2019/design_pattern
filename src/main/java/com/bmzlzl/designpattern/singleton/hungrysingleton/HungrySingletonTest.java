package com.bmzlzl.designpattern.singleton.hungrysingleton;


/**
 * 恶汉模式
 * <p>
 * 类加载的初始化阶段就完成了实例的实例化。本质上就是借用jvm类加载机制，保证实例的唯一性。
 * 类加载过程：
 * 1、加载二进制数据到内存中，生成对应的Class数据结构。
 * 2、连接：a验证、b准备（给类的静态成员变量赋 默认值）、c解析。
 * 3、初始化：给类的静态变量赋初值。
 * <p>
 * 只有在真正使用对应的类时，才会触发初始化，如（当前是启动类即main函数所在类、直接进行new操作、访问静态属性、访问静态方法、用反射访问类、初始化一个类的子类等）
 * </p>
 *
 * @author jagger
 * @create 2019-12-23 14:54
 **/
public class HungrySingletonTest {
    public static void main(String[] args) {
        System.out.println(HungrySingleton.getInstance());
        System.out.println(HungrySingleton.getInstance());
    }
}

class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
        // 防止反编译进行初始化
        if (instance != null) {
            throw new RuntimeException("单例不允许多个实例");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

}