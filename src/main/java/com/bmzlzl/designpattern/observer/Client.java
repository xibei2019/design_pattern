package com.bmzlzl.designpattern.observer;

/**
 * 测试类
 *
 * @author jagger
 * @create 2019-12-25 8:30
 **/
public class Client {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");
        Observer observer3 = new ConcreteObserver("Observer3");
        Subject subject1 = new ConcreteSubject("Subject1");

        subject1.addObserver(observer1);
        subject1.addObserver(observer2);
        subject1.addObserver(observer3);

        subject1.changeState("State01");
    }
}