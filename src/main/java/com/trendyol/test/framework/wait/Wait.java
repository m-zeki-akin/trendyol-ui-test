package com.trendyol.test.framework.wait;

public class Wait {
	
	public static void forSeconds(long seconds) {
		
		try {
			
			Thread.sleep(seconds*1000);
			
		} catch (InterruptedException e) {}
		
	}
	
	public static void forMillis(long millis) {
		
		try {
			
			Thread.sleep(millis);
			
		} catch (InterruptedException e) {}
		
	}
	
	public static void forSeconds(double seconds) {
		
		long millis = (long) seconds * 1000;
		
		int nanos = (int) ((seconds - millis)*1000000);
		
		try {
			
			Thread.sleep(millis, nanos);
			
		} catch (InterruptedException e) {}
		
	}
	
}
