package org.example;

import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utils {
    public void clickOnConfirmOrderButton(){
        clickOnElement(By.xpath("//button[@onclick='if (!window.__cfRLUnblockHandlers) return false; ConfirmOrder.save()']"));
    }

}
