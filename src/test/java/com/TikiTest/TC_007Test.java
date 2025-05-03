package com.TikiTest;

import java.util.logging.Logger;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.util.Util;

import com.pages.TikiPage.TC_007Page;
import com.utils.BasicTest;
import com.utils.Utils;


// Summary: Verify case-insensitive search
// Steps:
// 1. Navigate to: https://tiki.vn/
// 2. Click on "Search Bar"
// 3. Enter keywork "Iphone" and press ENTER
// 4. Enter keywork "iphone" and press ENTER
// Expected: 4. Both research return same or similar products
public class TC_007Test extends BasicTest {
        Logger logger = Logger.getLogger(TC_007Test.class.getName());

    @Test(enabled = true)
    public void registerFailed1() throws Exception {
        // Launch website
        String url = "https://tiki.vn/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url, "URL did not match.");

        TC_007Page homePage = new TC_007Page(driver);
        Utils.hardWait();
        Assert.assertTrue(homePage.inputSearchBar().isDisplayed(), "Search bar not displayed");
        logger.info("Search bar is displayed");
    
        homePage.clickButtonClose();
        logger.info("Close button is clicked");
        // Wait for the close button to disappear
        homePage.fillSearchBar("I");
        homePage.fillSearchBar("P");
        homePage.fillSearchBar("H");
        homePage.fillSearchBar("O");
        homePage.fillSearchBar("N");
        homePage.fillSearchBar("E");
        logger.info("Search bar is filled with 'IPHONE'");
        // Click on the search bar to trigger the suggestions
        homePage.clickSearchBar();
        List<WebElement> resultsUpper = homePage.textSuggestions();
        homePage.clickButtonFind();
        logger.info("Search button is clicked");
        // Wait for the search results page to load
        driver.get("https://tiki.vn/");
        Utils.hardWait(); // chờ trang quay lại
        homePage.clickButtonClose();
        logger.info("Close button is clicked");
    
        homePage.fillSearchBar("i");
        homePage.fillSearchBar("p");
        homePage.fillSearchBar("h");
        homePage.fillSearchBar("o");
        homePage.fillSearchBar("n");
        homePage.fillSearchBar("e");
        logger.info("Search bar is filled with 'iphone'");
        List<WebElement> resultsLower = homePage.textSuggestions();
    
        // Verify case-insensitive result
        Assert.assertEquals(resultsUpper.size(), resultsLower.size(), "Search results count mismatch.");
        logger.info("✅ PASS: Case-insensitive search returns consistent results.");
    
        logger.info("Test case TC_007Test is completed successfully.");

}}
