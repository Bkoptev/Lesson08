package com.qa.pom.pages;

import com.qa.pom.base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyAccountPage extends AbstractPage {

    private String regName = "Test QA";
    private String nameXPath = "//a[@class='account']/span";

    /**
     * Constructor
     *
     * @param testClass
     */
    public MyAccountPage(BaseTest testClass) {
        super(testClass);
        testClass.waitTillElementIsVisible(pageDiv);
    }

    /** Verify the name */
    public void verifyName() {
        Assert.assertEquals(
                "Name is not the same",
                regName,
                testClass.getDriver().findElement(By.xpath(nameXPath)).getText());
        System.out.println(testClass.getDriver().getTitle());
    }

    /** Check log in page after log out */
    public void signOut() {
        testClass.getDriver().findElement(By.xpath("//a[@class='logout']")).click();
    }
}
