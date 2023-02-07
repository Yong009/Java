package com.yedam.homework0206;

public class ArcadeGame implements Keypad{

	private int currentMode;
	
	public ArcadeGame() {
		currentMode = Keypad.NORMAL_MODE;
		System.out.println("ArcadeGame 실행");
	}
	@Override
	public  void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}
	@Override
	public  void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}
	@Override
	public  void rightUpButton() {
		if(currentMode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} else if(currentMode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		} }
	
	@Override
	public  void rightDownButton() {
		switch(currentMode) {
		case Keypad.NORMAL_MODE:
			System.out.println("캐릭터가 일반 공격");
			break;
		
		case Keypad.HARD_MODE:	
			System.out.println("캐릭터가 HIT 공격");
			break;
		}
	}
	@Override
	public void changeMode() {
		if(currentMode == Keypad.NORMAL_MODE) {
			currentMode = Keypad.HARD_MODE;
			System.out.println("현재 모드 : HardMode");
		
	} else if(currentMode == Keypad.HARD_MODE) {
		currentMode = Keypad.NORMAL_MODE;
		System.out.println("현재 모드 : NormalMode");
}
}
}