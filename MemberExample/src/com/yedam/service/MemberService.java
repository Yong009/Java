package com.yedam.service;

import java.util.Scanner;

public class MemberService {
	// member의 정보를 자바 전역에 공유하기 위해서 static
	// 1. memberInfo -> null이 아니다. null이다.
	// null -> 0 로그인이 안된 상태
	// null -> X 로그인이 되어 있는 상태

	public static Member memberInfo = null;
	Scanner sc = new Scanner(System.in);

	// 1.로그인
	public void login() {

		Member member = null;
		System.out.println("ID>");
		String memberID = sc.nextLine();
		System.out.println("PW>");
		String memberPw = sc.nextLine();

		member = MemberDAO.getInstance().login(memberID);

		// id를 통해서 회원 정보를 조회하고, 조회된 결과에 따라서 login 여부를 결정
		// 1. id를 통해 조회가 되었다. -> 회원의 정보가 존재한다.
		// 따라서, 입력한 비밀번호와 회원의 정보에서의 비밀번호가 동일 => login 진행
		// memberInfo에 조회된 회원의 정보 대입

		// id를 통해 조회가 되지 않았다. -> 회원의 정보가 없다.
		// 따라서, login 실패
		// memberInfo에 null이 유지

		if (member != null) {
			// 데이터가 조회 되었다.
			if (member.getMemberPw().equals(memberPw)) {
				System.out.println("정상 로그인 되었습니다.");
				System.out.println(member.getMemberId() + "님 환영합니다.♬♬♬");
				memberInfo = member;
			} else {
				System.out.println("비밀번호가 틀립니다.");
			}
		} else {
			System.out.println("해당 아이디는 존재하지 않습니다.");

		}
	}

//2. 회원 정보 조회
	public void getMember() {
		Member member = MemberDAO.getInstance().getMember();
		System.out.println(member.toString());
	}
	// 이모티콘 window키 + .키

//3. 회원 정보 수정
	public void modifyMember() {
		Member member = new Member();
		System.out.println("연락처>");
		member.setMemberPhone(sc.nextLine());
		System.out.println("회원ID>");
		member.setMemberId(sc.nextLine());

		int result = MemberDAO.getInstance().modifyMember(member);

		if (result > 0) {
			System.out.println("연락처 수정 완료");

		} else {
			System.out.println("연락처 수정 실패");
		}

	}

//4. 회원 정보 탈퇴	
	public void deleteMember() {
		System.out.println("회원ID>");
		int result = MemberDAO.getInstance().deleteMember(sc.nextLine());
		
		//자신의 ID를 넣었다.
		//로그인 되어 있는 상태에서 회원 탈퇴 -> 로그아웃.
		
		if(result > 0) {
			MemberService.memberInfo = null; // 로그아웃
			System.out.println("회원 ID 삭제 완료");
		} else {
			System.out.println("회원 ID 삭제 실패");
		}
	}
	
	
	
	
	
	
	
}
