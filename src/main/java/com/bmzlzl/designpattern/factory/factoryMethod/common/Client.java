package com.bmzlzl.designpattern.factory.factoryMethod.common;

import com.bmzlzl.designpattern.factory.factoryMethod.Product;

/**
 * 工厂方法模式
 *
 * @author jagger
 * @date 2019/12/23 20:41
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactory();
        Product product = factory.createProduct();
        product.method();
    }
}
