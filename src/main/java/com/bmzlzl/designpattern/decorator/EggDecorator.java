package com.bmzlzl.designpattern.decorator;

/**
 * 鸡蛋的装饰类，这里注意他的构造器，参数是父类的对象抽象煎饼类对象，这里获取描述和花费方法都是调用了父类的方法。
 * @author jagger
 * @create 2019-12-24 18:50
 **/
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+" 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}