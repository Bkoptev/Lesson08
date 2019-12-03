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
     * @param testClass
     */
    SummerDresses(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    public void compareGoodsAmount() {
        System.out.println(
                "There are "
                        + Integer.parseInt(
                                allProductsInCounter
                                        .getText()
                                        .replaceAll("^.*?(-?\\d+(\\.\\d+)?).*$", "$1"))
                        + " products in counter");
        System.out.println(
                "Items on page"
                        + testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size());
        Assert.assertEquals(
                "Amount is not the same",
                Integer.parseInt(
                        allProductsInCounter
                                .getText()
                                .replaceAll("^.*?(-?\\d+(\\.\\d+)?).*$", "$1")),
                testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size());
    }
}
