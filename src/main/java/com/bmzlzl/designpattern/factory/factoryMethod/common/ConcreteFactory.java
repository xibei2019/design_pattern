package com.bmzlzl.designpattern.factory.factoryMethod.common;

import com.bmzlzl.designpattern.factory.factoryMethod.ConcreteProductA;
import com.bmzlzl.designpattern.factory.factoryMethod.Product;

/**
 * 具体工厂类
 *
 * @author jagger
 * @date 2019/12/23 20:46
 */
public class ConcreteFactory extends Factory {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
