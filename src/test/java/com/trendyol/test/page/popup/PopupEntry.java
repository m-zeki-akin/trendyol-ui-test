package com.trendyol.test.page.popup;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class PopupEntry extends PageBase {

	final By popup_entry = By.xpath("//div[@class=\"fancybox-outer\"]");
	
	public PopupEntry() {
		
		assertPage(popup_entry);
		
		PageRecorder.setCurrentPage(this);
		
	}
	
	final By popup_close_button = By.xpath("//a[@title=\"Close\"]");
	
	// methods
	public void clickCloseButton() {
		
		driver.findElement(popup_close_button).click();
		
		pageLoaded("entry popup");
		
	}
	
}
