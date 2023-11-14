package com.cydeo.tests.day2_webdriver_basic;

import com.cydeo.utilities.WebDriverFactory;

public class callWebDriverFactory {

    public static void main(String[] args) {

        WebDriverFactory.getDriver("chrome");
        WebDriverFactory.getDriver().get("https://www.youtube.com/");


    }

}
