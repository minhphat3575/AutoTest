package com.TikiTest;

import java.util.logging.Logger;


import org.testng.Assert;
import org.testng.annotations.Test;


import com.pages.TikiPage.TC_006Page;
import com.utils.BasicTest;
import com.utils.Utils;

public class TC_006Test extends BasicTest {

    Logger logger = Logger.getLogger(TC_006Test.class.getName());
    // Test case: Verify that the search bar is displayed and the search suggestions are shown when a keyword is entered.
    @Test(enabled = true)
    public void registerFailed1() throws Exception {
        // Launch website
        String url = "https://tiki.vn/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        

        TC_006Page homePage = new TC_006Page(driver);
        Utils.hardWait();
        Assert.assertTrue(homePage.inputSearchBar().isDisplayed(), "Search bar not displayed");
        logger.info("Search bar is displayed");
        
        homePage.clickButtonClose();
        
        logger.info("Close button is clicked");

        homePage.fillSearchBar("I");
        homePage.fillSearchBar("P");
        logger.info("Search bar is filled with 'IP'");
        

        homePage.clickSearchBar();
        Utils.hardWait(); // Wait for the search suggestions to load
        // Verify that the search results page is displayed
        if(homePage.textSuggestions().isDisplayed()) {
            logger.info("Search suggestions are displayed.");
        } else {
            logger.info("Search suggestions are not displayed.");
        }   
        logger.info("Test case TC_006Test is completed successfully.");
    }


}
