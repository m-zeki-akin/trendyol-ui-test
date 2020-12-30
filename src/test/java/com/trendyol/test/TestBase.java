package com.trendyol.test;

import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.trendyol.test.framework.Driver;

public abstract class TestBase {
	
	protected final static Logger log = LoggerFactory.getLogger("TestBase");
	
	protected WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
	public void setUp() {
		
		log.info("Initializing..");
		
		driver = Driver.get("chrome");
		
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		
		log.info("Tear down..");
		
		driver.close();
		
		driver.quit();
		
	}
}
