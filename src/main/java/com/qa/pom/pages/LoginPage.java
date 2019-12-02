package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import com.qa.pom.utils.YamlParser;
import org.openqa.selenium.By;

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

    /** Log in using email and password form configuration.yaml
     * @return*/
    public MyAccountPage logIn () throws IOException {
        testClass.getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys(YamlParser.getYamlData().getEmail());
        testClass.getDriver().findElement(By.xpath("//input[@id='passwd']")).sendKeys(YamlParser.getYamlData().getPassword());
        testClass.getDriver().findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        return new MyAccountPage(testClass);
    }

    public void verifyLoginPage () {
        testClass.waitTillElementIsVisible(submitButton);
    }


}
