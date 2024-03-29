package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.category.AbstractCategory;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyAccountPage extends AbstractCategory {

    private String REG_NAME = "Test QA";
    private String NAME_XPATH = "//a[@class='account']/span";

    /**
     * Constructor
     *
     * @param testClass the instance of account page
     */
    public MyAccountPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /** Verify the name */
    public void verifyName() {
        Assert.assertEquals(
                "Name is not the same",
                REG_NAME,
                testClass.getDriver().findElement(By.xpath(NAME_XPATH)).getText());
    }
}
