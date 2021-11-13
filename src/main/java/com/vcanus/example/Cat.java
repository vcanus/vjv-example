package com.vcanus.example;

public class Cat extends Animal {
//    private String name;

    public Cat() {
//        super(); // 이건 왜 필요 없을까요? 왜냐하면 기본적으로 호출되기 때문입니다.
        System.out.println("This is Cat()");
    }

    public Cat(String name) {
        super(name);
        System.out.println("This is Cat(String)");
//        this.name = name;
    }

    @Override
    public String sound() {
        return "mew " + name;
    }

//    @Override
//    public String name() {
//        return name;
//    }
}
