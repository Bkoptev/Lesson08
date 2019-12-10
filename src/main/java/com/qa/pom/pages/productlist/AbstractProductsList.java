package com.qa.pom.pages.productlist;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.AbstractPage;
import org.openqa.selenium.WebElement;

public abstract class AbstractProductsList extends AbstractPage {

    // link which allow to find all products on page by counting <li>
    public String NUM_PRODUCTS = "//ul[@class='product_list grid row']/li";

    /**
     * Constructor
     *
     * @param testClass
     */
    public AbstractProductsList(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * wait for loading button with product product list and click on it
     *
     * @return instance of product product list
     */
    public FadedTshirtProductList clickProductList(WebElement productList) {
        testClass.waitTillElementIsVisible(productList);
        productList.click();
        return new FadedTshirtProductList(testClass);
    }
}
