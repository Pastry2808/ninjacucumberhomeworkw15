package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class);
    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'New Customer')]")
    WebElement newCustomer;
    @CacheLookup
    @FindBy (xpath = "//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input")
    WebElement guestCheckout;
    @CacheLookup
    @FindBy (xpath = "//div[@id='collapse-checkout-option']/div/div/div[1]/input")
    WebElement continueTab;
    @CacheLookup
    @FindBy (name = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy (name = "lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy (id = "input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy (name = "telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy (xpath = "//fieldset[@id='address']/div[2]/input")
    WebElement address1;
    @CacheLookup
    @FindBy (name = "city")
    WebElement city;
    @CacheLookup
    @FindBy (name = "postcode")
    WebElement postCode;
    @CacheLookup
    @FindBy (xpath = "//div[@id='checkout-checkout']/div/div/div/div[2]/div[2]/div/div[1]/div[2]/fieldset/div[6]/select")
    WebElement country;
    @CacheLookup
    @FindBy (xpath = "//div[@id='checkout-checkout']/div/div/div/div[2]/div[2]/div/div[1]/div[2]/fieldset/div[7]/select")
    WebElement state;
    @CacheLookup
    @FindBy (xpath = "//div[@class='pull-right']/input")
    WebElement continueButton;
    @CacheLookup
    @FindBy (xpath = "//div[@id='collapse-payment-method']/div/p[2]/textarea")
    WebElement addComment;
    @CacheLookup
    @FindBy (xpath = "//div[@id='collapse-payment-method']/div/div[2]/div/input[1]")
    WebElement termsAndConditions;
    @CacheLookup
    @FindBy (xpath = "//div[@id='collapse-payment-method']/div/div[2]/div/input[2]")
    WebElement continueButton1;
    @CacheLookup
    @FindBy (xpath = "//div[@id=\"content\"]/div/div[3]/div[2]/div/div[1]")
    WebElement warningMessage;
    public String getNewCustomerText(){
        return getTextFromElement(newCustomer);
    }
    public void clickOnCheckout(){
        clickOnElement(guestCheckout);
    }
    public void clickOnContinue(){
        clickOnElement(continueTab);
    }
    public void fillMandatoryFields() throws InterruptedException {
        sendTextToElement(firstName, "Khushbu");
        sendTextToElement(lastName, "Patel");
        sendTextToElement(email, "khushbu777@gmail.com");
        sendTextToElement(telephone, "9879731846");
        sendTextToElement(address1, "20 High Street");
        sendTextToElement(city, "Dagenham");
        sendTextToElement(postCode, "RM8 0HJ");
        selectByIndexFromDropDown(country,3);
        Thread.sleep(3000);
        selectByIndexFromDropDown(state, 3);
    }
    public void continueButton(){
        clickOnElement(continueButton);
    }
    public void addComment(){
        sendTextToElement(addComment, "Codebuster Delivery");
    }
    public void clickTermsAndComment(){
        clickOnElement(termsAndConditions);
    }
    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public String verifyWarningMessage(){
        return getTextFromElement(warningMessage);
    }
}
