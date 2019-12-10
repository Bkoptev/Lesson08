package com.qa.pom.pages.categorylist;

import com.qa.pom.base.BaseTest;

public class WomenCategoryList extends AbstractCategoryList {
    /**
     * Constructor
     *
     * @param testClass
     */
    public WomenCategoryList(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }


}
