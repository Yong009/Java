package com.yedam.oop;

public class Student {

	// 정보 - 학생이름, 학번, 국어, 영어, 수학 점수
	// 기본 생성자, 모든 데이터를 초기화 생성자
	// 학생의 정보를 출력해주는 getInfo
	/*
	 * 이름 : 김또치 학번 : 20230201 총점 : 200 평균 : 68.xx
	 */
    String name;
    int stnum;
    int kor;
    int eng;
    int math;
	public Student() {

	}

	public Student(String name,int stnum,int kor,int eng,int math) {
		this.name = name;
		this.stnum = stnum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
//	sum=0;
//	avg=0;
//
//	Student.sa(){
//	    
//		sum= kor + eng + math;
//		avg = sum/3;
	int sum() {
		return kor+eng+math;
	}
    
	double avg() {
		return sum()/3;
	}
	
	void getInfor(){
		System.out.println("이름 :" +name);
		System.out.println("학번 :" +stnum);
		System.out.println("총점 :" +(kor+eng+math));
		System.out.printf("평균 :%4.2f" ,((double)(kor+eng+math)/3));
		
	}}
