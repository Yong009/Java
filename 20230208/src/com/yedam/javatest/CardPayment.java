package com.yedam.javatest;

public class CardPayment implements Payment{
	
	//필드
	double cardRatio;
	
	
	//생성자
	public CardPayment(double cardRatio) {
		this.cardRatio	= cardRatio;
		
	}
	
	
	
	
	//메소드
	@Override
	public void showInfo() {
		System.out.println("*** 카드로 결제 시 할인정보");
		System.out.println("온라인 결제시 총 할인율 : " +(double)(ONLINE_PAYMENT_RATIO)/100+ cardRatio);
		System.out.println("오프라인 결제시 총 할인율: "+(double)(OFFLINE_PAYMENT_RATIO/100)+ cardRatio);
	}

	@Override
	public int online(int price) {
		
		return price-(int)(price*(double)(ONLINE_PAYMENT_RATIO/100)+ cardRatio);
	}

	@Override
	public int offline(int price) {
		
		return price-(int)(price*(double)(OFFLINE_PAYMENT_RATIO/100)+ cardRatio);
	}
	
	
}
