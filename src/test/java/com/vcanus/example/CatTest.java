package com.vcanus.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CatTest {
    @Test
    public void soundTest() {
        Cat cat = new Cat();
        Assert.assertEquals("mew", cat.sound());
    }

    @Test
    public void listTest() {
//        ArrayList<Cat> catList = new ArrayList<Cat>();
//        Cat cat1 = new Cat("1");
//        Cat cat2 = new Cat("2");
//        Cat cat3 = new Cat("3");
//        Cat cat4 = new Cat("4");
//        Cat cat5 = new Cat("5");
//        catList.add(cat1);
//        catList.add(cat2);
//        catList.add(cat3);
//        catList.add(cat4);
//        catList.add(cat5);
//
//        for(int i = 0; i < catList.size(); i++) {
//            System.out.println(catList.get(i).sound());
//        }
//
//        ArrayList<Dog> dogList = new ArrayList<Dog>();
//        // ...
//        Dog dog1 = new Dog("A");

        Animal dogA = new Dog("dogA");
        Animal catA = new Cat("castA");
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(dogA);
        animalList.add(catA);

        animalList.forEach(item -> {
            System.out.println(item.sound());
        });

//        Animal animalA = new Animal("animalA");
    }
}
