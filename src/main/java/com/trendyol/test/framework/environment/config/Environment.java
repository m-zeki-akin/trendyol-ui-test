package com.trendyol.test.framework.environment.config;

import com.google.gson.annotations.SerializedName;

public class Environment {
	
	@SerializedName("delete all cookies")
	private Boolean deleteAllCookies;
	
	@SerializedName("page load timeout")
	private int pageLoadTimeout;
	
	@SerializedName("implicity wait")
	private int implicityWait;
	
	public Boolean getDeleteAllCookies() {
		return deleteAllCookies;
	}
	
	public int getPageLoadTimeout() {
		return pageLoadTimeout;
	}
	
	public int getImplicityWait() {
		return implicityWait;
	}
	
}
