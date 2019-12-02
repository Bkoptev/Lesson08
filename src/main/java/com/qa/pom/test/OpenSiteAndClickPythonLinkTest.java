package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.HomePage;
import com.qa.pom.pages.LoginPage;
import com.qa.pom.pages.MyAccountPage;
import java.io.IOException;
import org.junit.Test;

public class OpenSiteAndClickPythonLinkTest extends BaseTest {

    /** Open site and log in. Verify name. Log put and check the log in page. */
    @Test
    public void testOpenSiteAndClickPythonLinkTest() throws IOException {

        // Initialize HomePage
        HomePage homePage = openSite();

        // Click on log in Link
        LoginPage loginPage = homePage.clickLoginLink();

        // Log in
        MyAccountPage myAccountPage = loginPage.logIn();

        // Verify name
        myAccountPage.verifyName();

        // Sign out
        loginPage = myAccountPage.signOut();

        // Verify log in page loaded again
        loginPage.verifyLoginPage();

        // CLose site
        closeSite();
    }
}
