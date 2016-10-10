package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class ProductDetailsActivity {

	String addToCartBtn = "PDP_AddToCartBtn";
	String buyNowBtn = "PDP_buyNowBtn";

	public ProductDetailsActivity addToCart(AndroidDriver driver) {
		DriverActions.click(driver, addToCartBtn);
		return this;
	}

	public ProductDetailsActivity buyNow(AndroidDriver driver) {
		DriverActions.click(driver, buyNowBtn);
		return this;
	}

}
