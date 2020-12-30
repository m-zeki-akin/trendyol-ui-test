package com.trendyol.test.page;

import org.openqa.selenium.By;

import com.trendyol.test.PageBase;
import com.trendyol.test.PageRecorder;

public class SignInPage extends PageBase {
	
	final By sign_in_active = By.xpath("//button[@class=\"q-secondary q-button-medium q-button tab button mr-5 left active\"]");
	
	public SignInPage(){
			
		assertPage(sign_in_active);
		
		PageRecorder.setCurrentPage(this);
		
		pageLoaded("sign in page");

	}
	
	final By email_input = By.xpath("//input[@id=\"login-email\"]");
	final By password_input = By.xpath("//input[@name=\"login-password\"]");
	final By login_button = By.xpath("//button[@type=\"submit\"]");
	
	// methods

	public void enterCredentials(String email, String password) {
		
		driver.findElement(email_input).sendKeys(email);
		
		driver.findElement(password_input).sendKeys(password);
		
		driver.findElement(login_button).click();
		
	}
	
}


