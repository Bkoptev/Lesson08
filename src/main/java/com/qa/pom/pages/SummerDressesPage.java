package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SummerDressesPage extends AbstractPage {

    // link which allow to find all products on page by counting <li>

    protected String NUM_PRODUCTS = "//ul[@class='product_list grid row']/li";

    /**
     * Constructor
     *
     * @param testClass the instance of summer dresses page
     */
    protected SummerDressesPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /** Find amount of goods and compare it with number in goods counter */
    public void compareGoodsAmount() {
        int count = Integer.parseInt(allProductsInCounter.getText().replaceAll("\\D+", ""));
        int numOfProducts = testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size();
        Assert.assertEquals("Amount is not the same", count, numOfProducts);
        testClass.log(
                "Number of products in counter "
                        + count
                        + "; Number of products on page"
                        + numOfProducts);
    }
}
