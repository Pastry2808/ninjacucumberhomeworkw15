package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountsPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterAccountsPage.class);
    public RegisterAccountsPage() { PageFactory.initElements(driver, this);
    }
    String emailAddress = "khushpatel1055@gmail.com";
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement registerText;
    @CacheLookup
    @FindBy(name = "firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(name = "lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(name = "telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(name = "password")
    WebElement password;
    @CacheLookup
    @FindBy(name = "confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div/label[1]/input")
    WebElement subscribeButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[1]")
    WebElement privacyPolicy;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']/input[2]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(), 'Your Account Has Been Created!')]")
    WebElement verifyMessage;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(), 'Continue')]")
    WebElement continueButton1;
    public String getRegisterText(){
        return getTextFromElement(registerText);
    }
    public void enterFirstName(){
        sendTextToElement(firstName, "Khushbu");
    }
    public void enterLastName(){
        sendTextToElement(lastName, "Patel");
    }
    public void enterEmail(){
        sendTextToElement(email, emailAddress);
    }
    public void enterTelephone(){
        sendTextToElement(telephone, "9879731846");
    }
    public void enterPassword(){
        sendTextToElement(password, "Khushbu@2802#");
    }
    public void enterConfirmPassword(){
        sendTextToElement(confirmPassword, "Khushbu@2802#");
    }
    public void clickSubscribeButton(){
        clickOnElement(subscribeButton);
    }
    public void clickPrivacyPolicy(){
        clickOnElement(privacyPolicy);
    }
    public void continueButton(){
        clickOnElement(continueButton);
    }
    public String verifyMessageAccountCreated(){
        return getTextFromElement(verifyMessage);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton1);
    }
}
