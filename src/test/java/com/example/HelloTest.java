package com.example;

import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testGreet() {
        Hello hello = new Hello();
        Assert.assertEquals("Hello, Jenkins!", hello.greet());
    }
}
