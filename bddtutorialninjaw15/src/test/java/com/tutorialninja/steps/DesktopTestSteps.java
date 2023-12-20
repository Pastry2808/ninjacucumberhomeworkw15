package com.tutorialninja.steps;

import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HPProductDetailPage;
import com.tutorialninja.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DesktopTestSteps {
    @And("^I select sort by position Name: Z to A$")
    public void iSelectSortByPositionNameZToA() {
        new DesktopPage().sortDescendingOrder();
    }
    @Then("^I Verify the Product will arrange in Descending order$")
    public void iVerifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().verifySortedInDescendingOrder();
    }

    @And("^I select sort by position Name: A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new DesktopPage().sortAscendingOrder();
    }

    @And("^I select product HP LP$")
    public void iSelectProductHPLP() {
        new DesktopPage().selectHPDesktop();
    }

    @And("^I verify \"([^\"]*)\"$")
    public void iVerifyHPText(String text) {
        String hpDesktopText = new HPProductDetailPage().getHpText();
        Assert.assertEquals(text, hpDesktopText, "Validating HP LP3065 Desktop Text");
    }

    @And("^I select delivery date$")
    public void iSelectDeliveryDate() {
        new HPProductDetailPage().changeDeliveryDate();
    }

    @And("^I enter quantity$")
    public void iEnterQuantity() {
        new HPProductDetailPage().changeQuantity();
    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        new HPProductDetailPage().addToCart();
    }

    @And("^I verify  Success message$")
    public void iVerifySuccessMessage(String message) {
        String shoppingAddedText = new HPProductDetailPage().getShoppingCartText();
        Assert.assertEquals(message,shoppingAddedText, "Validating Shopping Addedd to Cart");
    }

    @And("^I click on Shopping Cart link$")
    public void iClickOnShoppingCartLink() {
        new HPProductDetailPage().clickOnShoppingCartLink();
    }

    @And("^I verify product \"([^\"]*)\"$")
    public void iVerifyProduct(String product) {
        String verifyProduct = new ShoppingCartPage().getProductName();
        Assert.assertEquals(verifyProduct,product,"Validating HP LP3065");
    }

    @And("^I verify delivery date \"([^\"]*)\"$")
    public void iVerifyDeliveryDate(String date) {
        String deliveryDate = new ShoppingCartPage().getDeliveryDate();
        Assert.assertEquals(date,deliveryDate, "Validating Delivery Date");
    }
    @And("^I verify model \"([^\"]*)\"$")
    public void iVerifyModel(String model) {
        String checkModel = new ShoppingCartPage().getModel();
        Assert.assertEquals(checkModel, model, "Validating Model");
    }
    @Then("^I verify the total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String total)  {
        String checkTotal = new ShoppingCartPage().getTotal();
        Assert.assertEquals(checkTotal,total,"Validating Total");
    }
}
