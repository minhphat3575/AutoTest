package com.pages.TikiPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_003Page extends BasePage {

    private By inputSearchIcon = By.xpath("//img[@class='icon-search']");
    
    
    public TC_003Page(WebDriver givenDriver) {
        super(givenDriver);
        
    }
    
    public WebElement inputSearchIcon() {
        return driver.findElement(inputSearchIcon);
    }
    
}
