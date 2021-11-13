package com.vcanus.example;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void soundTest() {
        Dog dog = new Dog();
        Assert.assertEquals("bark", dog.sound());

    }
}
