package com.yedam.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner(System.in);

	// 전체 학생 정보 조회
	public void getStudentList() {
		List<Student> list =  new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("학번 : " + list.get(i).getStdId());
			System.out.println("이름 : " + list.get(i).getStdName());
			System.out.println("전공 : " + list.get(i).getStdMajor());
			System.out.println("점수 : " + list.get(i).getStdPoint());
			System.out.println("=====================================");
		}
	}

	// 학번 조회
	public void getStudent() {
		System.out.println("학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
		Student std = StudentDAO.getInstance().getStudent(stdNo);
		if (std == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("학번 : " + std.getStdId());
			System.out.println("이름 : " + std.getStdName());
			System.out.println("전공 : " + std.getStdMajor());
			System.out.println("점수 : " + std.getStdPoint());
		}
	}

	// 학생 등록
	public void insertStd() {
		System.out.println("===========학생 등록============");
		System.out.println("학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
		System.out.println("이름>");
		String stdName = sc.nextLine();
		System.out.println("전공");
		String stdMajor = sc.nextLine();
		System.out.println("점수");
		double stdPoint = Double.parseDouble(sc.nextLine());

		Student std = new Student();
		std.setStdId(stdNo);
		std.setStdName(stdName);
		std.setStdMajor(stdMajor);
		std.setStdPoint(stdPoint);

		int result = StudentDAO.getInstance().insertStd(std);

		if (result > 0) {
			System.out.println("학생 등록 완료");
		} else {
			System.out.println("학생 등록 실패");
		}
	}

	// 학생 제적
	public void deleteStd() {
		System.out.println("===============학생 삭제=================");
		System.out.println("삭제 학생 번호>");
		int stdNo = Integer.parseInt(sc.nextLine());

		Student std = new Student();
		std.setStdId(stdNo);

		int result = StudentDAO.getInstance().deleteStd(std.getStdId());

		if (result > 0) {
			System.out.println("학생 삭제 완료");
		} else {
			System.out.println("학생 삭제 실패");
		}
	}

	// 전공 변경
	public void updateStd() {
		System.out.println("============전공 수정 ==============");
		System.out.println("수정할 학번>");
		int stdNo = Integer.parseInt(sc.nextLine());
		System.out.println("바꾸는 전공>");
		String stdMajor = sc.nextLine();

		Student std = new Student();
		std.setStdId(stdNo);
		std.setStdMajor(stdMajor);
		
		int result = StudentDAO.getInstance().updateStd(std);

		if (result > 0) {
			System.out.println("전공 수정 완료");
		} else {
			System.out.println("전공 수정 실패");
		}
	}
	//전공별 성적 합계, 성적 평균
	public void getAnalyze() {
		List<Student> list = StudentDAO.getInstance().getAnalyze();
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println("전공명 : " + list.get(i).getStdMajor());
			System.out.println("합 계 : " + list.get(i).getStdSum());
			System.out.println("평 균 : " + list.get(i).getStdAvg());
			System.out.println("학생수 : " + (int)(list.get(i).getStdSum()/list.get(i).getStdAvg())+"명");
			System.out.println("==================================");
		}
		
		
	}
}
