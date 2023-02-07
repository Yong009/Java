package com.yedam.homework0206;

public class Movie extends Culture {

//	Movie 클래스를 정의한다.
//	- 추가로 장르를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//	- 메소드는 다음과 같이 정의한다.
//	(1) public abstract void getInformation() : 제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능

	// 필드
	String kind;

	public Movie(String name, int dsu, int msu, String kind) {
		super(name, dsu, msu);
		this.kind = kind;

	}

	@Override
	public void getInformation() {
		System.out.println("영화제목 : " + name);
		System.out.println("감독 : " + dsu);
		System.out.println("배우 : " + msu);
		System.out.println("영화총점 : " + apoint);
		System.out.println("평점 : " + getGrade());

	}

	// 생성자

	// 메소드
//	제목, 참여감독 수, 참여배우 수, 관객수, 총점, 평점을 출력하는 기능

}
