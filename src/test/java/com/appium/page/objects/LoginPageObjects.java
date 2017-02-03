package com.appium.page.objects;

import com.annotation.values.ElementDescription;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.SelendroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {

	@CacheLookup
	@AndroidFindBy(id = "com.craftsvilla.app:id/mEdittextEmailOnboarding")
	@iOSFindBy(className = "UIATextField")
	@SelendroidFindBy(id = "nux_username")
	@FindBy(id = "user_login")
	@ElementDescription("UserEmail Field")
	public MobileElement email;

	@CacheLookup
	@AndroidFindBy(id = "com.craftsvilla.app:id/mEdittextpassword")
	@iOSFindBy(className = "UIASecureTextField")
	@SelendroidFindBy(id = "nux_password")
	@FindBy(id = "user_pass")
	@ElementDescription("Password Field")
	public MobileElement password;

	@CacheLookup
	@iOSFindBy(xpath = ".//*[@name='Add Self-Hosted Site']")
	@AndroidFindBy(id = "org.wordpress.android:id/nux_add_selfhosted_button")
	@SelendroidFindBy(id = "nux_add_selfhosted_button")
	public MobileElement add_self_site;

	@CacheLookup
	@AndroidFindBy(id = "com.craftsvilla.app:id/mButtonStartInstantlyOnboarding")
	@iOSFindBy(id = "Sign In")
	@SelendroidFindBy(id = "nux_sign_in_button")
	@FindBy(id = "wp-submit")
	public MobileElement getStarted;

	@CacheLookup
	@AndroidFindBy(id = "com.craftsvilla.app:id/mButtonLogin")
	@iOSFindBy(id = "Sign In")
	@SelendroidFindBy(id = "nux_sign_in_button")
	@FindBy(id = "wp-submit")
	public MobileElement login;

	@AndroidFindBy(id = "com.craftsvilla.app:id/mTextViewSkipOnboarding")
	public MobileElement skip;

}
