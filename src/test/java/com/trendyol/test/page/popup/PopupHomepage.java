package com.trendyol.test.page.popup;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class PopupHomepage extends PageBase {
	
	final By popup_homepage = By.xpath("//div[@class=\"homepage-popup\"]");
	
	public PopupHomepage() {
		
		assertPage(popup_homepage);
		
		PageRecorder.setCurrentPage(this);
		
	}
	
	final By popup_homepage_close = By.xpath("//a[@title=\"Close\"]");
	
	// methods
	public void clickCloseButton() {
		
		driver.findElement(popup_homepage_close).click();
		
		pageLoaded("home popup");
		
	}
	
}
