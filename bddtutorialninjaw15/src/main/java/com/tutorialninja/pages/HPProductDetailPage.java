package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HPProductDetailPage extends Utility {
    private static final Logger log = LogManager.getLogger(HPProductDetailPage.class);
    public HPProductDetailPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='product-product']/div/div/div/div[2]/h1")
    WebElement verifyHPText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group date']/input")
    WebElement deliveryDate;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantity;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[4]/a/i")
    WebElement shoppingCartLink;
    public String getHpText() {
        return getTextFromElement(verifyHPText);
    }
    public void changeDeliveryDate(){
        deliveryDate.clear();
        sendTextToElement(deliveryDate, "2023-12-25");
    }
    public void changeQuantity(){
        clearTextFromField(By.xpath("//input[@id='input-quantity']"));
        sendTextToElement(quantity, "1");
    }
    public void addToCart(){
        clickOnElement(addToCart);
    }
    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
    }
}
