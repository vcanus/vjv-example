package com.vcanus.example;

public abstract class Animal {
    protected String name;

    protected Animal() {
        System.out.println("This is Animal()");
    }

    protected Animal(String name) {
        System.out.println("This is Animal(String)");
        this.name = name;
    }

    public String name() {
        return name;
    }

    public abstract String sound();
//    public String name();
}
