package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FadedTshirtPage extends AbstractPage {

    // Expected breadcrumb after clearing it from '<' and spaces
    public String expectedBreadcrumb = "ReturntoHomeWomenTopsT-shirtsFadedShortSleeveT-shirts";

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

    // replace getAllCrumbs with cleverer method

    /** Comparing of breadcrumbs. */
    public void getAllCrumbs() {
        Assert.assertEquals(
                "BreadCrumb is not the same",
                expectedBreadcrumb,
                "ReturntoHome" + BreadCrumb.getText().replaceAll(">|\\s+", ""));
    }
}
