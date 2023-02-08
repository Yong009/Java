package com.yedam.javatest;

public interface Payment {
	public static final int ONLINE_PAYMENT_RATIO = 5;
	public static final int OFFLINE_PAYMENT_RATIO = 3;
	
	
	//메소드
	
	public int online(int price); 
		
	public int offline(int price);
	
	public void showInfo();
}
