package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {
    By userName = By.xpath("//input[@id='user-name']");
    By passwordField = By.xpath("//input[@id='password']");
    By logInButton = By.xpath("//input[@id='login-button']");

    public void sendEmailText(String email) {
        sendTextToElement(userName, email);
    }

    public void sendpasswordText(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignButton() {
        clickOnElement(logInButton);
    }


}
