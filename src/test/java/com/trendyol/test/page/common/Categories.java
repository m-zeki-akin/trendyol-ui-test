package com.trendyol.test.page.common;

import org.openqa.selenium.By;

public interface Categories{
	
	// main navigation
	// as list
	static final By tab_list = By.xpath("//li[@class='tab-link']");
	// 
	static final By women_tab = By.xpath("//a[@href='/butik/liste/kadin']");
	static final By men_tab = By.xpath("//a[@href='/butik/liste/erkek']");
	static final By kids_tab = By.xpath("//a[@href='/butik/liste/cocuk']");
	static final By home_and_life_tab = By.xpath("//a[@href='/butik/liste/ev--yasam']");
	static final By supermarket_tab = By.xpath("//a[@href='/butik/liste/supermarket']");
	static final By cosmetic_tab = By.xpath("//a[@href='/butik/liste/kozmetik']");
	static final By shoes_and_purse_tab = By.xpath("//a[@href='/butik/liste/ayakkabi--canta']");
	static final By watch_and_accessory_tab = By.xpath("//a[@href='/butik/liste/saat--aksesuar']");
	static final By electronic_tab = By.xpath("//a[@href='/butik/liste/elektronik']");
		
	// sub navigation
	static final By waffle_machine = By.xpath("//a[contains(@href,'waffle-makinesi')]");
	
}
