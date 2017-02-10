package com.appium.page.objects;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

public class CategoryPageObjects {

	@AndroidFindBys({ @AndroidFindBy(id = "com.craftsvilla.app:id/categoryItemLayoutGridView") })
	public List<MobileElement> PRODUCT_LIST;
	@AndroidFindBy(id = "com.craftsvilla.app:id/defaultSlider")
	public MobileElement SUB_CATEGORY_GEORGETTE;
}
