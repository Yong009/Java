package com.yedam.inheri;

public class Child extends Parent{
	private String lastName = "Yong";
	private String blood = "o형";
	private int age = 30;
	private String hobby = "넷플릭스";
	
	
	public Child(String firstName) {
		super(firstName);
	}

	
	@Override
	public void getInfo() {
		System.out.println("성씨는"+firstName);
		System.out.println("내이름은"+firstName);
		System.out.println("성씨는"+firstName);
	}
   

VIPPerson vip = new VIPPerson();
       vip.MemberInfo();
}

