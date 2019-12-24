package com.bmzlzl.designpattern.builder;

/**
 * 客户端
 *
 * @author jagger
 * @create 2019-12-24 8:35
 **/
public class Click {
    public static void main(String[] args) {
        NewComputer newComputer = new NewComputer.Builder()
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainboard("mainboard")
                .build();
        System.out.println(newComputer);
    }
}
