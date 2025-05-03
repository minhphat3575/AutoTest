package com.pages.TikiPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_005Page extends BasePage {

    private By inputSearchBar =  By.xpath("//input[@data-view-id='main_search_form_input']");
    private By buttonFind = By.xpath("//button[@class='sc-dec0a11d-3 agnbj']");
    private By textSuggestions = By.xpath("//a[@data-view-id='search_suggestion_keyword_item']");

    private By buttonCloseIcon = By.xpath("//img[@alt='close-icon']");
    
    public TC_005Page(WebDriver givenDriver) {
        super(givenDriver);
        
    }
    public void clickButtonClose(){
        waitForElementVisible(buttonCloseIcon);
        findElementByLocator(buttonCloseIcon).click();;
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

    public WebElement textSuggestions() {
        return driver.findElement(textSuggestions);
    }
    
}
