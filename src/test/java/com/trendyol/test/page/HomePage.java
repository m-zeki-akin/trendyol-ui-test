package com.trendyol.test.page;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class HomePage extends PageBase {
	
	static final By homepage = By.xpath("//div[@id=\"browsing-gw-homepage\"]");
	
	public HomePage() {
		
		assertPage(homepage);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("home page");
		
	}
	
}
