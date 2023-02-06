package homework0203;

public class StandardWeightInfo extends Human {

//	2) StandardWeightInfo 클래스를 정의한다.
//- Human 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//(2) public double getStandardWeight() : 표준체중을 구하는 기능
//( * 표준 체중 : (Height - 100) * 0.9 )

	// 필드
	

	public StandardWeightInfo(String hname, int height, int bdwet) {
		super(hname, height, bdwet);
		
	}

	// 생성자

	// 메소드

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.printf("표준 체중 %f 입니다.\n" 
		+getStandardWeight());
		
	}

	public double getStandardWeight() {
		double result = (height - 100) * 0.9;
		return result;
	};
}
