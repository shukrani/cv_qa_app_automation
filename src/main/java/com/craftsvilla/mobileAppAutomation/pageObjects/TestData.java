package com.craftsvilla.mobileAppAutomation.pageObjects;

import com.craftsvilla.mobileAppAutomation.framework.GetTestData;

public class TestData {

	static public GetTestData testData = new GetTestData();

	static public String loginEmail = testData.getTestData("loginEmail");
	static public String loginPass = testData.getTestData("loginPass");
	static public String guestEmail = System.currentTimeMillis() + testData.getTestData("guestEmail");
	static public String searchText = testData.getTestData("searchText");

}
