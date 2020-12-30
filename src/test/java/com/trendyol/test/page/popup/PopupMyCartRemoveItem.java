package com.trendyol.test.page.popup;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class PopupMyCartRemoveItem extends PageBase{
	
	final By popup_remove = By.xpath("//div[@class=\"btn-box-remove-item\"]");
	
	public PopupMyCartRemoveItem() {
		
		assertPage(popup_remove);
		
		PageRecorder.setCurrentPage(this);
		
	}
	
	final By popup_remove_button = By.xpath("//button[@class=\"btn-item btn-remove\"]");
	
	public void clickRemoveButton() {
		
		driver.findElement(popup_remove_button).click();
		
		pageLoaded("my cart remove Item popup");
		
	}
	
}
