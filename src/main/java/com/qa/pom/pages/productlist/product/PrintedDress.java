package com.qa.pom.pages.productlist.product;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.productlist.AbstractProductsList;

public class PrintedDress  extends AbstractProductsList {
    /**
     * Constructor
     *
     * @param testClass
     */
    public PrintedDress(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }
}
