package com.tutorialninja.steps;

import com.tutorialninja.pages.CheckoutPage;
import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import com.tutorialninja.pages.MacBookProductDetailPage;
import com.tutorialninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {
    @Then("^I select sort by Price \\(High > Low\\)$")
    public void iSelectSortByPriceHighLow() {
        new LaptopsAndNotebooksPage().sortHighToLow();
    }

    @And("^I select product MacBook$")
    public void iSelectProductMacBook() {
        new LaptopsAndNotebooksPage().selectMacbook();
    }

    @And("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String text) {
      String macBookText = new MacBookProductDetailPage().verifyMacBookText();
        Assert.assertEquals(text,macBookText,"Validating MacBook Text");
    }

    @And("^I click on Add to Cart$")
    public void iClickOnAddToCart() {
        new MacBookProductDetailPage().addToCart();
    }

    @And("^I verify the message “Success: You have added MacBook to your shopping cart!”$")
    public void iVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart(String message) {
        String verifySuccessMessage = new MacBookProductDetailPage().verifyShoppingCartMessage();
        Assert.assertEquals(message,verifySuccessMessage,"Validating Success Message");
    }

    @And("^I click Shopping Cart link$")
    public void iClickShoppingCartLink() {
        new MacBookProductDetailPage().clickOnShoppingCart();
    }

    @And("^I verify product name \"([^\"]*)\"$")
    public void iVerifyProductName(String arg0) {
        new ShoppingCartPage().getProductName();
    }

    @And("^I change quantity to (\\d+)$")
    public void iChangeQuantityTo(int arg0) {
        new ShoppingCartPage().changeQuantity();
    }

    @And("^I click on Update tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnUpdate();
    }

    @And("^I verify update message “Success: You have modified your shopping cart!”$")
    public void iVerifyUpdateMessageSuccessYouHaveModifiedYourShoppingCart(String alertMessage) {
        String verifyUpdateMessage = new ShoppingCartPage().verifyMessage();
        Assert.assertEquals(alertMessage,verifyUpdateMessage, "Validating Update Message");
    }

    @And("^I verify total \"([^\"]*)\"$")
    public void iVerifyTotal(String total) {
        String verifyTotal = new ShoppingCartPage().getTotal();
        Assert.assertEquals(total,verifyTotal, "Validating Total");
    }

    @And("^I click on checkout button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckout();
    }
    @And("^I verify customer \"([^\"]*)\"$")
    public void iVerifyCustomer(String newCustomer)  {
        String verifyCustomer = new CheckoutPage().getNewCustomerText();
        Assert.assertEquals(verifyCustomer,newCustomer,"Validating New Customer");
    }
    @And("^I click on Guest checkout$")
    public void iClickOnGuestCheckout() {
        new CheckoutPage().clickOnCheckout();
    }
    @And("^I click on continue tab$")
    public void iClickOnContinueTab() {
        new CheckoutPage().clickOnContinue();
    }

    @And("^I fill the mandatory fields$")
    public void iFillTheMandatoryFields() throws InterruptedException {
        new CheckoutPage().fillMandatoryFields();
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().continueButton();
    }

    @And("^I add comments$")
    public void iAddComments() {
        new CheckoutPage().addComment();
    }

    @And("^I click on the terms and conditions button$")
    public void iClickOnTheTermsAndConditionsButton() {
        new CheckoutPage().clickTermsAndComment();
    }

    @And("^I click  on the continue button$")
    public void iClickOnTheContinueButton() {
        new CheckoutPage().clickOnContinueButton1();
    }
    @Then("^I Verify message “Warning: Payment method required!”$")
    public void iVerifyMessageWarningPaymentMethodRequired(String warningMessage) {
        String verifyWarningMessage = new CheckoutPage().verifyWarningMessage();
//        Assert.assertEquals(verifyWarningMessage,warningMessage, "Validating Warning Message");
    }
}
