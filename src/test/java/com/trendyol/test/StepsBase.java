package com.trendyol.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.trendyol.test.framework.wait.Wait;

public abstract class StepsBase {

	private static Logger log = LoggerFactory.getLogger("StepsBase");
    
    protected static void stepExecuted(String stepName) {
    	
    	log.info(String.format("Step: '%s' executed successfully.", stepName));
    	
    	Wait.forSeconds(0.8);
    	
    }
	
}
