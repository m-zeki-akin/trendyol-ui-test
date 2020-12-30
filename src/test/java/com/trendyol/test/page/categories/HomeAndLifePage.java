package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class HomeAndLifePage extends BoutiquePage {
	
	final By home_and_life_tab_active = By.xpath("//a[@href='/butik/liste/ev--yasam']/parent::li[@class='tab-link active']");
	
	public HomeAndLifePage() {
		
		assertPage(home_and_life_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("home and life page");
		
	}
	
}
