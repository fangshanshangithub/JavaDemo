package com.java.demo.design.createional.factory;

/**
 * 工厂类：来决定要让那个动物Run.
 */
public class AnimalFactory {

    private static final String CAT = "cat";
    private static final String DOG = "dog";

    public  AnimalRun makeRun(String animalName){
        if(CAT.equals(animalName)) {
            return new Cat();
        }
        else if (DOG.equals(animalName)) {
            return new Dog();
        }
        else {
            return null;
        }
    }

}
