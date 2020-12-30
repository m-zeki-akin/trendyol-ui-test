package com.trendyol.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class MyCartPage extends PageBase{

	final By my_cart_page = By.xpath("//section[@id='basketTemplate']");
	
	public MyCartPage() {
		
		assertPage(my_cart_page);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("my cart page");
		
	}
	
	final By my_cart_with_item_count = By.xpath("//div[@class='pb-header']");
	final By trash = By.xpath("//i[@class='i-trash']");
	final By popup_remove = By.xpath("//button[@class='btn-item btn-remove']");
	final By item = By.xpath("//p[@class='pb-item']");
	
	public int getItemCount(){
		
		try {
			
			return driver.findElements(trash).size();
			
		}catch(NoSuchElementException e){
			
			return 0;
			
		}
		
	}
	
	public void clickTrashButton() {
		
		driver.findElement(trash).click();
		
	}
	
	public String getAddedItemName() {
		
		return driver.findElement(item).getText();
		
	}

}
