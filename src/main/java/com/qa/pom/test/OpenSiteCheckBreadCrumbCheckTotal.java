package com.qa.pom.test;

import com.qa.pom.base.BaseTest;
import com.qa.pom.enums.BreadCrumbCategories;
import com.qa.pom.pages.*;
import com.qa.pom.pages.category.TshirtsCategory;
import com.qa.pom.pages.productlist.FadedTshirtProductList;
import java.io.IOException;
import org.junit.Test;

public class OpenSiteCheckBreadCrumbCheckTotal extends BaseTest {

    /** Open site and log in. Verify name. Log put and check the log in page. */
    @Test
    public void testOpenSiteAndCHeckBreadCrumbCheckTotalTest() throws IOException {

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
        TshirtsCategory tshirtsCategory = myAccountPage.clickTshirtsCategory();
        log("Clicked on T-shirts");

        // Go to T-shirts page
        FadedTshirtProductList fadedTshirtProductList =
                tshirtsCategory.clickFadedTshirtProductList();
        log("Clicked on faded T-shirts");

        // Comparing BreadCrumbs
        fadedTshirtProductList.getAllCrumbs(
                BreadCrumbCategories.HOME.getValue()
                        + BreadCrumbCategories.WOMEN.getValue()
                        + BreadCrumbCategories.TOPS.getValue()
                        + BreadCrumbCategories.TSHIRTS.getValue()
                        + BreadCrumbCategories.FADED_SHORT_SLEEVE_TSHIRTS.getValue());
        log("Compared expected BreadCrumb with current");

        fadedTshirtProductList.addToCart();
        log("Tshirt was added to cart");

        ShoppingCartSummary shoppingCartSummary = fadedTshirtProductList.proceedToCheckout();
        log("Clicked  Proceed to checkout button");

        shoppingCartSummary.comparePrice();
        log("Price before increasing the amount of goods compared to prise after increasing");

        shoppingCartSummary.deleteAndVerifyCartIsEmpty();
        log("All goods deleted and message is shown");
    }
}
