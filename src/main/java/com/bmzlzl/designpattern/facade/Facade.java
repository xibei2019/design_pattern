package com.bmzlzl.designpattern.facade;

/**
 * 示意方法，满足客户端需要的功能
 *
 * @author jagger
 * @create 2019-12-24 17:02
 **/
public class Facade {
    public void test() {
        ModuleA a = new ModuleA();
        a.testA();
        ModuleB b = new ModuleB();
        b.testB();
        ModuleC c = new ModuleC();
        c.testC();
    }
}