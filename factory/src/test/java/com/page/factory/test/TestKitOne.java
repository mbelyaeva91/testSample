package com.page.factory.test;
import com.page.factory.pages.HubPage;
import com.page.factory.pages.FeedPage;
import com.page.factory.pages.ChooseTypeOfContribPage;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class TestKitOne {
    private WebDriver driver;
    HubPage hubPage;
    FeedPage feedPage;
    ChooseTypeOfContribPage chooseTypeOfContribPage;

    @BeforeClass
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.4.0");
        capabilities.setCapability(MobileCapabilityType.UDID, "c37901c26b0748d3b85d7641d3066adb99a60698");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5");
        String app = "/Users/a123/Library/Developer/Xcode/DerivedData/Build/Products/Debug-iphoneos/bloomfire.app";
        capabilities.setCapability(MobileCapabilityType.APP, app);
        driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test
    public void Test1() {
        System.out.println("Starting smoke test run...");
        hubPage = new HubPage(driver);
        System.out.println("one");
        hubPage.clickElement1();
        System.out.println("one");
        System.out.println("two");
        feedPage = new FeedPage(driver);
        System.out.println("three");
        System.out.println("four");
        feedPage.clickElement2();
        System.out.println("Success!");
        chooseTypeOfContribPage = new ChooseTypeOfContribPage(driver);
        chooseTypeOfContribPage.AddPost();
    }
}