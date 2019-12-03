package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TshirtsPage extends AbstractPage {

    @FindBy(xpath = "//ul[@class='product_list grid row']/li//a[contains(@title,'Short Sleeve')]")
    private
    WebElement fadedTShirts;

    /**
     * Constructor
     *
     * @param testClass
     */
    public TshirtsPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    public FadedTshirtPage clickFadedTshirt() {
        testClass.waitTillElementIsVisible(fadedTShirts);
        fadedTShirts.click();
        return new FadedTshirtPage(testClass);
    }


}
