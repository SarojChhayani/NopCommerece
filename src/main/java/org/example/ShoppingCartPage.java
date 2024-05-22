package org.example;

import org.openqa.selenium.By;

import static org.openqa.selenium.By.id;

public class ShoppingCartPage extends Utils {
    public void clickOnCheckoutButton(){
        //to tick term and condition
        clickOnElement(By.id("termsofservice"));
        //to click on checkout button
        clickOnElement(By.xpath("//button[@id='checkout']"));
    }

}
