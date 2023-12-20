package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacBookProductDetailPage extends Utility {
    private static final Logger log = LogManager.getLogger(MacBookProductDetailPage.class);
    public MacBookProductDetailPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[2]/h1")
    WebElement macBookText;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[4]/a/i")
    WebElement shoppingCartLink;

    public String verifyMacBookText(){
        return getTextFromElement(macBookText);
    }
    public void addToCart(){
        clickOnElement(addToCart);
    }
    public String verifyShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCartLink);
    }
}
