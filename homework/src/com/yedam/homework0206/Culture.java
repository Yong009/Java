package com.yedam.homework0206;

public abstract class  Culture {
//	1) Culture 클래스를 정의한다.
//- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.
//- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능
//(2) public String getGrade() : 평점을 구하는 기능
//(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
//	

	// 필드

	String name;
	int dsu;
	int msu;
	int ssu;
	int apoint;
	int score;
	// 생성자

	public Culture(String name,int dsu,int msu) {
		this.name = name;
		this.dsu=dsu;
		this.msu=msu;
	}

	// 메소드

	public void setTotalScore(int score,int ssu) {
		 apoint+=score;
		System.out.println(apoint);  
		 System.out.println(ssu+=1);

	}

	public String getGrade() {
		String star = "";
		if(score>=80){
			System.out.println("*****");
			System.out.println(star);
		} else if(score>=60&& score<80) {
			System.out.println("****");
			System.out.println(star);
		} else if(score>=40 && score<60) {
			System.out.println("***");
			System.out.println(star);
		}else if(score>=20 && score<40) {
			System.out.println("**");
			System.out.println(star);
	} else if(score>=0 && score<20) {
		System.out.println("*");
		System.out.println(star);
	} return star;
		
	} 

	public abstract void getInformation();
}
