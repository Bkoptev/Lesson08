package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummerDresses extends AbstractPage {

//    @FindBy(xpath = "//ul[@class='product_list grid row']//li[contains(@class,'ajax_block_product')]")
//    private WebElement allSummerDresses;

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
        System.out.println(Integer.parseInt(allProductsInCounter.getText().replaceAll("^.*?(-?\\d+(\\.\\d+)?).*$", "$1")));
        System.out.println(testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size());
        Assert.assertEquals(
                "Amount is not the same",
                Integer.parseInt(allProductsInCounter.getText().replaceAll("^.*?(-?\\d+(\\.\\d+)?).*$", "$1")),
                testClass.getDriver().findElements(By.xpath(NUM_PRODUCTS)).size());
    }
}
