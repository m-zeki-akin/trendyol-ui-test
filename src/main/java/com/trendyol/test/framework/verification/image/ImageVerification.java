package com.trendyol.test.framework.verification.image;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trendyol.test.framework.Driver;

public class ImageVerification {
	
	private final static Logger log = LoggerFactory.getLogger("ImageVerification");
	
	public static void isImageSuccessfullyLoaded(WebElement image) {

		Object result = ((JavascriptExecutor) Driver.get()).executeScript(""
				+ "return arguments[0].complete && "
				+ "typeof arguments[0].naturalWidth != \"undefined\" && "
				+ "arguments[0].naturalWidth > 0", image);

		if (result instanceof Boolean) {
			
			Boolean loaded = (Boolean) result;
			
			if(!loaded) {
				
				log.warn(String.format("\nImage of '%s' element at '%s' has not been loaded.\\n",image, image.getLocation()));
				
			}else {
				//log.info(String.format("\nImage at '%s' has been loaded successfully.\n",image, image.getLocation()));
			}

		}else {
			
			log.warn(String.format("\nImage of '%s' element at '%s' has not been loaded.\n",image, image.getLocation()));
			
		}

	}

}
