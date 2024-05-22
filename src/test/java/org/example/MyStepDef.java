package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDef extends Utils{
    HomePage homePage = new HomePage();
    RegisterPage registerPage =new RegisterPage();
    RegisterResultPage registerResultPage =new RegisterResultPage();
    SearchByBrandNamePage searchByBrandNamePage = new SearchByBrandNamePage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();
    BillingAddressPage billingAddressPage = new BillingAddressPage();
    PaymentMethodPage paymentMethodPage = new PaymentMethodPage();
    PaymentInfoPage paymentInfoPage = new PaymentInfoPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CheckOutCompletedPage checkOutCompletedPage = new CheckOutCompletedPage();
    NewReleasePage newReleasePage = new NewReleasePage();
    Electronics electronics = new Electronics();
    CameraAndPhoto cameraAndPhoto = new CameraAndPhoto();
    LeicaTMirrorlessDigitalCamera leicaTMirrorlessDigitalCamera = new LeicaTMirrorlessDigitalCamera();
    ProductEmailAFriend productEmailAFriend = new ProductEmailAFriend();
    @Given("I am On Home Page")
    public void i_am_on_home_page() {

    }

    @And("I Click On Register Button")
    public void iClickOnRegisterButton() {
        homePage.clickOnRegisterButton();
    }

    @When("I Enter registration details")
    public void iEnterRegistrationDetails() {
        registerPage.registrationDetails();
    }

    @Then("I should be able to register successfully")
    public void iShouldBeAbleToRegisterSuccessfully() {
    registerResultPage.userRegisteredSuccessfully();
    }

    @When("I click on {string} button")
    public void iClickOnButton(String buttonName) {
        homePage.clickOnButtonByGivenButtonName(buttonName);
    }

    @Then("I should able to verify that user navigated to{string} page")
    public void iShouldAbleToVerifyThatUserNavigatedToPage(String url_contain) {
        verifyURLContains(url_contain);
    }


    @When("I type {string}in search box")
    public void iTypeInSearchBox(String brandName) {
        homePage.searchProductByBrandName(brandName);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        homePage.clickOnSearchButton();
    }


    @Then("I should be able to see all the product by given {string} And  navigated {string} page")
    public void iShouldBeAbleToSeeAllTheProductByGivenAndNavigatedPage(String givenBrandName, String url) {
        searchByBrandNamePage.eachProductContainBrandName(givenBrandName,url);
    }


    @When("I click on Add to cart button of HTC One M8 Android L 5.0 Lollipop product")
    public void iClickOnAddToCartButtonOfHTCOneMAndroidLLollipopProduct() {
        homePage.clickOnHTCAndroidADDTOCARTButton();
    }

    @And("I click on Shopping Button")
    public void iClickOnShoppingButton() {
        homePage.clickOnShoppingCart();
    }

    @And("I tick on terms and condition and I click on checkout button")
    public void iTickOnTermsAndConditionAndIClickOnCheckoutButton() {
        shoppingCartPage.clickOnCheckoutButton();
    }

    @And("I click on check out as guest")
    public void iClickOnCheckOutAsGuest() {
        checkoutAsGuestPage.clickOnCheckoutAsGuestButton();
    }

    @And("I enter Billing Address Details and click on continue button")
    public void iEnterBillingAddressDetailsAndClickOnContinueButton() {
        billingAddressPage.enterBillingAddressDetail();
    }

    @And("I select Shipping method and I click on continue button")
    public void iSelectShippingMethodAndIClickOnContinueButton() {
        shippingMethodPage.selectMethodOfShipping();
    }

    @And("I select Payment method and I click on continue button")
    public void iSelectPaymentMethodAndIClickOnContinueButton() {
        paymentMethodPage.selectPaymentMethod();
    }

    @And("I enter credit Card details and I click on continue button")
    public void iEnterCreditCardDetailsAndIClickOnContinueButton() {
        paymentInfoPage.enterPaymentInfoDetails();
    }

    @And("I click on Confirm button")
    public void iClickOnConfirmButton() {
        confirmOrderPage.clickOnConfirmOrderButton();
    }

    @Then("I verify checkout complete msg and order no is display")
    public void iVerifyCheckoutCompleteMsgAndOrderNoIsDisplay() {
        checkOutCompletedPage.verifyCheckoutCompletedMsg();
        checkOutCompletedPage.verifyOrderNumDisplay();
    }

    @When("I select {string} from header bar")
    public void iSelectFromHeaderBar(String currency) {
        homePage.selectCurrency(currency);
    }

    @Then("each product contain {string}")
    public void eachProductContain(String currencySymbol) {
        homePage.verifyEachProductContainCurrencySymbol(currencySymbol);
    }


    @When("I click on Details button under news release Section")
    public void iClickOnDetailsButtonUnderNewsReleaseSection() {
        homePage.clickOnDetailsButton();
    }

    @And("I enter Comment Details")
    public void iEnterCommentDetails() {
        newReleasePage.addingNewComment();
    }

    @Then("verify new comment msg display verify added new comment is display at last")
    public void verifyNewCommentMsgDisplayVerifyAddedNewCommentIsDisplayAtLast() {
        newReleasePage.verifyCommentMsgAndAddedNewCommentIsDisplayAtLast();
    }

    @When("I Click on Electronics Button")
    public void iClickOnElectronicsButton() {
        homePage.clickOnElectronics();
    }

    @And("I click on Camera & Photo")
    public void iClickOnCameraPhoto() {
        electronics.clickOnCameraAndPhoto();
    }

    @And("I click on Leica T Mirrorless Digital Camera Product")
    public void iClickOnLeicaTMirrorlessDigitalCameraProduct() {
        cameraAndPhoto.ClickOnProduct();
    }

    @And("i click On Email A Friend")
    public void iClickOnEmailAFriend() {
        leicaTMirrorlessDigitalCamera.clickOnEmailAFriend();
    }

    @Then("I refer a product to friend")
    public void iReferAProductToFriend() {
        productEmailAFriend.productReferAFriend();
    }
}
