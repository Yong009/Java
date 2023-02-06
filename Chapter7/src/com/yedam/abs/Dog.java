package com.yedam.abs;

public class Dog extends Animal {

	public void dog() {
		this.kind ="포유류";
	}
	
	
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
	
}
