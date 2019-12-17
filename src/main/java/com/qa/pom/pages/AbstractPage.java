package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.productlist.product.PrintedDress;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public abstract class AbstractPage {

    protected BaseTest testClass;


    //
    // Web elements with @FindBy annotation
    //
    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginLink;

    @FindBy(xpath = "//div[@id='page']")
    public WebElement pageDiv;

    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    protected WebElement submitButton;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement logOutButton;

    @FindBy(xpath = "//p[@id='add_to_cart']//span")
    protected WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='clearfix']//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//div[@class='clearfix']//span[@title='Continue shopping']/span")
    private WebElement continueShopping;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement allProductsInCounter;

    // Breadcrumb webelement with path without home page
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    public WebElement BreadCrumb;

    /**
     * Constructor
     */
    public AbstractPage(BaseTest testClass) {
        this.testClass = testClass;
        PageFactory.initElements(testClass.getDriver(), this); // Initialize WebElements
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Click on Log in button and get instance of page
     *
     * @return LogInPage
     */
    public LoginPage clickLoginLink() {
        testClass.waitTillElementIsVisible(loginLink);
        loginLink.click();
        return new LoginPage(testClass);
    }

    /**
     * Check log in page after log out
     *
     * @return Log in page
     */
    public LoginPage signOut() {
        logOutButton.click();
        return new LoginPage(testClass);
    }

    /**
     * Click at 'add to cart' button
     */
    public void addToCart() {
        addToCartButton.click();
    }

    /**
     * wait for pop up with 'proceed to checkout' button appear and
     *
     * @return instance of shopping cart summary page
     */
    public ShoppingCartSummary proceedToCheckout() {
        testClass.waitTillElementIsVisible(proceedToCheckout);
        proceedToCheckout.click();
        return new ShoppingCartSummary(testClass);
    }

    public void continueShopping() {
        testClass.waitTillElementIsVisible(continueShopping);
        continueShopping.click();
    }

    public PrintedDress openInNewTabAndSwitch (WebElement webElement) {
        String actualWindow = testClass.getDriver().getWindowHandle();
        webElement.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));

        Set<String> windows = testClass.getDriver().getWindowHandles();
        String newWindow = null;
        for (String window : windows) {
            if (!window.equals(actualWindow)) {
                newWindow = window;
            }
        }
        testClass.getDriver().switchTo().window(newWindow);
        return new PrintedDress(testClass);
    }
}
