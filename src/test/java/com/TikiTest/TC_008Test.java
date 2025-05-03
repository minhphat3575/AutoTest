package com.TikiTest;

import java.util.logging.Logger;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.util.Util;

import com.pages.TikiPage.TC_008Page;
import com.utils.BasicTest;
import com.utils.Utils;

// Verify accented and non-accented
// Step:
// 1. Navigate to: https://tiki.vn/
// 2. Click on "Search Bar"
// 3. Enter keywork "Sach" and press ENTER
// 4. Enter keywork "Sách" and press ENTER
// Expected: 4. Results return same for both input or similar products


public class TC_008Test extends BasicTest {
        Logger logger = Logger.getLogger(TC_007Test.class.getName());

    @Test(enabled = true)
    public void registerFailed1() throws Exception {
        // Launch website
        String url = "https://tiki.vn/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url, "URL did not match.");

        TC_008Page homePage = new TC_008Page(driver);
        Utils.hardWait();
        Assert.assertTrue(homePage.inputSearchBar().isDisplayed(), "Search bar not displayed");
        logger.info("Search bar is displayed");
    
        homePage.clickButtonClose();
        logger.info("Close button is clicked");
        // Wait for the close button to disappear
        homePage.fillSearchBar("s");
        homePage.fillSearchBar("a");
        homePage.fillSearchBar("c");
        homePage.fillSearchBar("h");

        logger.info("Search bar is filled with 'sach'");
        // Click on the search bar to trigger the suggestions
        homePage.clickSearchBar();
        List<WebElement> resultsAccented = homePage.textSuggestions();
        homePage.clickButtonFind();
        logger.info("Search button is clicked");
        // Wait for the search results page to load
        driver.get("https://tiki.vn/");
        Utils.hardWait(); // chờ trang quay lại
        homePage.clickButtonClose();
        logger.info("Close button is clicked");
    
        homePage.fillSearchBar("s");
        homePage.fillSearchBar("á");
        homePage.fillSearchBar("c");
        homePage.fillSearchBar("h");
        logger.info("Search bar is filled with 'sách'");
        List<WebElement> resultsNonAccented = homePage.textSuggestions();
    
        // Verify case-insensitive result
        Assert.assertEquals(resultsAccented.size(), resultsNonAccented.size(), "Search results count mismatch.");
        logger.info("✅ PASS: Case-accented and non-accented search returns consistent results.");
    
        logger.info("Test case TC_008Test is completed successfully.");

}}
