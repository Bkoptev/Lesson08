package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.utils.YamlParser;
import java.io.IOException;

public class LoginPage extends AbstractPage {

    /**
     * Constructor
     *
     * @param testClass
     */
    public LoginPage(BaseTest testClass) {
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

    public void verifyLoginPage() {
        testClass.waitTillElementIsVisible(submitButton);
    }
}
