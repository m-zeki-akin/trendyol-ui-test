package com.trendyol.test.framework.action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.trendyol.test.framework.Driver;

public class Hover {
	
	private static Actions action = new Actions(Driver.get());
	
	public static void hover(WebElement toHover) {
		
		action.moveToElement(toHover).build().perform();
		
	}
	
	public static void hoverAndClick(WebElement toHover, WebElement toClick) {
		
		action.moveToElement(toHover).moveToElement(toClick).click().build().perform();
		
	}

}
