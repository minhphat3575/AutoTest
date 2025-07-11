package com.TikiTest;

import org.testng.Assert;
import org.testng.annotations.Test;



import com.pages.TikiPage.TC_003Page;
import com.utils.BasicTest;



// Summary Verify presence of Search Icon "magnifying glass"
// Steps: 
// 1. Navigate to: https://tiki.vn/
// 2. Check if the search icon is visible beside input field
// Expected: 2. Search icon "magnifying glass" is displayed correctly and clickable
public class TC_003Test extends BasicTest {


    @Test(enabled = true)
    public void registerFailed1() throws Exception {
        // Launch website
        String url = "https://tiki.vn/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);


        TC_003Page homePage = new TC_003Page(driver);

        Assert.assertTrue(homePage.inputSearchIcon().isDisplayed(), "Icon search is not displayed");
        // driver.findElement(By.xpath("//button[@name='register']")).click();
        // Utils.hardWait();

        // // Assert.assertTrue(driver.findElement(By.name("login")).isDisplayed());
        // String failedMessage = driver.findElement(By.xpath("//ul[@class ='woocommerce-error']/li")).getText(); 
    }


}
