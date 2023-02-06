package com.yedam.inter;

public class InterfaceExample {
 public static void main(String[] args) {
	RemoteControl rc;
	rc = new Televison();
	rc = new Audio();
	
	rc.turnOn();
	rc.setVolume(5);
	rc.setVolume(12);
	rc.setVolume(-1);
	rc.turnOff();

	SmartTelevision tv = new SmartTelevision();
	
	//SmartTelevision -> 2개의 인터페이스를 상속
	
	RemoteControl rc2 = tv;
	Searchable search = tv;
	
	rc2.setVolume(10);
	rc2.turnOn();
//	rc2.search("www.naver.com");
	search.search("www.naver.com");
 }
}
