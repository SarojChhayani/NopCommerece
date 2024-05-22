package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _SearchButton = By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/form/button");

    private By _searchBox = By.id("small-searchterms");
    private By _currency =By.id("customerCurrency");
    private By _currencySymbol = By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']");
    private By _detailsButton = By.xpath("//div[@class='news-items']/div[2]/div[3]/a");
    public void clickOnSearchButton() {
        //Click On Search Button
        clickOnElement(_SearchButton);
    }
    public void clickOnHTCAndroidADDTOCARTButton(){clickOnElement(By.cssSelector(" div.product-grid.home-page-product-grid>div:nth-child(2)>div:nth-child(3)>div div:nth-child(2)>div.add-info>div:nth-child(2) >button.button-2.product-box-add-to-cart-button"));}

    //method to click on Shopping Cart
    public void clickOnShoppingCart(){clickOnElement(By.xpath("//a[contains(text(),'shopping cart')]"));}
    //click on register button from header bar
    public void clickOnRegisterButton(){clickOnElement(By.xpath("//a[@class='ico-register']"));
    }


    public void searchProductByBrandName(String brandName) {
        typeText(_searchBox,""+brandName+"");
    }
    public void clickOnButtonByGivenButtonName(String buttonName){
        clickOnElement(By.linkText(""+buttonName+""));
    }
    public void selectCurrency(String currency){
        selectTextByVisibleText(_currency,currency);}
    public void verifyEachProductContainCurrencySymbol(String currencySymbol){
        //Store product
        List<WebElement> productContainCurrencySymbol = driver.findElements(_currencySymbol);

        for (WebElement webelement : productContainCurrencySymbol) {
            Assert.assertNotNull(webelement.getText().contains(currencySymbol), "One Of Product Does Not Contain Currency Symbol");

        }
    }
    public void clickOnDetailsButton() {
        clickOnElement(_detailsButton);
    }
    public void clickOnElectronics(){
        //Click on Electronics option from top bar
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']"));

    }
}

