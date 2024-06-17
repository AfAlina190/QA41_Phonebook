package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @Test
    public void isHomeComponentPresentTest(){

        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());

        //System.out.println("Home component is " + app.isHomeComponentPresent());
        //driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1"));
       // driver.findElement(By.xpath("//div[2]/div/div/h1"));

    }


}
