package com.qa.pom.pages.productlist.product;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.productlist.AbstractProductsList;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrintedDress extends AbstractProductsList {

    @FindBy(xpath = "//ul[@id='color_to_pick_list']//a[@title='Pink']")
    public WebElement pinkColor;

    @FindBy(xpath = "//select[@name='group_1']//option[@title='L']")
    public WebElement sizeL;

    /**
     * Constructor
     *
     * @param testClass return the instance of Printed Dress page
     */
    public PrintedDress(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /** Choose pink color */
    public void chooseColor() {
        testClass.waitTillElementIsVisible(pinkColor);
        pinkColor.click();
    }

    /** choose sie 'L' */
    public void chooseSizeL() {
        sizeL.click();
    }
}
