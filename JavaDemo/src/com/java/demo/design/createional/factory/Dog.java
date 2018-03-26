package com.java.demo.design.createional.factory;

/**
 * 狗是动物，也会跑.
 */
public class Dog implements AnimalRun{
    @Override
    public void run() {
        System.out.println("A dog is Running");

    }
}
