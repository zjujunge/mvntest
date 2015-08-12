package com.imooc.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloMarvenTest {
    @Test
    public void testHello() {
        Assert.equals("hello maven", new HelloMaven.sayHello());
    }
}
