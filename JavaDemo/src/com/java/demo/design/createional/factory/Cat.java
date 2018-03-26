package com.java.demo.design.createional.factory;

/**
 * 猫继承AnimalRun接口.
 * 猫 是一个动物，并且会跑.
 */
public class Cat implements AnimalRun{

    @Override
    public void run() {
        System.out.println("A cat is running");
    }
}
