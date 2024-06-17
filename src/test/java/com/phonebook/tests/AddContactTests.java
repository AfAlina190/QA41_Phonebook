package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{
    @BeforeMethod
    public void precondition(){


        app.getUser().clickOnLoginLink();
        app.getUser().fillRegisterLoginForm(new User()
                .setEmail("afal33@gmail.com")
                .setPassword( "Alina2024$"));

        app.getUser().clickOnLoginButton();

    }
    @Test
    public void addContactPositiveTest(){

        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName("Alinas")
                .setLastName("Afo")
                .setPhone( "1234567890")
                .setEmail( "afal33@gmail.com")
                .setAddress("Berlin")
                .setDescription("Nurse"));
        app.getContact().clickOnSaveButton();


        Assert.assertTrue(app.getContact().isContactAdded("Alinas"));
    }

    @AfterMethod
    public void postCondition(){

        app.getContact().removeContact();
        app.getContact().pause(1000);

    }


}
