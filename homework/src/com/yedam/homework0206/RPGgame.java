package com.yedam.homework0206;

public class RPGgame implements Keypad {

	private int currentMode;
	
	public RPGgame() {
		currentMode = Keypad.NORMAL_MODE;
		System.out.println("RPGgame 실행");
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
			System.out.println("캐릭터가 한칸단위로 점프한다.");
		} else if(currentMode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 두칸 단위로 점프한다.");
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
			// TODO Auto-generated method stub
			if(currentMode == Keypad.NORMAL_MODE) {
				currentMode = Keypad.HARD_MODE;
				System.out.println("현재 모드 : HardMode");
				
			} else if(currentMode == Keypad.HARD_MODE) {
				currentMode = Keypad.NORMAL_MODE;
				System.out.println("현재 모드 : NormalMode");
			}
		}
	
	
//		currentMode = (currentMode ==Keypad.HARD_MODE) ? Keypad.NORMAL_MODE : Keypad.HARD_MODE;
	//	2) RPGgame 클래스를 정의한다.
//- Keypad를 구현하는 클래스.
//- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
//  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
//- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
//(1) public abstract void leftUpButton() : "캐릭터가 위쪽으로 이동한다"를 출력한다.
//(2) public abstract void leftDownButton() : "캐릭터가 아래쪽으로 이동한다"를 출력한다.
//(3) public abstract void rightUpButton()
//	- NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
//	- HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
//(4) public abstract void rightDownButton()
//	- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
//	- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
//(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
//
	
	

	
		
	
		
	}
		
	
