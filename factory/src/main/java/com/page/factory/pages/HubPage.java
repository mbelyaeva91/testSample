package com.page.factory.pages;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HubPage {
    private final WebDriver driver;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[3]")
    public RemoteWebElement element1;

    // constructor for this page object, which includes initElements() method
    // to instantiate all IOS elements in this page
    public HubPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator (driver, 15, TimeUnit.SECONDS),this);// instantiating all elements
        // this method above takes Webdriver as parameter
    }

    public void clickElement1() {
        element1.click();
    }

}
