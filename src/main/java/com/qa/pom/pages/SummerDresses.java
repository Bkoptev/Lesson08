package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummerDresses extends AbstractPage {

    @FindBy(xpath = "//span[@class='heading-counter']")
    private WebElement allProductsInCounter;

    private String NUM_PRODUCTS = "//ul[@class='product_list grid row']/li";

    /**
     * Constructor
     *
     * @param testClass the instance of summer dresses page
     */
    SummerDresses(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Find amount of goods and compare it with number in goods counter
     */
    public void compareGoodsAmount() {

        Assert.assertEquals(
                "Amount is not the same",
                Integer.parseInt(
                        allProductsInCounter
                                .getText()
                                .replaceAll("^.*?(-?\\d+(\\.\\d+)?).*$", "$1")),
                testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size());
    }
}
