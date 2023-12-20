package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class);
    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div/div/h1")
    WebElement shoppingCartText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProductName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement verifyDeliveryDate;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[3]")
    WebElement verifyModel;
    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table/tbody/tr/td[6]")
    WebElement verifyTotal;

    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/input")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']/i")
    WebElement updateTab;
    @CacheLookup
    @FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
    WebElement shoppingCartMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='pull-right']/a")
    WebElement checkout;

    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getProductName(){
        return getTextFromElement(verifyProductName);
    }
    public String getDeliveryDate(){
        return getTextFromElement(verifyDeliveryDate);
    }
    public String getModel(){
        return getTextFromElement(verifyModel);
    }
    public String getTotal(){
        return getTextFromElement(verifyTotal);
    }
    public void changeQuantity(){
        quantity.clear();
        sendTextToElement(quantity,"2");
    }
    public void clickOnUpdate(){
        clickOnElement(updateTab);
    }
    public String verifyMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void clickOnCheckout(){
        clickOnElement(checkout);
    }
}
