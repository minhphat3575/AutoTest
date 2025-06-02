package com.pages.TikiPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_004Page extends BasePage {

    //private By inputSearchBar = By.xpath("//div[@class='sc-dec0a11d-1 cfhkdd']");
    private By inputSearchBar = By.xpath("//input[@placeholder]");
    private By textPlaceholder = By.xpath("//input[@placeholder='Freeship đơn từ 45k']");
    
    public TC_004Page(WebDriver givenDriver) {
        super(givenDriver);
        
    }
    
    public WebElement inputSearchBar() {
        return driver.findElement(inputSearchBar);
    }
    
}
