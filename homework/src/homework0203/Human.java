package homework0203;

public class Human {
//문제2

//	1) Human 클래스를 정의한다.
//- 이름과 키, 몸무게를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키와 몸무게를 출력하는 기능

	// 필드

	protected String hname;
	protected int height;
	protected int bdwet;

	// 생성자
	public Human(String hname, int height, int bdwet) {
		this.hname = hname;
		this.height = height;
		this.bdwet = bdwet;
	}

	

	// 메소드
	public void getInformation() {
		System.out.print("이름 : "+ hname+ "키 : "+height+" 몸무게 : "+bdwet);
		
	}
	
	public double getObesity() {
		return 0;
	}
}
