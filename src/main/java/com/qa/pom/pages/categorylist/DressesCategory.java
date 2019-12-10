package com.qa.pom.pages.categorylist;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.productlist.SummerDressesProductList;

public class DressesCategory extends AbstractCategoryList {
    /**
     * Constructor
     *
     * @param testClass
     */
    public DressesCategory(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }
    /**
     * wait for loading button with Summer Dresses and click on it
     *
     * @return instance of Summer Dresses
     */
    public SummerDressesProductList clickSummerDresses() {
        testClass.waitTillElementIsVisible(summerDresses);
        summerDresses.click();
        return new SummerDressesProductList(testClass);
    }
}
