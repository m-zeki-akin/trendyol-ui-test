package com.trendyol.test.page.categories;

import org.openqa.selenium.By;

import com.trendyol.test.PageRecorder;
import com.trendyol.test.page.BoutiquePage;

public class MenPage extends BoutiquePage {
	
	final By men_tab_active = By.xpath("//a[@href='/butik/liste/erkek']/parent::li[@class='tab-link active']");
	
	public MenPage() {
		
		assertPage(men_tab_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("men page");
		
	}
	
}
