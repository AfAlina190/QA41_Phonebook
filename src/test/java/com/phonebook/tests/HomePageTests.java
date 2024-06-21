package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if(!app.getHomePage().isHomeComponentPresent()){
            app.getHomePage().clickOnHomeLink();
        }
    }

    @Test
    public void isHomeComponentPresentTest(){

        Assert.assertTrue(app.getHomePage().isHomeComponentPresent());

        //System.out.println("Home component is " + app.isHomeComponentPresent());
        //driver.findElement(By.cssSelector("div:nth-child(2)>div>div>h1"));
       // driver.findElement(By.xpath("//div[2]/div/div/h1"));

    }


}
