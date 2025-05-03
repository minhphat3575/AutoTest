package com.TikiTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.util.Util;

import com.pages.TikiPage.TC_004Page;
import com.pages.TikiPage.TC_005Page;
import com.utils.BasicTest;
import com.utils.Utils;

public class TC_005Test extends BasicTest {


    @Test(enabled = true)
    public void registerFailed1() throws Exception {
        // Launch website
        String url = "https://tiki.vn/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        

        TC_005Page homePage = new TC_005Page(driver);
        Utils.hardWait();
        Assert.assertTrue(homePage.inputSearchBar().isDisplayed(), "Search bar not displayed");
        System.out.println("Search bar is displayed");
        
        homePage.clickButtonClose();
        System.out.println("Close button is clicked");

        homePage.fillSearchBar("IP");
        System.out.println("Search bar is filled with 'IP'");



        // Verify that the search results page is displayed
        if(homePage.textSuggestions().isDisplayed()) {
            System.out.println("Search suggestions are displayed.");
        } else {
            System.out.println("Search suggestions are not displayed.");
        }   
        System.out.println("Test case TC_005Test is completed successfully.");
    }


}
