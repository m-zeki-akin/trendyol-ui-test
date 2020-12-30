package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class WatchAndAccessoryPage extends BoutiquePage {
	
	final By watch_and_accessory_tab_active = By.xpath("//a[@href='/butik/liste/saat--aksesuar']/parent::li[@class='tab-link active']");
	
	public WatchAndAccessoryPage() {
		
		assertPage(watch_and_accessory_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("watch and accessory page");
		
	}
	
}
