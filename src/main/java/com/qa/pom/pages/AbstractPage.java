package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.pages.productlist.product.PrintedDress;
import java.util.Set;
import org.junit.Assert;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    protected BaseTest testClass;

    public String actualWindow;

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

    // Focus at shopping cart
    @FindBy(xpath = "//div[@class='shopping_cart']/a")
    public WebElement shoppingCart;

    @FindBy(xpath = "//div[@class='product-atributes']/a")
    public WebElement itemAttributes;

    @FindBy(xpath = "//span[@class='remove_link']/a")
    public WebElement removeItem;

    @FindBy(xpath = "//span[contains(@class,'ajax_cart_no_product')]")
    public WebElement cartEmpty;

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
    public ShoppingCartSummary proceedToCheckout() {
        testClass.waitTillElementIsVisible(proceedToCheckout);
        proceedToCheckout.click();
        return new ShoppingCartSummary(testClass);
    }

    /** click at Continue shopping button */
    public void continueShopping() {
        testClass.waitTillElementIsVisible(continueShopping);
        continueShopping.click();
    }

    /**
     * @param webElement element which needs to to be opened in new tab
     * @return instance of page
     */
    public PrintedDress openInNewTabAndSwitch(WebElement webElement) {
        actualWindow = testClass.getDriver().getWindowHandle();
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

    /** close current tab */
    public void closeTab() {
        testClass.getDriver().close();
    }

    /** switches to active tab */
    public void switchToActiveTab() {
        testClass.getDriver().switchTo().window(actualWindow);
    }

    /** prints name of Cookies */
    public void printCookiesName() {
        Set<Cookie> cookies = testClass.getDriver().manage().getCookies();
        for (Cookie s : cookies) {
            System.out.println(s.getName());
        }
    }

    /**
     * Focus on cart and check color and size to match with expected
     *
     * @param s string from ENUM with expected color and size
     */
    public void focusOnCartAndCheckColorAndSize(String s) {
        testClass.actions.moveToElement(shoppingCart).perform();
        testClass.waitTillElementIsVisible(itemAttributes);
        Assert.assertEquals(
                "Color or size is not the same",
                s.replaceAll(",|\\s+", ""),
                itemAttributes.getText().replaceAll(",|\\s+", ""));
    }

    /** verify if cart is empty */
    public void checkCartIsEmpty() {
        testClass.waitTillElementIsVisible(cartEmpty);
        String s = "(empty)";
        Assert.assertEquals(
                "Color or size is not the same",
                s.replaceAll(",|\\s+", ""),
                cartEmpty.getText().replaceAll(",|\\s+", ""));
    }

    /** Removes item from Cart */
    public void removeItem() {
        testClass.waitTillElementIsVisible(removeItem);
        removeItem.click();
    }
}
