package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Products extends Utility {
    By displayProduct = By.xpath("//div[@class='inventory_item']");
    By displayMsg = By.xpath("//span[@class='title']");

    public List<WebElement>product(){
        return driver.findElements(displayProduct);
    }

     public int productsNo(){
        return product().size();
     }
     public String varifysetDisplayMsg(){
        return getTextFromElement(displayMsg);
     }
}
