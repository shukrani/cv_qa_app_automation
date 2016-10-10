package com.craftsvilla.mobileAppAutomation.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.server.handler.ImeActivateEngine;

import com.craftsvilla.mobileAppAutomation.framework.DriverActions;
import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;

public class SearchActivity {

	String searchTextEdit = "Search_searchTextEdit";

	public SearchActivity search(AndroidDriver driver) {
		DriverActions.sendKeys(driver, searchTextEdit, TestData.searchText + "\n");

		//driver.pressKeyCode(4);// IME_ACTION_SEND
		driver.longPressKeyCode(0x00000004);// IME_ACTION_SEND
		
		driver.getKeyboard().pressKey("4");
		
		return this;
	}

}
