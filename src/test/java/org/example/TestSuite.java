package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegisterPage registerPage=new RegisterPage();
    RegisterResultPage registerResultPage=new RegisterResultPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    PaymentInfoPage paymentInfoPage =new PaymentInfoPage();
    PaymentMethodPage paymentMethodPage =new PaymentMethodPage();
    ShippingMethodPage shippingMethodPage =new ShippingMethodPage();
    ConfirmOrderPage confirmOrderPage =new ConfirmOrderPage();
     CheckOutCompletedPage cheakOutCompletedPage= new CheckOutCompletedPage();
    SearchByBrandNamePage searchByBrandNamePage = new SearchByBrandNamePage();

@Test
public void verifyUserShouldBeAbleToRegisterSuccessfully() {

    //click on register button from header bar
    homePage.clickOnRegisterButton();
    //enter registration details
    registerPage.registrationDetails();
    //verify user registered Successfully
    registerResultPage.userRegisteredSuccessfully();
}
    @Test
    public void verifyUserShouldBeAbleToSearchProductByBrandName(){
        //type product name
        homePage.searchProductByBrandName("brandname");
        //to click on Search button
        homePage.clickOnSearchButton();
        //each product contain same brand name
        searchByBrandNamePage.eachProductContainBrandName("givenbrandName","Url");
    }


@Test
    public void verifyGuestUserShouldBeAbleToBuyProduct() {
    //click on Product
    homePage.clickOnHTCAndroidADDTOCARTButton();
    //Click On ShoppingCart button
    homePage.clickOnShoppingCart();
    //Click on CheckOut
    shoppingCartPage.clickOnCheckoutButton();
    // Select Checkout As Guest
    checkoutAsGuestPage.clickOnCheckoutAsGuestButton();
    //Enter Billing Details
    billingAddressPage.enterBillingAddressDetail();
    //Select method Of Shipping
    shippingMethodPage.selectMethodOfShipping();
    //Select Payment method
    paymentMethodPage.selectPaymentMethod();
    //Enter payment info
    paymentInfoPage.enterPaymentInfoDetails();
    //Clock on Confirm Order button
    confirmOrderPage.clickOnConfirmOrderButton();
    //Verify CheckOut MSG
    cheakOutCompletedPage.verifyCheckoutCompletedMsg();
    //Verify Order No. Msg Is Display
    cheakOutCompletedPage.verifyOrderNumDisplay();
}















}
