package com.imooc.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class TestHelloMaven {

    @Test
    public void testHello() {
        HelloMaven hello = new HelloMaven();
        String helloStr = hello.sayHello();
        Assert.assertEquals("hello maven", helloStr);
    }
}
