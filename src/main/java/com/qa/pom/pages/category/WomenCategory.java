package com.qa.pom.pages.category;

import com.qa.pom.base.BaseTest;

public class WomenCategory extends AbstractCategory {
    /**
     * Constructor
     *
     * @param testClass
     */
    public WomenCategory(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }


}
