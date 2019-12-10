package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.*;
import com.qa.pom.pages.categorylist.DressesCategory;
import com.qa.pom.pages.productlist.SummerDressesProductList;
import java.io.IOException;
import org.junit.Test;

public class OpenSiteLogInCheckDress extends BaseTest {
    /** Open site and log in. Verify name. Log put and check the log in page. */
    @Test
    public void testOpenSiteAndCHeckDressesTest() throws IOException {

        // Initialize HomePage
        HomePage homePage = openSite();
        log("Initialized HomePage");

        // Click on log in Link
        LoginPage loginPage = homePage.clickLoginLink();
        log("Clicked on Sign In button");

        // Log in
        MyAccountPage myAccountPage = loginPage.logIn();
        log("Entered email and password on log in page and submit them");

        // Go to dresses page
        DressesCategory dressesPage = myAccountPage.clickDressesCategory();
        log("Clicked on Dresses");

        // Go to summer dresses page
        SummerDressesProductList summerDressesProductList = dressesPage.clickSummerDresses();
        log("Clicked on Summer Dresses");

        // Compare the amount of goods and compare it with number in goods counter
        summerDressesProductList.compareGoodsAmount();
    }
}
