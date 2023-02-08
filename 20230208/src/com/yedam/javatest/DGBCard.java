package com.yedam.javatest;

public class DGBCard extends Card {

	//필드
	String company;
	String cardStaff;
	
	
	//생성자
	public DGBCard(String cardNo, int validDate, int CVC, String company, String cardStaff) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.CVC = CVC;
		this.company = "대구은행";
		this.cardStaff = cardStaff;
	}
	
	
	//메소드
	public void showCardInfo() {
		System.out.println("카드정보 (Card NO : "+cardNo+", 유효기간 : "+validDate+" "+"CVC : "+CVC+")");
		System.out.println("담당직원 - "+cardStaff+","+company);
	}
}