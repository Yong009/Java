package com.yedam.access;

public class Application02 {
	public static void main(String[] args) {
		// 인스턴스 생성
		Student std = new Student();
		
		
		std.setStdName("김또치");
		std.setStdGrade("2학년");
		std.setMajor("컴퓨터공학과");
		std.setPrograming(-20);
		std.setDatabase(90);
		std.setOs(100);
		
		System.out.println("이름 : " + std.getStdName());
		System.out.println("학년 : " + std.getMajor());
		System.out.println("학과 : " + std.getStdGrade());
		System.out.println("프로그래밍 : " + std.getPrograming());
		System.out.println("데이터베이스 : " + std.getDatabase());
		System.out.println("운영체제 : " + std.getOs());
	
	   Member member = new Member();
	   
	   member.setAge(60);
	   member.setId("Yong");
	   member.setName("용");
	   member.setPassword(1234);
	   
	   System.out.println("===========================");
	   
	   System.out.println("이름 : " + member.getName());
	   System.out.println("나이 : " + member.getAge());
	   System.out.println("아이디 : " + member.getId());
	   System.out.println("패스워드 : " + member.getPassword());
	}
}
