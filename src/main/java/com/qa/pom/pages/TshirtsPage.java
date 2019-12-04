package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtsPage extends AbstractPage {

    @FindBy(xpath = "//ul[@class='product_list grid row']/li//a[contains(@title,'Short Sleeve')]")
    private WebElement fadedTShirts;

    /**
     * Constructor
     *
     * @param testClass return the instance of T-shirt page
     */
    public TshirtsPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Go to Faded T-shirt Page
     *
     * @return instance of Faded T-shirt Page
     */
    public FadedTshirtPage clickFadedTshirt() {
        testClass.waitTillElementIsVisible(fadedTShirts);
        fadedTShirts.click();
        return new FadedTshirtPage(testClass);
    }
}
