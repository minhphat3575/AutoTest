package com.pages.TikiPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_001Page extends BasePage {

    private By inputSearchBar = By.xpath("//div[@class='sc-dec0a11d-1 cfhkdd']");
    
    
    public TC_001Page(WebDriver givenDriver) {
        super(givenDriver);
        
    }
    
    public WebElement inputSearchBar() {
        return driver.findElement(inputSearchBar);
    }
    
}
