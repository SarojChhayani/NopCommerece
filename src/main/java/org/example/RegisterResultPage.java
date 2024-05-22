package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils {
    static String expectedMsg = "Your registration completed";

    public void userRegisteredSuccessfully() {
//verify correct registration msg display
        String actualMsg = getTextFromElement(By.className("result"));
        String expectedRegisterMsg = loadProp.getProperty("expectedMsg");
        Assert.assertEquals(actualMsg, expectedRegisterMsg, "register Msg Does not Match");
    }
}

