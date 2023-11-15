package com.cydeo.tests.Day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/multiple_buttons");
        Thread.sleep(3000);


        for (int i = 1; i <=6 ; i++) {
            driver.findElement(By.xpath("//div//button ["+i+"]")).click();
            Thread.sleep(3000);
        }

        System.out.println("Test is done");

        driver.quit();

        



    }
}
