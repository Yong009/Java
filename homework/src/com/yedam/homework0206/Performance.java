package com.yedam.homework0206;

public class Performance extends Culture {

//	3) Performance 클래스를 정의한다.
//- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능
//}

	// 필드
	String pkind;

	public Performance(String name, int dsu, int msu, String pkind) {
		super(name, dsu, msu);
		this.pkind = pkind;
	}

	//생성자

	
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println(name);
		System.out.println(dsu);
		System.out.println(msu);
		System.out.println(ssu);
		System.out.println(apoint);
		System.out.println(getGrade());
	}
	
}