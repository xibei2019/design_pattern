package com.bmzlzl.designpattern.factory.factoryMethod.byreflect;

import com.bmzlzl.designpattern.factory.factoryMethod.Product;

/**
 * 通过反射的方式
 *
 * @author jagger
 * @date 2019/12/23 20:51
 */
public abstract class Factory {
    public abstract <T extends Product> T createProduct(Class<T> cls);
}
