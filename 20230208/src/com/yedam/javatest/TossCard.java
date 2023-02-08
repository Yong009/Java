package com.yedam.javatest;

public class TossCard extends Card{

	
	//필드
	String company;
	String cardStaff;
	
	//생성자
	public TossCard(String cardNo, int validDate, int CVC, String company, String cardStaff) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
		this.company = "Toss";
		this.cardStaff = cardStaff;
	}
	
	//메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, "+cardNo);
		System.out.println("담당직원 - "+cardStaff+","+company);
	}

}
