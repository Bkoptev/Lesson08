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

        DressesPage dressesPage = myAccountPage.clickDresses();

        SummerDresses summerDresses = dressesPage.clickSummerDresses();

        summerDresses.compareGoodsAmount();

        // CLose site
        closeSite();
    }
}
