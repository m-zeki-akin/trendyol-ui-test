package com.trendyol.test.framework.caching;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cacher {
	
	private final static Logger log = LoggerFactory.getLogger("TestBase");
	
//	private static Map<String, String> stringCache;
//	
//	private static Map<String, WebElement> elementCache;
//	
//	private static Map<String, Integer> intCache;
//	
//	private static Map<String, Boolean> booleanCache;
//	
//	private static Map<String, Double> floatCache;
	
	private static Map<String, Object> cache;
	
	public static void cache(String key, Object value) {
			
		if(cache == null) {
			
			cache = new HashMap<>();
			
		}
			
		cache.put(key, value);
		
		log.info(String.format("--Caching successful--\nKey: %s \nValue: %s", key, value));
		
	}
	
	public static Object getCache(String key) {
			
		return cache.get(key);

	}
	
}
