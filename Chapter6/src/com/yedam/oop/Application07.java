package com.yedam.oop;

public class Application07 {
	public static void main(String[] args) {
		Person p1 = new Person("230202-1234567", "김또치");
		// 개명

		System.out.println("국적 : " + p1.nation);
		System.out.println("주민번호 : " + p1.ssn);
		System.out.println("이름 : " + p1.name);
        
		//지구의 반지름
		System.out.println("지구의 반지름 : " + StaticCal.PI);
		//지구의 표면적(원넓이 pi*r*r)
		System.out.println("지구의 표면적 : " 
		+ StaticCal.PI*StaticCal.EARTH_RADIUS*StaticCal.EARTH_RADIUS);
		
        		
		
		
	}
}
