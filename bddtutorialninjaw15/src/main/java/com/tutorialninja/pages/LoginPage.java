package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class);
    public LoginPage() { PageFactory.initElements(driver, this);
    }
    String emailAddress = "khushpatel1055@gmail.com";
    @CacheLookup
    @FindBy (xpath = "//h2[contains(text(), 'Returning Customer')]")
    WebElement returningCustomerText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]/div/form/input")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'My Account')]")
    WebElement verifyMyAcountText;
    public String getReturningCustomerText(){
        return getTextFromElement(returningCustomerText);
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public String verifyText(){
        return getTextFromElement(verifyMyAcountText);
    }
}
