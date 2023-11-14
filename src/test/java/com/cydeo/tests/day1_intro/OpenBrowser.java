package com.cydeo.tests.day1_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class OpenBrowser {

    public static void main(String[] args) {
        // Hey webDriver can you make chrome ready for my automation
        WebDriverManager.chromedriver().setup();

        // WebDriver represent the browser
        // we are creating driver for chrome browser
        // new chromDriver()
        WebDriver driver = new ChromeDriver();
        driver.get("https://Amazon.com");
        driver.quit();
        System.out.println("Amazon page is opened");




    }


}
