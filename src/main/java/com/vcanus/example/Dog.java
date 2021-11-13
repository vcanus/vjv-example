package com.vcanus.example;

public class Dog extends Animal {
//    private String name;

    public Dog() {
        System.out.println("This is Dog()");
    }

    public Dog(String name) {
        super(name);
        System.out.println("This is Dog(String)");
//        this.name = name;
    }

    @Override
    public String sound() {
        return "bark " + name;
    }

//    @Override
//    public String name() {
//        return name;
//    }
}
