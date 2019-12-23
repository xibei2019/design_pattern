package com.bmzlzl.designpattern.factory.factoryMethod.common;

import com.bmzlzl.designpattern.factory.factoryMethod.Product;

/**
 * 工厂抽象类
 *
 * @author jagger
 * @date 2019/12/23 20:45
 */
public abstract class Factory {
    public abstract Product createProduct();
}
