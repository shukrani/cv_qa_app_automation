package com.appium.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.MyCartPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyCartPage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	MyCartPageObjects cartPageObjects = new MyCartPageObjects();

	public MyCartPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public boolean isCartPage(AppiumDriver<MobileElement> driver) {
		try {
			return cartPageObjects.checkout.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}

}
