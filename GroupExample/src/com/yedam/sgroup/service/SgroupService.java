package com.yedam.sgroup.service;

import java.util.List;
import java.util.Scanner;

public class SgroupService {

	public static Sgroup sgrInfo = null;
	Scanner sc = new Scanner(System.in);

	// 0.로그인
	public void login() {
		Sgroup sgroup = null;
		System.out.println("ID>");
		String sgroupID = sc.nextLine();

		sgroup = SgroupDAO.getInstance().login(sgroupID);

		if (sgroup != null) {
			if (sgroup.getSgroupId().equals(sgroupID)) {
				System.out.println("정상 로그인 되었습니다.");
				System.out.println(sgroup.getSgroupId() + "님 환영합니다.😎😎");
				sgrInfo = sgroup;
			}
		} else {
			System.out.println("해당 아이디는 존재하지 않습니다.");

		}
	}

	// 1.새회원 등록
	public void insertSgroup() {
		System.out.println("==========회원 등록============");
		System.out.println("회원 아이디>");
		String sgrId = sc.nextLine();
		System.out.println("이름>");
		String sgrName = sc.nextLine();
		System.out.println("가입일자>");
		String sgrDate = sc.nextLine();
		System.out.println("이메일>");
		String sgrEmail = sc.nextLine();
		System.out.println("나이>");
		int sgrAge = Integer.parseInt(sc.nextLine());

		Sgroup sgr = new Sgroup();
		sgr.setSgroupId(sgrId);
		sgr.setSgroupName(sgrName);
		sgr.setSgroupHiredate(sgrDate);
		sgr.setSgroupEmail(sgrEmail);
		sgr.setSgroupAge(sgrAge);

		int result = SgroupDAO.getInstance().insertSgroup(sgr);

		if (result > 0) {
			System.out.println("회원 등록 완료");
		} else {
			System.out.println("회원 등록 실패");
		}

	}

	// 2. 모든 회원 조회
	public void getSgroupList() {
		List<Sgroup> list = SgroupDAO.getInstance().getSgroupList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("회원 ID " + list.get(i).getSgroupId());
			System.out.println("이름 " + list.get(i).getSgroupName());
			System.out.println("가입날짜 " + list.get(i).getSgroupHiredate());
			System.out.println("이메일 " + list.get(i).getSgroupEmail());
			System.out.println("나이 " + list.get(i).getSgroupAge());
			System.out.println("====================================");
		}
	}

	// 3. 아이디로 회원 조회
	public void getSgroup() {
		System.out.println("회원 ID>");
		String sgrid = sc.nextLine();
		Sgroup sgr = SgroupDAO.getInstance().getSgroup(sgrid);
		if (sgr == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("회원 ID : " + sgr.getSgroupId());
			System.out.println("이름 : " + sgr.getSgroupName());
			System.out.println("가입 날짜 : " + sgr.getSgroupHiredate());
			System.out.println("이메일 : " + sgr.getSgroupEmail());
			System.out.println("나이 : " + sgr.getSgroupAge());
		}
	}

	// 4. 이메일 변경
	public void modifySgr() {
		System.out.println("===========이메일 변경============");
		System.out.println("수정할 회원 ID");
		String sgrId = sc.nextLine();
		System.out.println("수정된 이메일");
		String sgrEmail = sc.nextLine();

		Sgroup sgr = new Sgroup();
		sgr.setSgroupId(sgrId);
		sgr.setSgroupEmail(sgrEmail);

		int result = SgroupDAO.getInstance().modifySgroup(sgr);

		if (result > 0) {
			System.out.println("이메일 수정 완료");
		} else {
			System.out.println("이메일 수정 실패");
		}
	}

	// 5. 소모임 인원 강제 탍뢰
	public void deleteSgroup() {
		System.out.println("===========회원 삭제=============");
		System.out.println("삭제 회원 ID>");
		String sgrId = sc.nextLine();

		Sgroup sgr = new Sgroup();
		sgr.setSgroupId(sgrId);

		int result = SgroupDAO.getInstance().deleteSgroup(sgr);

		if (result > 0) {
			System.out.println("회원 삭제 완료");

		} else {
			System.out.println("회원 삭제 실패");
		}
	}

}
