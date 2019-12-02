package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.utils.YamlParser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='email']")
    private
    WebElement email;

    @FindBy(xpath = "//input[@id='passwd']")
    private
    WebElement password;

    /**
     * Constructor
     *
     * @param testClass the instance of login page
     */
    LoginPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /**
     * Log in using email and password form configuration.yaml
     *
     * @return next page
     */
    public MyAccountPage logIn() throws IOException {
        email.sendKeys(YamlParser.getYamlData().getEmail());
        password.sendKeys(YamlParser.getYamlData().getPassword());
        submitButton.click();
        return new MyAccountPage(testClass);
    }

    /** Wait till Submit button become visible */
    public void verifyLoginPage() {
        testClass.waitTillElementIsVisible(submitButton);
    }
}
