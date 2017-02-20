package com.appium.page.objects;

import java.util.List;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class MyCartPageObjects {

	@AndroidFindBy(id = "com.craftsvilla.app:id/mProceedToCheckoutButtonDown")

	public MobileElement checkout;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mAddressProceedToPaymentButton")

	public MobileElement proceedToPayment;

	@AndroidFindBy(id = "com.craftsvilla.app:id/buttonPlaceCodOrder")

	public MobileElement placeOrder;

	@AndroidFindBy(className = "android.widget.Button")

	public MobileElement trackOrder;

	@AndroidFindBys({ @AndroidFindBy(id = "com.craftsvilla.app:id/mImageViewClose") })
	public List<MobileElement> removeOptions;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mRemoveFromCartButton")

	public MobileElement removeButton;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mEdittextEmailuserOrGuestUser")

	public MobileElement guestEmail;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mButtonLogin")

	public MobileElement guestProceed;

	// pincode

	@AndroidFindBy(id = "com.craftsvilla.app:id/mEditTextPinCode")

	public MobileElement pincode;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mEditTextFirstName")

	public MobileElement firstName;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mEditTextLastName")

	public MobileElement lastName;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mEditTextFullAddress")

	public MobileElement address;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mEditTextMobileNumber")

	public MobileElement mobileNumber;

}
