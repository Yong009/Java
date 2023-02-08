package com.yedam.javatest;

public class SimplePayment implements Payment{
	
	//필드
	double simplePaymentRatio;
	
	
	//생성자
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio	= simplePaymentRatio;
		
	}


	@Override
	public int online(int price) {
		
		return price-(int)(price*0.05);
	}


	@Override
	public int offline(int price) {
		
		return price-(int)(price*0.03);
	}
	


	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " +(double)(ONLINE_PAYMENT_RATIO)/100/100+ simplePaymentRatio);
		System.out.println("오프라인 결제 시 총 할인율 : "+(double)(OFFLINE_PAYMENT_RATIO/100)+ simplePaymentRatio);
		
	}
	
}
