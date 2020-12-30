package com.trendyol.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trendyol.test.framework.Driver;

public abstract class PageBase{
	
	protected static WebDriver driver;
	
	protected final static Logger log = LoggerFactory.getLogger("PageBase");
	
	public PageBase() {
		
        driver = Driver.get();
        
	}
	
	protected final void assertPage(String pageTitle){
		
		if (pageTitle.equals(driver.getTitle())) {
			
            throw new IllegalStateException(String.format("Expected '%s' page title. But found '%s'", pageTitle ,driver.getTitle()));
            
        }
		
	}
	
	protected void assertPage(By pageSelector) {
		
		try {
			
			driver.findElement(pageSelector);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			throw new IllegalStateException(String.format("This is not the '%s' page.", pageSelector.toString()));
			
		}
		
	}
	
	protected void pageLoaded(String pageName) {
		
		//log.info(String.format("Page: '%s' loaded successfully",pageName));
		
	}
	
}
