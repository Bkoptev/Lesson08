package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.HomePage;
import com.qa.pom.pages.LoginPage;
import org.junit.Test;

public class OpenSiteAndClickPythonLinkTest extends BaseTest {

    /** Open site and click on Python link. Verify title */
    @Test
    public void testOpenSiteAndClickPythonLinkTest() {

        // Initialize HomePage
        HomePage homePage = openSite();

        // Click on Python Link
        LoginPage loginPage = homePage.clickPythonLink();

        // Verify title
        loginPage.verifyTitle();

        // CLose site
        closeSite();
    }
}
