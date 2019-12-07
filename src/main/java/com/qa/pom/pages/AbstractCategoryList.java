package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class AbstractCategoryList extends AbstractPage{

    @FindBy(
            xpath =
                    "//li[@id='category-thumbnail']/../../following-sibling::li/a[@title='Dresses']")
    public static WebElement Dresses;

    @FindBy(
            xpath =
                    "//li[@id='category-thumbnail']/../../following-sibling::*/a[@title='T-shirts']")
    public static WebElement tShirts;

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
     * wait for loading button with product product list and click on it
     *
     * @return instance of product product list
     */
    public CategoryPage clickProductCategory(WebElement productCategory) {
        testClass.waitTillElementIsVisible(productCategory);
        productCategory.click();
        return new CategoryPage(testClass);
    }

    /**
     * wait for loading button with product product list and click on it
     *
     * @return instance of product product list
     */
    public ProductListPage clickProductList(WebElement productList) {
        testClass.waitTillElementIsVisible(productList);
        productList.click();
        return new ProductListPage(testClass);
    }
}
