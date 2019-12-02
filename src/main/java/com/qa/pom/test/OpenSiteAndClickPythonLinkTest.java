package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.HomePage;
import com.qa.pom.pages.LoginPage;
import com.qa.pom.pages.MyAccountPage;
import org.junit.Test;

import java.io.IOException;

public class OpenSiteAndClickPythonLinkTest extends BaseTest {

    /** Open site and click on Python link. Verify title */
    @Test
    public void testOpenSiteAndClickPythonLinkTest() throws IOException {

        // Initialize HomePage
        HomePage homePage = openSite();

        // Click on log in Link
        LoginPage loginPage = homePage.clickLoginLink();

        // Log in
        //loginPage.logIn();

        //Verify name
        MyAccountPage myAccountPage = loginPage.logIn();

        // CLose site
        //closeSite();
    }
}
