package com.yedam.service;

import java.util.List;
import java.util.Scanner;

public class NewCarService {

	public static NewCar memInfo = null;
	Scanner sc = new Scanner(System.in);

	// 1.로그인
	public void login() {
		NewCar member = null;
		System.out.println("ID>");
		String memberID = sc.nextLine();
		System.out.println("pw>");
		String memberPw = sc.nextLine();

		member = NewCarDAO.getInstance().login(memberID);

		if (member != null) {
			
			if(memberID.equals("ge")) {
				if(member.getMemberPw().equals(memberPw)) {
					System.out.println("로그인 되었습니다.");
					System.out.println("🚗🚘🚍 관리자로 접속하였습니다.🚗🚘🚍");
					memInfo = member;
				} else {
					System.out.println("비밀번호가 틀립니다.");
				}
			} else 	if (member.getMemberPw().equals(memberPw)) {
				System.out.println("로그인 되었습니다.");
				System.out.println(member.getMemberId() + "님 신카에 접속한 것을 환영합니다.🚗🚘🚍🚗🚘🚍");
				memInfo = member;

			} else {
				System.out.println("비밀번호가 틀립니다.");
			} 

		} else {
			System.out.println("해당 아이디는 존재하지 않습니다.");
		
		}

	}
	
	//2. 회원 정보 조회
	public void getMemberList() {
		List<NewCar> list = NewCarDAO.getInstance().getMemberList();
		for(int i = 0; i<list.size(); i++) {
			System.out.println("회원 ID : " + list.get(i).getMemberId());
			System.out.println("회원 PW : " + list.get(i).getMemberPw());
			System.out.println("이름 : " + list.get(i).getMemberName());
			System.out.println("연락처 : " + list.get(i).getMemberNumber());
			System.out.println("------------------------------------------");
			
		}
		
	}
	
	//3.차량 조회
	public void getCarList() {
		List<NewCar> list = NewCarDAO.getInstance().getCarList();
		for(int i = 0; i<list.size(); i++) {
			System.out.println("차 번호 : " + list.get(i).getCarNumber());
			System.out.println("차 이름 : " + list.get(i).getCarName());
			System.out.println("차 종류 : " + list.get(i).getCarKind());
			System.out.println("연도 : " + list.get(i).getCarYear());
			System.out.println("대여 횟수 : " + list.get(i).getCarCount());
			System.out.println("기름 : " + list.get(i).getCarOil());
			System.out.println("엔진 오일  : " + list.get(i).getCarEnoil());
			System.out.println("타이어 : " + list.get(i).getCarTire());
			System.out.println("-------------------------------------------");
			
		}
	}
	
	public void getMember() {
		System.out.println("회원 ID>");
		String ncid = sc.nextLine();
		NewCar nc = NewCarDAO.getInstance().getNewCar(ncid);
		if(nc == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("회원 ID : " +nc.getMemberId());
			System.out.println("회원 pw : " +nc.getMemberPw());
			System.out.println("이름 : " +nc.getMemberName());
			System.out.println("연락처 : " +nc.getMemberNumber());
		}
	}
	
	//4.정보 수정
	
	public void modifyNc() {
		System.out.println("-------------비밀번호 변경---------------");
		System.out.println("수정할 회원 ID");
		String ncId = sc.nextLine();
		System.out.println("수정된 비번");
		String ncPw = sc.nextLine();
		
		NewCar nc = new NewCar();
		nc.setMemberId(ncId);
		nc.setMemberPw(ncPw);
		
		int result = NewCarDAO.getInstance().modifyNewCar(nc);
		
		if(result > 0) {
			System.out.println("비밀번호 수정 완료");
		} else {
			System.out.println("비밀번호 수정 실패");
		}
	}
}