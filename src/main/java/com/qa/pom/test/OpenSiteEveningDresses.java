package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.enums.SizeAndColor;
import com.qa.pom.pages.HomePage;
import com.qa.pom.pages.LoginPage;
import com.qa.pom.pages.MyAccountPage;
import com.qa.pom.pages.productlist.EveningDressesProductList;
import com.qa.pom.pages.productlist.product.PrintedDress;
import java.io.IOException;
import org.junit.Test;

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

        EveningDressesProductList eveningDressesProductList =
                myAccountPage.clickEveningDressesProductList();
        log("Waited for Evening Dresses and click on it");

        PrintedDress printedDress =
                eveningDressesProductList.openInNewTabAndSwitch(
                        eveningDressesProductList.printedDres);
        log("Open printed dress product in new tab and switch on it");

        printedDress.chooseColor();
        log("Chosen pink colour");

        printedDress.chooseSizeL();
        log("Chosen 'L' size");

        printedDress.addToCart();
        log("Dress added to cart");

        printedDress.continueShopping();
        log("Continue shopping button clicked");

        printedDress.focusOnCartAndCheckColorAndSize(
                SizeAndColor.PINK.getValue() + SizeAndColor.L.getValue());
        log("Pink color and size L verified");

        printedDress.removeItem();
        log("Item removed from cart");

        printedDress.checkCartIsEmpty();
        log("Verified that cart is empty");

        printedDress.closeTab();
        log("Tab was closed");

        eveningDressesProductList.switchToActiveTab();
        log("Switched to active tab");

        printedDress.printCookiesName();
        log("Cookies name were printed");
    }
}
