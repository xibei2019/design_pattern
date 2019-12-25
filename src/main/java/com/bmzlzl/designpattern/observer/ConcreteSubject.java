package com.bmzlzl.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jagger
 * @create 2019-12-25 8:28
 **/
public class ConcreteSubject implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String name;
    private String state = "default";

    public ConcreteSubject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void changeState(String state){
        this.setState(state);
        this.notify(state);
    }

    @Override
    public void notify(String msg) {
        for(Observer observer : observers){
            observer.getMsg(this, name);
        }
    }
}
