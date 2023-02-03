package homework0203;

public class EmpDept extends Employee{
//문제1

//	2) EmpDept 클래스를 정의한다.
//- Employee 클래스를 상속한다.
//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//- 추가된 필드의 getter를 정의한다.
//- Employee 클래스의 메소드를 오버라이딩한다.
//(1) public void getInformation() : 이름과 연봉, 부서를 출력하는 기능
//(2) public void print() : "수퍼클래스\n서브클래스"란 문구를 출력하는 기능
//
//3) 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//- 출력결과
//이름:이지나  연봉:3000  부서:교육부
//수퍼클래스
//서브클래스

 //필드
	String dpt;
 //생성자
	
	public EmpDept(String name, int salary, String dpt) {
		super(name, salary);
		this.dpt = dpt;
	}

	

	@Override
	public void getInformation() {
		System.out.print("이름 : " + name+"\t" );
		System.out.print("연봉 : " + salary+"\t");
		System.out.println("부서 : " + dpt+"\t");
	}
	
	public void print() {
		System.out.println("수퍼클래스");
		System.out.println("서브클래스");
	}
	
	
	
 //메소드
	
	
	
	
	
	
	
	
}
