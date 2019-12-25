package com.bmzlzl.designpattern.observer;

/**
 * 具体观察者
 *
 * @author jagger
 * @create 2019-12-25 8:29
 **/
public class ConcreteObserver implements Observer {
    private String state = "default";
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void getMsg(Subject subject, String msg) {
        System.out.println(subject.getName() + " new state: " + subject.getState());
        System.out.println(name + " state " + state + " --> " + subject.getState());
        this.setState(subject.getState());
    }
}