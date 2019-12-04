package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class shoppingCartSummary extends AbstractPage {

    @FindBy(xpath = "//div[contains(@class,'cart_quantity_button')]//a[@title='Add']")
    private WebElement addOneItem;

    @FindBy(xpath = "//tr[contains(@class,'cart_item')]//td[@class='cart_total']/span")
    private WebElement totalPrice;

    @FindBy(xpath = "//span[@id='summary_products_quantity' and contains(text(),'2')]")
    private WebElement quantity;

    @FindBy(xpath = "//td[@data-title='Delete']//a[@title='Delete']")
    private WebElement deleteButton;

    @FindBy(
            xpath =
                    "//p[@class='alert alert-warning' and contains(text(),'Your shopping cart is empty.')]")
    private WebElement cartIsEmptyMsg;

    /**
     * Constructor
     *
     * @param testClass return instance of shopping cart summary
     */
    public shoppingCartSummary(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /** get and parse price from page, add 1 good, get new price and compare them */
    public void comparePrice() {
        float beforePrice =
                Float.parseFloat(
                        this.totalPrice.getText().replaceAll("^.*?(-?\\d+(\\.\\d+)?).*$", "$1"));
        addOneItem.click();
        testClass.waitTillElementIsVisible(quantity);
        float afterPrice =
                Float.parseFloat(
                        this.totalPrice.getText().replaceAll("^.*?(-?\\d+(\\.\\d+)?).*$", "$1"));
        Assert.assertTrue(
                "Total price was not changed or was changed not properly",
                beforePrice < afterPrice);
    }

    /** delete goods from cart and verify that it is empty */
    public void deleteAndVerifyCartIsEmpty() {
        deleteButton.click();
        testClass.waitTillElementIsVisible(cartIsEmptyMsg);
    }
}
