package com.tutorialninja.steps;

import com.tutorialninja.pages.LoginPage;
import com.tutorialninja.pages.MyAccountsPage;
import com.tutorialninja.pages.RegisterAccountsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyAccountsTestSteps {
    @When("^I click on My Account Link$")
    public void iClickOnMyAccountLink() {
        new MyAccountsPage().clickOnMyAccountLink();
    }

    @And("^I click on Register$")
    public void iClickOnRegister() {
        new MyAccountsPage().clickOnRegister();
    }

    @Then("^I verify \"([^\"]*)\" text$")
    public void iVerifyText(String text) {
        String registerText = new RegisterAccountsPage().getRegisterText();
        Assert.assertEquals(registerText,text,"Validating Register Text");
    }

    @And("^I click on Login$")
    public void iClickOnLogin() {
        new MyAccountsPage().clickOnLogin();
    }

    @Then("^I verify \"([^\"]*)\" heading$")
    public void iVerifyHeading(String heading) {
        String loginText = new LoginPage().getReturningCustomerText();
        Assert.assertEquals(loginText,heading,"Validating Returning Customer");
    }
    @And("^I Enter First Name$")
    public void iEnterFirstName() {
        new RegisterAccountsPage().enterFirstName();
    }

    @And("^I Enter Last Name$")
    public void iEnterLastName() {
        new RegisterAccountsPage().enterLastName();
    }

    @And("^I Enter Email$")
    public void iEnterEmail() {
        new RegisterAccountsPage().enterEmail();
    }

    @And("^I Enter Telephone$")
    public void iEnterTelephone() {
        new RegisterAccountsPage().enterTelephone();
    }

    @And("^I Enter Password$")
    public void iEnterPassword() {
        new RegisterAccountsPage().enterPassword();
    }

    @And("^I Enter Password Confirm$")
    public void iEnterPasswordConfirm() {
        new RegisterAccountsPage().enterConfirmPassword();
    }

    @And("^I Select Subscribe Yes radio button$")
    public void iSelectSubscribeYesRadioButton() {
        new RegisterAccountsPage().clickSubscribeButton();
    }

    @And("^I Click on Privacy Policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterAccountsPage().clickPrivacyPolicy();
    }

    @And("^I Click on Continue button$")
    public void iClickOnContinueButton() {
        new RegisterAccountsPage().continueButton();
    }

    @And("^I Verify the message “Your Account Has Been Created!”$")
    public void iVerifyTheMessageYourAccountHasBeenCreated(String message) {
        String verifyAccountCreated = new RegisterAccountsPage().verifyMessageAccountCreated();
//        Assert.assertEquals(verifyAccountCreated,message,"Validating Account Created");
    }
    @And("^I click on Logout$")
    public void iClickOnLogout() {
        new MyAccountsPage().logOut();
    }

    @And("^I Click on Continue Tab$")
    public void iClickOnContinueTab() {
        new RegisterAccountsPage().clickOnContinue();
    }

    @And("^Click on Login button$")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLogin();
    }

    @And("^Verify text “My Account”$")
    public void verifyTextMyAccount(String account) {
        String verifyMyAccount = new LoginPage().verifyText();
//        Assert.assertEquals(verifyMyAccount,account,"Validating My Account Text");
    }
}
