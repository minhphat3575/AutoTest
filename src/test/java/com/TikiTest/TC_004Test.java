package com.TikiTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.util.Util;

import com.pages.TikiPage.TC_004Page;
import com.utils.BasicTest;
import com.utils.Utils;

public class TC_004Test extends BasicTest {


    @Test(enabled = true)
    public void registerFailed1() throws Exception {
        // Launch website
        String url = "https://tiki.vn/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);


        TC_004Page homePage = new TC_004Page(driver);

        Assert.assertTrue(homePage.inputSearchBar().isDisplayed(), "Icon search is not displayed");

        String placeholderText = homePage.inputSearchBar().getAttribute("placeholder");
        Assert.assertNotNull(placeholderText, "Placeholder attribute is missing!");
        Assert.assertFalse(placeholderText.trim().isEmpty(), "Placeholder text is empty!");
    }


}
