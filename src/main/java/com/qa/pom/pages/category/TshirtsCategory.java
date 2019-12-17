package com.qa.pom.pages.category;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.AbstractPage;
import com.qa.pom.pages.productlist.FadedTshirtProductList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtsCategory extends AbstractPage {

    @FindBy(
            xpath =
                    "//ul[@class='product_list grid row']//div[@class='right-block']//a[@class='product-name']")
    public WebElement fadedTShirts;

    /**
     * Constructor
     *
     * @param testClass return the instance of T-shirt page
     */
    public TshirtsCategory(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Go to Faded T-shirt Page
     *
     * @return instance of Faded T-shirt Page
     */
    public FadedTshirtProductList clickFadedTshirtProductList() {
        fadedTShirts.click();
        return new FadedTshirtProductList(testClass);
    }
}
