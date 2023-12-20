package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]/a")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]/div/a")
    WebElement showAllDesktopsLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/a")
    WebElement laptopAndNotebooksLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/div/a")
    WebElement showAllLaptopAndNotebooksLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]/a")
    WebElement componentsLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]/div/a")
    WebElement showAllComponentsLink;

    public void clickOnDesktop(){
        mouseHoverToElementAndClick(desktopLink);
    }
    public void clickOnShowAllDesktops(){
        clickOnElement(showAllDesktopsLink);
    }
    public void clickOnLaptopsAndNotebooksLink(){
        mouseHoverToElementAndClick(laptopAndNotebooksLink);
    }
    public void clickOnShowAllLaptopsAndNotebooksLink(){
        clickOnElement(showAllLaptopAndNotebooksLink);
    }
    public void clickOnComponentsLink(){
        mouseHoverToElementAndClick(componentsLink);
    }
    public void clickOnShowAllComponentsLink(){
        clickOnElement(showAllComponentsLink);
    }

}
