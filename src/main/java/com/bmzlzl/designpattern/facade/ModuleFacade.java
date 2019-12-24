package com.bmzlzl.designpattern.facade;

/**
 * 下面这些是A、B、C模块对子系统外部提供的方法
 *
 * @author jagger
 * @create 2019-12-24 17:03
 **/
public class ModuleFacade {

    ModuleA a = new ModuleA();
    ModuleB b = new ModuleB();
    ModuleC c = new ModuleC();

    public void testA() {
        a.testA();
    }

    public void testB() {
        b.testB();
    }

    public void testC() {
        c.testC();
    }
}