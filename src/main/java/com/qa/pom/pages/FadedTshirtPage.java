package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FadedTshirtPage extends AbstractPage {

    /** Breadcrumb webelement with path without home page */
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement BreadCrumb;

    /**
     * Constructor
     *
     * @param testClass the instance of faded t-shirts page
     */
    public FadedTshirtPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Get string with expected bread crumb and compare
     *
     * @param s string from ENUM with expected breadcrumb
     */
    public void getAllCrumbs(String s) {
        Assert.assertEquals(
                "BreadCrumb is not the same",
                s.replaceAll(",|\\s+", ""),
                "ReturntoHome" + BreadCrumb.getText().replaceAll(">|\\s+", ""));
    }
}
