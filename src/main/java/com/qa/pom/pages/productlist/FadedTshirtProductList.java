package com.qa.pom.pages.productlist;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;

public class FadedTshirtProductList extends AbstractProductsList {

    /**
     * Constructor
     *
     * @param testClass the instance of faded t-shirts page
     */
    public FadedTshirtProductList(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Get string with expected bread crumb and compare
     *
     * @param s string from ENUM with expected breadcrumb
     */
    public void getAllCrumbs(String s) {
        testClass.waitTillElementIsVisible(addToCartButton);
        Assert.assertEquals(
                "BreadCrumb is not the same",
                s.replaceAll(",|\\s+", ""),
                "ReturntoHome" + BreadCrumb.getText().replaceAll(">|\\s+", ""));
    }
}
