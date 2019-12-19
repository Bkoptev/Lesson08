package com.qa.pom.pages.productlist;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EveningDressesProductList extends AbstractProductsList {

    @FindBy(xpath = "//h5[@itemprop='name']/a")
    public WebElement printedDres;

    /**
     * Constructor
     *
     * @param testClass
     */
    public EveningDressesProductList(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }
}
