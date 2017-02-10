package com.appium.page.objects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPageObjects {

	@AndroidFindBy(id = "com.craftsvilla.app:id/mAddToCartButton")
	public MobileElement ADD_TO_CART_BUTTON;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mButtonBuyNow")
	public MobileElement BUY_NOW_BUTTON;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mRelativeLayoutCart")
	public MobileElement CART_ICON;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mTextViewCartCount")
	public MobileElement CART_COUNT;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mAvailableCODTextView")
	public MobileElement COD_AVAILABLE;
}
