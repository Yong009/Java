package com.yedam.javatest;

public class PaymentExample {
	public static void main(String[] args) {

		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : "+ card.online(10000));
		System.out.println("오프라인 결제 금액 : "+ card.online(10000));
		
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : "+ simple.online(10000));
		System.out.println("오프라인 결제 금액 : "+ simple.online(10000));
	}

}
