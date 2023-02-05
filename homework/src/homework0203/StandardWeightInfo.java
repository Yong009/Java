package homework0203;

public class StandardWeightInfo extends Human {

//	2) StandardWeightInfo 클래스를 정의한다.
//- Human 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 표준체중을 출력하는 기능
//(2) public double getStandardWeight() : 표준체중을 구하는 기능
//( * 표준 체중 : (Height - 100) * 0.9 )

	// 필드
	double stand;

	public StandardWeightInfo(String hname, int height, int bdwet, double stand) {
		super(hname, height, bdwet);
		this.stand = stand;
	}

	// 생성자

	// 메소드

	@Override
	public void getInformation() {
		System.out.print(hname + "님의" + " ");
		System.out.print("신장" + " " + height + "," + " ");
		System.out.print("몸무게" + " " + bdwet + "," + " ");
		System.out.println("표준 체중  " +stand+" 입니다.");
	}

	public double getStandardWeight() {
		return stand = (height - 100) * 0.9;
	};
}
