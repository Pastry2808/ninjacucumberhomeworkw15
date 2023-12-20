package com.tutorialninja.steps;

import com.tutorialninja.pages.ComponentsPage;
import com.tutorialninja.pages.DesktopPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {


    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I hover mouse on Desktop tab and click$")
    public void iHoverMouseOnDesktopTabAndClick() {
        new HomePage().clickOnDesktop();
    }
    @And("^I click on Show all desktops link$")
    public void iClickOnShowAllDesktopsLink() {
        new HomePage().clickOnShowAllDesktops();
    }
    @Then("^I verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String text)  {
        String desktopsText =new DesktopPage().getDesktopsText();
        Assert.assertEquals(text,desktopsText,"Validating Desktops Text");
    }

    @When("^I hover mouse on LaptopAndNotebooks tab and click$")
    public void iHoverMouseOnLaptopAndNotebooksTabAndClick() {
        new HomePage().clickOnLaptopsAndNotebooksLink();
    }

    @And("^I click on Show all LaptopsAndNotebooks link$")
    public void iClickOnShowAllLaptopsAndNotebooksLink() {
        new HomePage().clickOnShowAllLaptopsAndNotebooksLink();
    }

    @Then("^I verify the message \"([^\"]*)\"$")
    public void iVerifyTheMessage(String message) {
        String verifyLaptopsAndNotebooksText = new LaptopsAndNotebooksPage().getLaptopsAndNotebooksText();
        Assert.assertEquals(message,verifyLaptopsAndNotebooksText, "Validating message Laptops and Notebooks");
    }

    @When("^I hover mouse on Components tab and click$")
    public void iHoverMouseOnComponentsTabAndClick() {
        new HomePage().clickOnComponentsLink();
    }

    @And("^I click on Show all components link$")
    public void iClickOnShowAllComponentsLink() {
        new HomePage().clickOnShowAllComponentsLink();
    }

    @Then("^I verify the word \"([^\"]*)\"$")
    public void iVerifyTheWord(String word)  {
        String verifyComponentsText = new ComponentsPage().getComponentsText();
        Assert.assertEquals(word,verifyComponentsText,"Validating word Components");
    }
}
