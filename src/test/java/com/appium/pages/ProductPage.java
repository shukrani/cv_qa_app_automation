package com.appium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.ProductPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductPage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	ProductPageObjects productPageObjects = new ProductPageObjects();

	public ProductPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), productPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public void addToCart() {
		waitForElement(productPageObjects.ADD_TO_CART_BUTTON).click();

	}

	public void buyNow() {
		waitForElement(productPageObjects.BUY_NOW_BUTTON).click();

	}

	public boolean isCODAvailable() {

		try {
			
			return waitForElement(productPageObjects.COD_AVAILABLE).isDisplayed();
		} catch (Exception e) {
			return false;
		}

	}

	public int getCartCount() {

		int count = 0;
		try {
			if (isElementPresent(By.id("com.craftsvilla.app:id/mTextViewCartCount"))
					&& waitForElement(productPageObjects.CART_COUNT).isDisplayed()) {

				int trycount = 0;
				while (count == 0 && trycount++ < 5)
					count = Integer.parseInt(productPageObjects.CART_COUNT.getText().trim());

			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			return count;
		}
	}

}
