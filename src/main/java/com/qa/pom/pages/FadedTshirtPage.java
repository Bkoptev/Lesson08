package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;

public class FadedTshirtPage extends AbstractPage {
    /**
     * Constructor
     *
     * @param testClass
     */
    public FadedTshirtPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    
}
