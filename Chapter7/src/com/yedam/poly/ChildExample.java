package com.yedam.poly;

public class ChildExample {
public static void main(String[] args) {
	//클래스간의 자동타입변환
	//parent p1 = new Child();
	/*
	 * Child의 생성자로 객체를 생성을 하고
	 * 이 객체를 Parent로 모습이 변한다.
	 */
	
	/* 다형성
	 * - 부모클래스에 있는 내용을 사용을 하되,
	 *   만약 자식클래스에 부모 메소드가 재정의(오버라이딩)가 되어 있다면
	 *   부모 클래스에 매소드를 사용하지 않고, 자식 클래스의 메소드 사용
	 * - 위에 성질 활용해서 하나의 타입(부모)으로 다양한 모습을 만든다.
	 * - 많은 자식들로 부터 다양한 형태를 만들 수 있다. 
	 */ 

     Parent p1 = new Child();
     p1.method1();
     p1.method2();
//     p1.field2 = "A";
     p1.field ="A";
     System.out.println("다른 형태의 객체");
     p1 = new Child02();
     p1.method1();
     p1.method2();
     
     
     
     
     
     
}
}
