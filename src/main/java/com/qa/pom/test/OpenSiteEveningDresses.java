package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.HomePage;
import com.qa.pom.pages.LoginPage;
import com.qa.pom.pages.MyAccountPage;
import com.qa.pom.pages.productlist.EveningDressesProductList;
import com.qa.pom.pages.productlist.product.PrintedDress;
import org.junit.Test;

import java.io.IOException;

public class OpenSiteEveningDresses extends BaseTest {
    @Test
    public void testOpenSiteEveningDressesTest() throws IOException {

        // Initialize HomePage
        HomePage homePage = openSite();
        log("Initialized HomePage");

        // Click on log in Link
        LoginPage loginPage = homePage.clickLoginLink();
        log("Clicked on Sign In button");

        // Log in
        MyAccountPage myAccountPage = loginPage.logIn();
        log("Entered email and password on log in page and submit them");

        EveningDressesProductList eveningDressesProductList = myAccountPage.clickEveningDressesProductList();
        log("Waited for Evening Dresses and click on it");

        PrintedDress printedDress = eveningDressesProductList.openInNewTabAndSwitch(printedDress);

    }
}

