package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CategoryPage extends AbstractCategoryList {


    /**
     * Constructor
     *
     * @param testClass
     */
    public CategoryPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }


}
