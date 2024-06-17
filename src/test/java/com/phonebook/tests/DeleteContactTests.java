package com.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase{

    @BeforeMethod
    public void precondition(){

        app.getUser().clickOnLoginLink();

        app.getUser().fillRegisterLoginForm(new User()
                .setEmail("afal33@gmail.com")
                .setPassword( "Alina2024$"));
        app.getUser().clickOnLoginButton();

        app.getContact().clickOnAddLink();
        app.getContact().fillAddContactForm(new Contact()
                .setName("Alinas")
                .setLastName("Afo")
                .setPhone( "1234567890")
                .setEmail( "afal33@gmail.com")
                .setAddress("Berlin")
                .setDescription("Nurse"));
        app.getContact().clickOnSaveButton();
        app.getContact().clickOnSaveButton();

    }

    @Test
    public void deleteContactPositiveTest(){

        //get size of contacts before delete
        int sizeBefore = app.getContact().sizeOfContacts();
        //click on Card
        app.getContact().removeContact();
        app.getContact().pause(500);
        //get size of contacts after delete
        int sizeAfter = app.getContact().sizeOfContacts();
        //compare size before and size after with assert
        Assert.assertEquals(sizeAfter, sizeBefore-1);


    }

}
