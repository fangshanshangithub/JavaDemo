package com.java.demo.design.createional.factory;

/**
 * 先实例化工厂类，再调用工厂类的方法调用对应的具体的实现类.
 */
public class FactoryMain {

    public static void main(String args[]){

        AnimalFactory factory = new AnimalFactory();
        // 获取cat的实例
        AnimalRun cat = factory.makeRun("cat");
        cat.run();
    }

}
