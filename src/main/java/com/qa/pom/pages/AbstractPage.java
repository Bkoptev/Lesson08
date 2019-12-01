package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected BaseTest testClass;

    //
    // Web elements with @FindBy annotation
    //
    @FindBy(xpath = "//ul[@id='main-nav']//span[.='PYTHON']/..")
    private WebElement pythonLink;

    @FindBy(xpath = "//div[@id='main']")
    protected WebElement pageDiv;

    /** Constructor */
    public AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this); // Initialize WebElements
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Click on Python link and get instance of page
     *
     * @return PythonPage
     */
    public PythonPage clickPythonLink() {
        testClass.waitTillElementIsVisible(pythonLink);
        pythonLink.click();
        return new PythonPage(testClass);
    }
}
