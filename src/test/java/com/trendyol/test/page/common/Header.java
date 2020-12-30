package com.trendyol.test.page.common;

import org.openqa.selenium.By;

public interface Header {
	
	static final By trendyol = By.xpath("//a[@href=\"https://www.trendyol.com\"]");
	
	//if not logged in
	static final By not_signed_in = By.xpath("//div[@class='user-notloggedin-container']");
	//if logged in
	static final By signed_in = By.xpath("//div[@class='user-loggedin-container']");
	
	static final By my_account_button = By.xpath("//div[@class=\"account-nav-item user-login-container\"]");
	static final By my_favorites_button = By.xpath("//a[@class=\"account-nav-item account-favorites\"]");
	static final By my_cart_button = By.xpath("//a[@class=\"link account-basket\"]");
	static final By my_cart_item_count = By.xpath("//span[@class='basket-item-count']");
	
}
