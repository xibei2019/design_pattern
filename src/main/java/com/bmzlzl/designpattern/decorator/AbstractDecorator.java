package com.bmzlzl.designpattern.decorator;

/**
 * 装饰父类，这里也是可以使用抽象类，等会儿我们再说什么时候使用抽象类什么时候使用实体类。注意构造器和这个里面的花费、描述方法的写法。这里注入一个抽象煎饼类的对象。我们的获取描述花费的操作都委托抽象煎饼类来执行，为什么要这么做可以去看看我之前的文章依赖倒置原则。
 * @author jagger
 * @create 2019-12-24 18:50
 **/
public  class AbstractDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }
    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
