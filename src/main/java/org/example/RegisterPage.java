package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    public  void registrationDetails(){
        //Type First name
        typeText(By.id("FirstName"),loadProp.getProperty("FirstName"));

        //Type Lastname
        typeText(By.name("LastName"), loadProp.getProperty("LastName"));
        //click on dateofbirth
        selectTextByVisibleText(By.name("DateOfBirthDay"),"15");
        // click on month of birth
        selectTextByVisibleText(By.name("DateOfBirthMonth"),"April");
        // Select year of birth
        selectTextByVisibleText(By.name("DateOfBirthYear"),"1989");
        //Type E-mail
        typeText(By.id("Email"), email);

        //Type Password
        typeText(By.id("Password"), password);

        //Type Confirmed password
        typeText(By.id("ConfirmPassword"), password);

        //Click on register Submit Button
        clickOnElement(By.id("register-button"));

    }
}
