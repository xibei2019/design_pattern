package com.bmzlzl.designpattern.observer;

/**
 * 抽象主题，即为被观察对象，本身维护一个观察者集合。
 *
 * @author jagger
 * @create 2019-12-25 8:27
 **/
public interface Subject {
    void notify(String msg);

    String getState();

    String getName();

    void addObserver(Observer observer);

    void changeState(String state);
}
