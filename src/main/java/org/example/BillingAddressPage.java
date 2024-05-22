package org.example;

import org.openqa.selenium.By;

public class BillingAddressPage extends  Utils{

    public void enterBillingAddressDetail (){
        typeText(By. id("BillingNewAddress_FirstName"),"Riya");
        typeText(By.id("BillingNewAddress_LastName"),"Patel");
        typeText(By.id("BillingNewAddress_Email"),"riyapatel@gmail.com");
        selectTextByVisibleText(By.id("BillingNewAddress_CountryId"),"United States");
        selectTextByVisibleText(By.id("BillingNewAddress_StateProvinceId"),"New Jersey");
        typeText(By.id("BillingNewAddress_City"),"Manchester Township");
        typeText(By.id("BillingNewAddress_Address1"),"3110 Brentwood Ave");
        typeText(By.name("BillingNewAddress.ZipPostalCode"),"NJ 08759");
        typeText(By.name("BillingNewAddress.PhoneNumber"),"7076543210");
        clickOnElement(By.name("save"));
    }
}
