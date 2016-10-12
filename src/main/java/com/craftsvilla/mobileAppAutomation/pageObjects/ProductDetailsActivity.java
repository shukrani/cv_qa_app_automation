package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class ProductDetailsActivity {

	String addToCartBtn = "PDP_AddToCartBtn";
	String goToCartBtn = "PDP_GoToCartBtn";
	String buyNowBtn = "PDP_buyNowBtn";

	public String getAddToCartBtn() {
		return addToCartBtn;
	}

	public String getGoToCartBtn() {
		return goToCartBtn;
	}

	public String getBuyNowBtn() {
		return buyNowBtn;
	}

	public ProductDetailsActivity addToCart(AndroidDriver driver) {
		DriverActions.waitForElement(driver, addToCartBtn, 30);
		DriverActions.click(driver, addToCartBtn);
		return this;
	}

	public ProductDetailsActivity buyNow(AndroidDriver driver) {
		DriverActions.waitForElement(driver, buyNowBtn, 30);
		DriverActions.click(driver, buyNowBtn);
		if (DriverActions.isElementDisplay(driver, buyNowBtn)) {
			DriverActions.click(driver, buyNowBtn);
		}
		return this;
	}

}
