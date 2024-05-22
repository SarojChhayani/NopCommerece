package org.example;

import org.openqa.selenium.By;

public class PaymentInfoPage extends Utils{

    public void enterPaymentInfoDetails(){
        selectTextByVisibleText(By.id("CreditCardType"),"Visa");
        typeText(By.id("CardholderName"),"Riya Patel");
        typeText(By.id("CardNumber"),"4112112222111122");
        selectTextByVisibleText(By.name("ExpireMonth"),"10");
        selectTextByVisibleText(By.name("ExpireYear"),"2028");
        typeText(By.id("CardCode"),"117");
        clickOnElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; PaymentInfo.save()']"));
    }
}
