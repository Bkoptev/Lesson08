package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.HomePage;
import com.qa.pom.pages.LoginPage;
import com.qa.pom.pages.MyAccountPage;
import java.io.IOException;
import org.junit.Test;

public class OpenSiteLoginCheckNameLogOut extends BaseTest {

    /** Open site and log in. Verify name. Log put and check the log in page. */
    @Test
    public void testOpenSiteAndVerifyNameTest() throws IOException {

        // Initialize HomePage
        HomePage homePage = openSite();
        log("Initialized HomePage");

        // Click on log in Link
        LoginPage loginPage = homePage.clickLoginLink();
        log("Clicked on Sign In button");

        // Log in
        MyAccountPage myAccountPage = loginPage.logIn();
        log("Entered email and password on log in page and submit them");

        // Verify name
        myAccountPage.verifyName();
        log("Compared registration name and name on site");

        // Sign out
        loginPage = myAccountPage.signOut();
        log("Clicked on Sign Out button");

        // Verify log in page loaded again
        loginPage.verifyLoginPage();
        log("Logout was performed and Login page appeared");
    }
}
