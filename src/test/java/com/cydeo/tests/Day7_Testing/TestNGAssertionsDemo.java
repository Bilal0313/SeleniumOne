package com.cydeo.tests.Day7_Testing;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsDemo {


    @BeforeMethod
    public void setUp(){
        System.out.println("Open Browser");
    }


    @Test
    public void test1 (){
        System.out.println("First Test");
        Assert.assertEquals("title","title ");

        System.out.println("Second Test");
        Assert.assertEquals("url","url");

    }

    @AfterClass
    public void done(){
        System.out.println("Browser Close");
    }




}
