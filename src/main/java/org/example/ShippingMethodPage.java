package org.example;

import org.openqa.selenium.By;

public class ShippingMethodPage extends Utils {
    public void selectMethodOfShipping(){
        clickOnElement(By.xpath("//input[@id='shippingoption_1']"));
        clickOnElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
    }
}