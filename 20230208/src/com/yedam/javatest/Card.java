package com.yedam.javatest;

public class Card {

	//필드
	String cardNo;
	int validDate;
	int CVC;
	
	
	//생성자
	
	public Card(String cardNO, int validDate, int CVC) {
		this.cardNo = cardNO;
		this.validDate = validDate;
		this.CVC = CVC;
	}
	
	public Card() {
		
	}
	
	
	public String getCardNo() {
		return cardNo;
	}
	
	public int getValidDate() {
		return validDate;
	}
	
	public int getCVC() {
		return CVC;
	}
	
	
	//메소드
	public void showCardInfo() {
		
		
	}

	
	
	
}
