package com.qa.pom.pages.productlist;

import com.qa.pom.base.BaseTest;

public class EveningDressesProductList extends AbstractProductsList{
    /**
     * Constructor
     *
     * @param testClass
     */
    public EveningDressesProductList(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }
}
