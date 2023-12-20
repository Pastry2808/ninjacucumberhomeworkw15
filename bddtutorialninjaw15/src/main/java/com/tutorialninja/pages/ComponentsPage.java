package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ComponentsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComponentsPage.class);
    public ComponentsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2")
    WebElement verifyComponentsText;
    public String getComponentsText(){
        return getTextFromElement(verifyComponentsText);
    }
}
