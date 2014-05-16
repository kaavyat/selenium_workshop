package com.selenium.test;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.sql.DriverManager.println;

public class MyFirstTest {

    @Test
    public void singlePassengerJourney(){
        WebDriver driver = new FirefoxDriver();

        println("***** Running your first test *******");

        driver.navigate().to("http://book.goindigo.in/");
        Assert.assertTrue("title should start with IndiGo - On Time", driver.getTitle().startsWith("IndiGo - On Time"));

        driver.findElement(By.id("")).click();

        driver.close();
        driver.quit();
    }

}
