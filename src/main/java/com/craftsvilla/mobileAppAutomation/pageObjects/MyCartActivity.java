package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;

import io.appium.java_client.android.AndroidDriver;

public class MyCartActivity {

	String checkoutBtn = "MyCart_checkout";
	String totalPrice = "MyCart_total";

	public String getTotalPrice() {
		return totalPrice;
	}

	public String getCheckoutBtn() {
		return checkoutBtn;
	}

	public MyCartActivity checkout(AndroidDriver driver) {

		DriverActions.click(driver, checkoutBtn);

		return this;
	}

}
