package com.bmzlzl.designpattern.facade;

/**
 * @author jagger
 * @create 2019-12-24 17:03
 **/
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.test();
        ModuleFacade mfacade = new ModuleFacade();
        mfacade.testA();
    }
}
