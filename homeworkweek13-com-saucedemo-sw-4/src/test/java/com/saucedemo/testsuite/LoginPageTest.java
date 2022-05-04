package com.saucedemo.testsuite;


import org.testng.Assert;
import com.saucedemo.pages.Products;
import com.saucedemo.pages.SignInPage;
import com.saucedemo.testbase.TestBase;
import org.openqa.selenium.By;

import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
     SignInPage signInPage=new SignInPage();
     Products products =new Products();

     @Test
     public void userShouldNavigateToLoginPageSuccessfully() {
         signInPage.sendEmailText("standard_user");
         signInPage.sendpasswordText("secret_sauce");
         signInPage.clickOnSignButton();
         String expectedMessage="PRODUCTS";
         String actualMessage= products.varifysetDisplayMsg();
          Assert.assertEquals(expectedMessage,actualMessage,"Products page not display");





     }
     @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        signInPage.sendEmailText("standard_user");
        signInPage.sendpasswordText("secret_sauce");
        signInPage.clickOnSignButton();
        int  expectedMessage= 6;
        int actualMessage=products.productsNo();
       Assert.assertEquals(actualMessage,expectedMessage,"Items not displayed");




     }


     }





