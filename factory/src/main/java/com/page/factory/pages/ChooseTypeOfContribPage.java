package com.page.factory.pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSFindBy;
import java.util.concurrent.TimeUnit;


public class ChooseTypeOfContribPage {
    private final WebDriver driver;

    @iOSFindBy(xpath = "//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")
    public RemoteWebElement addPost;

    public ChooseTypeOfContribPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 15, TimeUnit.SECONDS), this);
    }

    public void AddPost(){
        addPost.click();
    }
}
