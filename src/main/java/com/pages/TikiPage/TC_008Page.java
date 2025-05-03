package com.pages.TikiPage;

import java.security.Key;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TC_008Page extends BasePage {

    private By inputSearchBar =  By.xpath("//input[@data-view-id='main_search_form_input']");
    private By buttonFind = By.xpath("//button[@data-view-id='main_search_form_button']");
    private By textSuggestions = By.xpath("//a[@data-view-id='search_suggestion_keyword_item']");

    private By buttonCloseIcon = By.xpath("//img[@alt='close-icon']");
    Actions action = new Actions(driver);
    public TC_008Page(WebDriver givenDriver) {
        super(givenDriver);
        
    }
    public void clickButtonClose(){
        waitForElementVisible(buttonCloseIcon);
        findElementByLocator(buttonCloseIcon).click();
        
    }

    public void clickSearchBar(){
        waitForElementVisible(inputSearchBar);
        findElementByLocator(inputSearchBar).click();
        
    }

    public WebElement inputSearchBar() {
        return driver.findElement(inputSearchBar);
    }
   
    public void fillSearchBar(String text) {
        waitForElementVisible(inputSearchBar);
        findElementByLocator(inputSearchBar).clear();
        findElementByLocator(inputSearchBar).sendKeys(text);      
    }

    public void clickButtonFind(){
        waitForElementVisible(buttonFind);
        findElementByLocator(buttonFind).click();

    }

    public List<WebElement> textSuggestions() {
        return driver.findElements(textSuggestions);
    }
    
}
