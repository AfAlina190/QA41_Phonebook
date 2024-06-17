package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CreateAccountTests extends TestBase{

    @Test(enabled = false)
    public void createAccountPositiveTest() {



        app.getUser().clickOnLoginLink();


        app.getUser().fillRegisterLoginForm(new User()
                .setEmail("afal33@gmail.com")
                .setPassword( "Alina2024$"));

        app.getUser().clickOnRegistrationButton();


        Assert.assertTrue(app.getUser().isSignOutButtonPresent());
    }

    @Test
    public void createExistedAccountNegativeTest(){
            SoftAssert softAssert = new SoftAssert();


        app.getUser().clickOnLoginLink();

        app.getUser().fillRegisterLoginForm(new User()
                .setEmail("afal33@gmail.com")
                .setPassword( "Alina2024$"));

        app.getUser().clickOnRegistrationButton();

        softAssert.assertTrue(app.getUser().isAlertPresent());
        softAssert.assertTrue(app.getUser().isError409Present());

        softAssert.assertAll();


    }


}
