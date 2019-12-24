package com.bmzlzl.designpattern.decorator;

/**
 * 香肠装饰类
 *
 * @author jagger
 * @create 2019-12-24 18:51
 **/
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}