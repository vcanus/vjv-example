package com.vcanus.example;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void FuncTest() {
        Application app = new Application();
        Assert.assertEquals(2, app.func());
    }
}
