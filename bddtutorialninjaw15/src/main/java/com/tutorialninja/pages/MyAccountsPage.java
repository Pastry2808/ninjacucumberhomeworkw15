package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountsPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountsPage.class);
    public MyAccountsPage() { PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[2]/a/span[1]")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[2]/ul/li[1]/a")
    WebElement register;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[2]/ul/li[2]/a")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[2]/ul/li[5]/a")
    WebElement logOut;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement verifyAccountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']/a")
    WebElement clickContinueButton;
    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }
    public void clickOnRegister(){
        clickOnElement(register);
    }
    public void clickOnLogin(){
        clickOnElement(login);
    }
    public void logOut(){
        clickOnElement(logOut);
    }
    public String getVerifyAccountLogoutText(){
        return getTextFromElement(verifyAccountLogoutText);
    }
    public void clickContinue(){
        clickOnElement(clickContinueButton);
    }
}
