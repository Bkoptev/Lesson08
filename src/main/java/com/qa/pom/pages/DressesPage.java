package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DressesPage extends AbstractPage {

    private @FindBy(
            xpath =
                    "//div[@id='categories_block_left']//ul[@class='tree dynamized']//a[contains (text(),'Summer Dresses')]")
    WebElement summerDresses;

    /**
     * Constructor
     *
     * @param testClass the instance of dresses page
     */
    DressesPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * wait for loading button with summer dresses and click on it
     *
     * @return instance of summer dresses page
     */
    public SummerDressesPage clickSummerDresses() {
        testClass.waitTillElementIsVisible(summerDresses);
        summerDresses.click();
        return new SummerDressesPage(testClass);
    }
}
