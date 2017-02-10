package com.appium.pages;

import com.annotation.values.PageName;
import com.appium.config.CommonAppiumTest;
import com.appium.config.DeviceInterface;
import com.appium.config.ViewFactory;
import com.appium.page.objects.LoginPageObjects;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

@PageName("Login Page")
public class LoginPage extends CommonAppiumTest {
	public ViewFactory viewFactory = new ViewFactory(driver);
	public DeviceInterface runnerInfo;
	public LoginPageObjects loginPageObjects = new LoginPageObjects();

	public LoginPage(AppiumDriver<MobileElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
		runnerInfo = viewFactory.getMobilePlatform(driver.toString().split(":")[0].toString());
	}

	public WelcomePage enterValidCredentails(String username, String password) {
		runnerInfo.login(this, username, password);
		return new WelcomePage(driver);
	}

	public String validateErrorMessage() {
		return driver.getPageSource();
	}

	public boolean validateUserNameFieldIsDisplayed() {
		return loginPageObjects.email.isDisplayed();
	}

	public void enterUserEmail(String user) {
		// TODO Auto-generated method stub
		waitForPageToLoad(loginPageObjects.email);
		logStepIntoExtentReport(getPageObjectElemetDescription(loginPageObjects, "email"), "SendKeys", user);
		loginPageObjects.email.clear();
		loginPageObjects.email.sendKeys(user);

	}

	public void enterPassword(String password) {
		// TODO Auto-generated method stub

		// waitForPageToLoad(loginPageObjects.email);

		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
		waitForPageToLoad(loginPageObjects.password);
		if (!isElementDisplayed(loginPageObjects.password)) {

			PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
			waitForPageToLoad(loginPageObjects.password);
		}

		logStepIntoExtentReport(getPageObjectElemetDescription(loginPageObjects, "password"), "SendKeys", password);
		loginPageObjects.password.clear();
		loginPageObjects.password.sendKeys(password);

	}

	public void getStarted() {
		loginPageObjects.getStarted.click();
	}

	public void login() {

		PageFactory.initElements(new AppiumFieldDecorator(driver), loginPageObjects);
		if (!isElementDisplayed(loginPageObjects.login))
			hideKeyBoard();
		loginPageObjects.login.click();
	}

	public void skip() {
		waitForElement(loginPageObjects.skip).click();
	}

}
