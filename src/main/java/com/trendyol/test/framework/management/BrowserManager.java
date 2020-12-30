package com.trendyol.test.framework.management;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

import com.trendyol.test.framework.environment.config.Environment;
import com.trendyol.test.framework.json.parser.JsonParser;
import com.trendyol.test.framework.paths.EnvironmentPath;

public class BrowserManager {
	
	public static void manage(WebDriver driver) {
		
		String environmentPath = "";
		
		if(driver instanceof ChromeDriver) {
			
			environmentPath = EnvironmentPath.CHROME_ENVIRONMENT_PATH;
			
		}else if(driver instanceof FirefoxDriver){
			
			environmentPath = EnvironmentPath.FIREFOX_ENVIRONMENT_PATH;
			
		}else{
			
			environmentPath = EnvironmentPath.EDGE_ENVIRONMENT_PATH;
			
		}
		
		final Environment environment = (Environment) JsonParser.fetch(environmentPath, Environment.class);
		
		driver.manage().window().maximize();
		
		if(environment.getDeleteAllCookies()) {
			
			driver.manage().deleteAllCookies();
			
		}
		
		driver.manage().timeouts().implicitlyWait(environment.getImplicityWait(), TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(environment.getPageLoadTimeout(), TimeUnit.SECONDS);
		
	}
	
}
