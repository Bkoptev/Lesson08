package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.HomePage;
import com.qa.pom.pages.PythonPage;
import org.junit.Test;

public class OpenSiteAndClickPythonLinkTest extends BaseTest {

    /** Open site and click on Python link. Verify title */
    @Test
    public void testOpenSiteAndClickPythonLinkTest() {

        // Initialize HomePage
        HomePage homePage = openSite();

        // Click on Python Link
        PythonPage pythonPage = homePage.clickPythonLink();

        // Verify title
        pythonPage.verifyTitle();

        // CLose site
        closeSite();
    }
}
