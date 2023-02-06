package homework0203;

public class ObesityInfo extends StandardWeightInfo{

//	3) ObesityInfo 클래스를 정의한다.
//- StandardWeightInfo 클래스를 상속한다.
//- 메소드는 다음과 같이 정의한다.
//(1) public void getInformation() : 이름, 키, 몸무게와 비만도를 출력하는 기능
//(2) public double getObesity() : 비만도를 구하는 기능
//( * 비만도 : (Weight - 표준 체중)/표준체중 * 100 )

	public ObesityInfo(String hname, int height, int bdwet, double stand,double obesity) {
		super(hname, height, bdwet);
		this.obesity = obesity;
		
	}

	
	
	// 필드
	double obesity;

	
		
	

	// 생성자
	
	
	

//	4) 아래와 같은 출력결과가 나오도록 실행코드를 구현하다.
//- 출력결과
//	홍길동님의 신장 168, 몸무게 45, 표준체중 61.2 입니다.
//	박둘이님의 신장 168, 몸무게 90, 비만입니다.
//- 조건
//	변수는 Human 클래스 타입으로 선언하여 하나만 사용한다.

	// 메소드
	@Override
	public void getInformation() {
		System.out.print(hname + "님의" + " ");
		System.out.print("신장" + " " + height + "," + " ");
		System.out.print("몸무게" + " " + bdwet + "," + " ");
		String objesity2 = null;
	
		if(getObesity()>50) {
			System.out.println("비만입니다.");}
		 else{
			System.out.println("정상입니다");}
		}





	@Override
	public double getObesity() {
		double bmi =bdwet -getStandardWeight()/getStandardWeight()*100;
		
		return bmi;
}
	

	
//	 

	
}