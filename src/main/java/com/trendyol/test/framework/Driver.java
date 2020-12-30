package com.trendyol.test.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trendyol.test.framework.management.BrowserManager;
import com.trendyol.test.framework.paths.DriverPath;

public class Driver {
	
	private static WebDriver driver;
	
	private static Logger log = LoggerFactory.getLogger("Driver");
	
	public Driver(){}
	
	public static WebDriver get(String browserName) {
		
		if(driver==null) {
			
			if(browserName.equalsIgnoreCase("chrome")) {
				
				System.setProperty("webdriver.chrome.driver", DriverPath.CHROME_DRIVER_PATH);
				
				ChromeOptions options = new ChromeOptions();
				
				options.addArguments("--disable-notifications");
				
				driver = new ChromeDriver(options);
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", DriverPath.FIREFOX_DRIVER_PATH);
				
				FirefoxOptions options = new FirefoxOptions();
				
				//TODO options
				
				driver = new FirefoxDriver(options);
				
			}
			else if(browserName.equalsIgnoreCase("edge")) {
				
				System.setProperty("webdriver.edge.driver", DriverPath.EDGE_DRIVER_PATH);
				
				EdgeOptions options = new EdgeOptions();
				
				//TODO options
				
				driver = new EdgeDriver(options);
				
			}
			
			BrowserManager.manage(driver);
			
		}
		
		return driver;
		
	}

	public static WebDriver get(){
		
		if(driver==null) {
			
			log.error("Driver is null.");;
			
		}
		
		return driver;
		
	}
	
}
