package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AbstractProductsList extends AbstractPage{

    // link which allow to find all products on page by counting <li>
    public String NUM_PRODUCTS = "//ul[@class='product_list grid row']/li";

    public static   @FindBy(
            xpath =
                    "//div[@id='categories_block_left']//ul[@class='tree dynamized']//a[contains (text(),'Summer Dresses')]")
    WebElement summerDresses;

    /**
     * Constructor
     *
     * @param testClass
     */
    public AbstractProductsList(BaseTest testClass) {
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
