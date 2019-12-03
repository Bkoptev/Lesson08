package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.*;
import java.io.IOException;
import org.junit.Test;

public class OpenSiteLogInCheckDress extends BaseTest {
    /** Open site and log in. Verify name. Log put and check the log in page. */
    @Test
    public void testOpenSiteAndClickPythonLinkTest() throws IOException {

        // Initialize HomePage
        HomePage homePage = openSite();

        // Click on log in Link
        LoginPage loginPage = homePage.clickLoginLink();

        // Log in
        MyAccountPage myAccountPage = loginPage.logIn();

        //Go to dresses page
        DressesPage dressesPage = myAccountPage.clickDresses();

        //Go to summer dresses page
        SummerDresses summerDresses = dressesPage.clickSummerDresses();

        // Compare the amount of goods and compare it with number in goods counter
        summerDresses.compareGoodsAmount();

        // CLose site
        closeSite();
    }
}
