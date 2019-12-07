package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;

public class ProductListPage extends AbstractProductsList {
    /**
     * Constructor
     *
     * @param testClass
     */
    public ProductListPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }


}
