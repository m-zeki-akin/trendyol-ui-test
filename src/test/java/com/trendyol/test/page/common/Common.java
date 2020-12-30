package com.trendyol.test.page.common;

import org.openqa.selenium.WebElement;

import com.trendyol.test.PageBase;
import com.trendyol.test.framework.action.Hover;

public class Common extends PageBase

implements Categories, Header, MyAccountDropdownContainer

{
	// Header
	public static void clickLogo() {
		
		driver.findElement(Header.trendyol).click();
		
	}
	
	public static void clickSignInButton() {
		
		driver.findElement(Header.my_account_button).click();
		
	}
	
	public static void clickMyCartIcon() {
		
		driver.findElement(Header.my_cart_button).click();
		
	}
	
	//Categories
	
	public static void clickWomenTab() {
		
		driver.findElement(Categories.women_tab).click();
		
	}
	
	public static void clickMenTab() {
		
		driver.findElement(Categories.men_tab).click();
		
	}
	
	public static void clickKidsTab() {
		
		driver.findElement(Categories.kids_tab).click();
		
	}
	
	public static void clickHomeAndLifeTab() {
		
		driver.findElement(Categories.home_and_life_tab).click();
		
	}
	
	public static void clickSupermarketTab() {
		
		driver.findElement(Categories.supermarket_tab).click();
		
	}
	
	public static void clickCosmeticTab() {
		
		driver.findElement(Categories.cosmetic_tab).click();
		
	}
	
	public static void clickShoesAndPurseTab() {
		
		driver.findElement(Categories.shoes_and_purse_tab).click();
		
	}
	
	public static void clickWatchAndAccessoryTab() {
		
		driver.findElement(Categories.watch_and_accessory_tab).click();
		
	}
	
	public static void clickElectronicsTab() {
		
		driver.findElement(Categories.electronic_tab).click();
		
	}
	
	// My account dropdown Container
	
	public static void hoverAndClickLogoutButton() {
		
		WebElement toHover = driver.findElement(Header.my_account_button);
		
		WebElement toClick = driver.findElement(MyAccountDropdownContainer.logout_button);
		
		Hover.hoverAndClick(toHover, toClick);
		
	}
	
}
