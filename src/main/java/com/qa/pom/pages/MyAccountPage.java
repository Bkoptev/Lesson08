package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;

public class MyAccountPage extends AbstractPage {

    private String regName = "TestQA";

    /**
     * Constructor
     *
     * @param testClass
     */
    public MyAccountPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    public void verifyName() {
        Assert.assertEquals("Name is not the same", regName, testClass.getDriver().getTitle());
        System.out.println(testClass.getDriver().getTitle());
    }
}
