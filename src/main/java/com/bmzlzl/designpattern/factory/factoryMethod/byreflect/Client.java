package com.bmzlzl.designpattern.factory.factoryMethod.byreflect;

import com.bmzlzl.designpattern.factory.factoryMethod.ConcreteProductA;
import com.bmzlzl.designpattern.factory.factoryMethod.Product;

/**
 * 测试
 * @author jagger
 * @date 2019/12/23 20:56
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct(ConcreteProductA.class);
        product.method();
    }
}
