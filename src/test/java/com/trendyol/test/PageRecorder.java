package com.trendyol.test;

public class PageRecorder {
	
	private static Object currentPage;
	
	public static Object getCurrentPage() {
		
		return currentPage;
		
	}
	
	public static void setCurrentPage(Object _currentPage) {
		
		currentPage = _currentPage;
		
	}
	
}
