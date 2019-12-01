package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;

public class HomePage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public HomePage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }
}
