package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class);
    public LaptopsAndNotebooksPage() { PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2")
    WebElement verifyLaptopsAndNotebooksText;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement sortByHighToLow;
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[4]/div[4]/div/div[2]/div[1]/h4/a")
    WebElement macBook;
    public String getLaptopsAndNotebooksText(){
        return getTextFromElement(verifyLaptopsAndNotebooksText);
    }
    public void sortHighToLow(){
        selectByIndexFromDropDown(sortByHighToLow,4);
    }
    public void selectMacbook(){
        clickOnElement(macBook);
    }
}
