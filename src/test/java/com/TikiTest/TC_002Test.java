package com.TikiTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mongodb.util.Util;

import com.pages.TikiPage.TC_002Page;
import com.utils.BasicTest;
import com.utils.Utils;

public class TC_002Test extends BasicTest {


    @Test(enabled = true)
    public void registerFailed1() throws Exception {
        // Launch website
        String url = "https://tiki.vn/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);


        TC_002Page homePage = new TC_002Page(driver);

        Assert.assertTrue(homePage.inputSearchBar().isDisplayed(), "Search bar is not displayed");
        // driver.findElement(By.xpath("//button[@name='register']")).click();
        // Utils.hardWait();

        // // Assert.assertTrue(driver.findElement(By.name("login")).isDisplayed());
        // String failedMessage = driver.findElement(By.xpath("//ul[@class ='woocommerce-error']/li")).getText(); 
    }


}
