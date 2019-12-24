package com.bmzlzl.designpattern.decorator;

/**
 * 实体煎饼果子类，实体煎饼果子继承了抽象煎饼果子类
 *
 * @author jagger
 * @create 2019-12-24 18:49
 **/
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
