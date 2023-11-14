package com.cydeo.utilities;

public class f {

    public static void main(String[] args) {

        WebDriverFactory.getDriver("chrome");
        WebDriverFactory.getDriver().get("https://www.youtube.com/");

    }

}
