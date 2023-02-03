package com.yedam.inheri;

public class Parent {
   //필드
	String firstName;
	
	
	//생성자
	public Parent(String firstName 
	) {
		this.firstName = firstName;
			}
	
	//메소드
	void getInfo(){
		System.out.println("우리성씨는 "+firstName);
	}
}
