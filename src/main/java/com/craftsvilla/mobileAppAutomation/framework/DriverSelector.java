package com.craftsvilla.mobileAppAutomation.framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverSelector {

	public static AndroidDriver<MobileElement> getAndriodDriver() {
		AndroidDriver<MobileElement> driver = null;
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setPlatform(Platform.ANDROID);
		cap.setCapability("app", new File("resources/cv.apk").getAbsolutePath());
		cap.setCapability("appPackage", "com.craftsvilla.app");
		cap.setCapability("unicodekeyboard", true);
		cap.setCapability("appActivity", "com.craftsvilla.app.features.splash.ui.SplashActivity");
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "Android");
		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), cap);
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return driver;
	}

}
