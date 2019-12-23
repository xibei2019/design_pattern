package com.bmzlzl.designpattern.factory.factoryMethod.byreflect;

import com.bmzlzl.designpattern.factory.factoryMethod.Product;

/**
 * 通过反射的方式
 *
 * @author jagger
 * @date 2019/12/23 20:54
 */
public class ConcreteFactory extends Factory {
    public <T extends Product> T createProduct(Class<T> cls) {
        Product product = null;
        try {
            product = ((Product) Class.forName(cls.getName()).newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
