package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.base.BreadCrumbCategories;
import com.qa.pom.pages.*;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;

public class OpenSiteCheckBreadCrumbCheckTotal extends BaseTest {

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

        // Go to T-shirts page
        TshirtsPage tshirtsPage = myAccountPage.clickTshirts();
        log("Clicked on T-shirts");

        // Go to T-shirts page
        FadedTshirtPage fadedTshirtPage = tshirtsPage.clickFadedTshirt();
        log("Clicked on faded T-shirts");

        BaseTest baseTest = new BaseTest();






    }
}