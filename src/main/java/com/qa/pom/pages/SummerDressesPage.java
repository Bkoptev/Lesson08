package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummerDressesPage extends AbstractPage {

    @FindBy(xpath = "//span[@class='heading-counter']")
    private WebElement allProductsInCounter;

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

        Assert.assertEquals(
                "Amount is not the same",
                Integer.parseInt(allProductsInCounter.getText().replaceAll("\\D+", "")),
                testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size());
        testClass.log(
                "Number of products in counter "
                        + Integer.parseInt(allProductsInCounter.getText().replaceAll("\\D+", ""))
                        + "; Number of products on page"
                        + testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size());
    }
}
