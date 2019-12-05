package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    BaseTest testClass;

    //
    // Web elements with @FindBy annotation
    //
    @FindBy(xpath = "//a[@class='login']")
    private WebElement loginLink;

    @FindBy(xpath = "//div[@id='page']")
    protected WebElement pageDiv;

    @FindBy(xpath = "//button[@id='SubmitLogin']/span")
    protected WebElement submitButton;

    @FindBy(xpath = "//a[@class='logout']")
    private WebElement logOutButton;

    @FindBy(
            xpath =
                    "//li[@id='category-thumbnail']/../../following-sibling::li/a[@title='Dresses']")
    protected WebElement Dresses;

    @FindBy(
            xpath =
                    "//li[@id='category-thumbnail']/../../following-sibling::*[2]/a[@title='T-shirts']")
    protected WebElement tShirts;

    @FindBy(xpath = "//p[@id='add_to_cart']//span")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='clearfix']//a[@title='Proceed to checkout']")
    private WebElement proceedToCheckout;

    @FindBy(xpath = "//span[@class='heading-counter']")
    public WebElement allProductsInCounter;

    /** Constructor */
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

    /** Click at 'add to cart' button */
    public void addToCart() {
        addToCartButton.click();
    }

    /**
     * wait for pop up with 'proceed to checkout' button appear and
     *
     * @return instance of shopping cart summary page
     */
    public shoppingCartSummary proceedToCheckout() {
        testClass.waitTillElementIsVisible(proceedToCheckout);
        proceedToCheckout.click();
        return new shoppingCartSummary(testClass);
    }
}
