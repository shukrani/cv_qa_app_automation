package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.FindBy;

public class MyCartPageObjects {

	@AndroidFindBy(id = "com.craftsvilla.app:id/mProceedToCheckoutButtonDown")

	public MobileElement checkout;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mAddressProceedToPaymentButton")

	public MobileElement proceedToPayment;

	@AndroidFindBy(id = "com.craftsvilla.app:id/buttonPlaceCodOrder")

	public MobileElement placeOrder;

	@AndroidFindBy(className = "android.widget.Button")

	public MobileElement trackOrder;
}
