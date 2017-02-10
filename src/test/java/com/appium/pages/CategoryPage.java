package com.appium.pages;

import org.openqa.selenium.support.PageFactory;

import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.CategoryPageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CategoryPage extends CommonAppiumTest {

	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	CategoryPageObjects categoryPageObjects = new CategoryPageObjects();

	public CategoryPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), categoryPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public WelcomePage waitForWelcomePage() {

		return new WelcomePage(driver);

	}

	public void moveToSubCategoryPage() {
		waitForElement(categoryPageObjects.SUB_CATEGORY_GEORGETTE).click();
		waitForElementToDisAppear("com.craftsvilla.app:id/defaultSlider");
	}

	public ProductPage moveToProductPage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), categoryPageObjects);

		for (MobileElement e : categoryPageObjects.PRODUCT_LIST) {
			waitForElement(e);
			if (e.isDisplayed()) {
				e.tap(1, 2);
				waitForElementToDisAppear("com.craftsvilla.app:id/categoryItemLayoutGridView");
				if (!isElementDisplayed(e))
					break;
			}
		}
		// waitForElementToDisAppear("com.craftsvilla.app:id/defaultSlider");

		return new ProductPage(driver);

	}

}
