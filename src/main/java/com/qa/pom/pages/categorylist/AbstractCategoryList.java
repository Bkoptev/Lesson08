package com.qa.pom.pages.categorylist;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractCategoryList extends AbstractPage {

    @FindBy(
            xpath =
                    "//li[@id='category-thumbnail']/../../following-sibling::li/a[@title='Dresses']")
    public WebElement Dresses;

    @FindBy(
            xpath =
                    "//li[@id='category-thumbnail']/../../following-sibling::*/a[@title='T-shirts']")
    public WebElement tShirts;

    @FindBy(
            xpath =
                    "//div[@id='categories_block_left']//ul[@class='tree dynamized']//a[contains (text(),'Summer Dresses')]")
    public WebElement summerDresses;

    /**
     * Constructor
     *
     * @param testClass
     */
    public AbstractCategoryList(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * wait for loading button with Dresses Category list and click on it
     *
     * @return instance of Dresses Category
     */
    public DressesCategory clickDressesCategory() {
        testClass.waitTillElementIsVisible(Dresses);
        Dresses.click();
        return new DressesCategory(testClass);
    }
    /**
     * wait for loading button with Tshirts Category list and click on it
     *
     * @return instance of Tshirts Category
     */
    public TshirtsCategory clickTshirtsCategory() {
        testClass.waitTillElementIsVisible(tShirts);
        tShirts.click();
        return new TshirtsCategory(testClass);
    }
}
