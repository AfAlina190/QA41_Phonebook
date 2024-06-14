package com.phonebook.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test
    public void isHomeComponentPresentTest(){

        Assert.assertTrue(isHomeComponentPresent());

        System.out.println("Home component is " + isHomeComponentPresent());
        //driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1"));
       // driver.findElement(By.xpath("//div[2]/div/div/h1"));

    }

    public boolean isHomeComponentPresent(){

        return isElementPresent(By.cssSelector("div:nth-child(2)>div>div>h1"));
        //return driver.findElements(By.cssSelector("div:nth-child(2)>div>div>h6")).size()>0;

        //если в тесте нет асерта зачит это не тест


    }


}
