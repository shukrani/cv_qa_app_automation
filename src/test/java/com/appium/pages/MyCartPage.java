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
			PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);
			return cartPageObjects.checkout.isDisplayed();

		} catch (Exception e) {
			return false;
		}
	}

	public void proceedToCheckout(AppiumDriver<MobileElement> driver) {
		try {

			cartPageObjects.checkout.click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void proceedToPayment(AppiumDriver<MobileElement> driver) {
		try {
			PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);
			cartPageObjects.proceedToPayment.click();
			waitForElementToDisAppear(cartPageObjects.proceedToPayment);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void proceedToPaymentGuest(AppiumDriver<MobileElement> driver) {
		try {
			PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);
			cartPageObjects.guestEmail.sendKeys("cl" + System.currentTimeMillis() + "@mailinator.com");
			cartPageObjects.guestProceed.click();
			if (isElementDisplayed(cartPageObjects.guestProceed)) {

				cartPageObjects.guestProceed.click();
				guestAddAddress();

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void placeOrder(AppiumDriver<MobileElement> driver) {
		try {
			PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);
			waitForElement(cartPageObjects.placeOrder).click();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public boolean verifyOrder(AppiumDriver<MobileElement> driver) {
		try {
			PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);

			return !isElementDisplayed(cartPageObjects.placeOrder);

		} catch (Exception e) {
			e.printStackTrace();

			return false;
		}
	}

	public void removeItems(AppiumDriver<MobileElement> driver) {
		for (MobileElement e : cartPageObjects.removeOptions) {
			if (e.isDisplayed()) {
				e.click();
				PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);
				if (isElementDisplayed(cartPageObjects.removeButton)) {
					cartPageObjects.removeButton.click();
				}
			}
		}

	}

	public void guestAddAddress() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), cartPageObjects);
		cartPageObjects.pincode.sendKeys("400093");
		cartPageObjects.firstName.sendKeys("test");
		cartPageObjects.lastName.sendKeys("user");

	}

}
