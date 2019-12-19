package com.qa.pom.pages.category;

import com.qa.pom.base.BaseTest;

public class WomenCategory extends AbstractCategory {
    /**
     * Constructor
     *
     * @param testClass return the instance of Women сategory page
     */
    public WomenCategory(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }
}
