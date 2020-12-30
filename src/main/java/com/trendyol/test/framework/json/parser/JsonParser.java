package com.trendyol.test.framework.json.parser;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class JsonParser {
	
    private static Gson gson;
    
    private static Logger log = LoggerFactory.getLogger("JsonParser");
    
    private JsonParser() {}
 
    public static Gson getInstance(){
    	
        if (gson == null)
        	gson = new Gson();
    
        return gson;
        
    }
    
	public static JsonObject fetch(String path) {
		
		Gson parser = JsonParser.getInstance();
		
		JsonObject obj = null;
		
		try {
			
			obj = parser.fromJson(new FileReader(path), JsonObject.class);
			
		} catch (JsonSyntaxException e) {
			
			e.printStackTrace();
			
			log.error("Json file at '%s' has syntax error.");
			
		} catch (JsonIOException e) {
			
			e.printStackTrace();
			
			log.error("Unable to read Json file at '%s'");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			log.error("Json file at %s not found.");
			
		}
		
		return obj;
		
	}
	
	public static <T> Object fetch(String path, Class<T> c) {
		
		Gson parser = JsonParser.getInstance();
		
		Object obj = null;
		
		try {
			
			obj = parser.fromJson(new FileReader(path), c);
			
		} catch (JsonSyntaxException e) {
			
			e.printStackTrace();
			
			log.error("Json file at '%s' has syntax error.");
			
		} catch (JsonIOException e) {
			
			e.printStackTrace();
			
			log.error("Unable to read Json file at '%s'");
			
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
			log.error("Json file at %s not found.");
			
		}
			
		return obj;
			
	}
}
