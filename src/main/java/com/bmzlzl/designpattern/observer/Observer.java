package com.bmzlzl.designpattern.observer;

/**
 * 抽象观察者，根据主题状态变化做出相应反应，本身维护一个主题的引用。
 */
public interface Observer {
    void getMsg(Subject subject, String msg);
}
