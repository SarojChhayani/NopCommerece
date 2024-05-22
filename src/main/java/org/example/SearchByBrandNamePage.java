package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SearchByBrandNamePage extends Utils {
    private By _productTitle = By.xpath("//div[@class='item-box']//h2");
    public void eachProductContainBrandName(String givenBrandName, String url ) {
        //Store product title element as List
        List<WebElement> productcontainWordElementList = driver.findElements(_productTitle);

       for (WebElement webelement : productcontainWordElementList) {
            Assert.assertNotNull(webelement.getText().contains(""+givenBrandName+""), "One of the product Does Not Contain Brand Name");

            //verify Url
            //String actualNikeUrl = driver.getCurrentUrl();
            Assert.assertTrue(driver.getCurrentUrl().contains(""+url+""), "Url does not Match");
        }
    }


}
