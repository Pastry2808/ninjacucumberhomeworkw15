package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class);
    public DesktopPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2")
    WebElement verifyDesktopsText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group input-group input-group-sm']/select")
    WebElement sortOrder;
    @CacheLookup
    @FindBy(xpath = "//div[@id='product-category']/div/div/div[4]/div[3]/div/div[2]/div[1]/h4/a")
    WebElement product;
    public String getDesktopsText(){
        return getTextFromElement(verifyDesktopsText);
    }
    public void sortDescendingOrder(){
        //selectByVisibleTextFromDropDown(sortOrder,"Name (Z - A)");
        selectByIndexFromDropDown(sortOrder,2);
    }
    public void verifySortedInDescendingOrder(){
        List<WebElement> productElements = driver.findElements(By.xpath("//div[@id=\"content\"]/div[4]/div"));
        // Extract product names and store them in a list
        List<String> productNames = new ArrayList<>();
        for (WebElement productElement : productElements) {
            productNames.add(productElement.getText());
        }
//        Check if product names are in alphabetical order
        boolean isAlphabeticalOrder = true;
        for (int i = 1; i < productNames.size(); i++) {
            if (productNames.get(i - 1).compareToIgnoreCase(productNames.get(i)) > 0) {
                isAlphabeticalOrder = false;
                break;
            }
        }
        if (isAlphabeticalOrder) {
            System.out.println("Products are arranged in alphabetical order A-Z. ");
        } else {
            System.out.println("Products are arranged in alphabetical order Z-A.");
        }
    }
    public void sortAscendingOrder(){
        selectByIndexFromDropDown(sortOrder,1);
    }
    public void selectHPDesktop(){
        clickOnElement(product);
    }
}
