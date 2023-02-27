package com.yedam.service;

import java.util.List;
import java.util.Scanner;

public class NewCarService {

	public static NewCar memInfo = null;
	Scanner sc = new Scanner(System.in);

	// 0.로그인
	public void login() {
		NewCar member = null;
		System.out.println("ID>");
		String memberID = sc.nextLine();
		System.out.println("pw>");
		String memberPw = sc.nextLine();

		member = NewCarDAO.getInstance().login(memberID);

		if (member != null) {

			if (memberID.equals("ge")) {
				if (member.getMemberPw().equals(memberPw)) {
					System.out.println("로그인 되었습니다.");
					System.out.println("🚍🚘🚗관리자로 접속하였습니다.🚗🚘🚍");
					memInfo = member;
				} else {
					System.out.println("비밀번호가 틀립니다.");
				}
			} else if (member.getMemberPw().equals(memberPw)) {
				System.out.println("로그인 되었습니다.");
				System.out.println("   🚍🚘🚗   " + member.getMemberId() + "님 신카에 접속한 것을 환영합니다.   🚗🚘🚍   ");
				memInfo = member;

			} else {
				System.out.println("비밀번호가 틀립니다.");
			}

		} else {
			System.out.println("해당 아이디는 존재하지 않습니다.");

		}

	}

	// 1. 전체 회원 정보 조회
	public void getMemberList() {
		List<NewCar> list = NewCarDAO.getInstance().getMemberList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("회원 ID : " + list.get(i).getMemberId());
			System.out.println("회원 PW : " + list.get(i).getMemberPw());
			System.out.println("이름 : " + list.get(i).getMemberName());
			System.out.println("연락처 : " + list.get(i).getMemberNumber());
			System.out.println("------------------------------------------");

		}

	}

	// 2. 전체 차량 조회
	public void getCarList() {
		List<NewCar> list = NewCarDAO.getInstance().getCarList();
		for (int i = 0; i < list.size(); i++) {
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

	// 3.회원 조회
	public void getMember() {
		System.out.println("회원 ID>");
		String ncid = sc.nextLine();
		NewCar nc = NewCarDAO.getInstance().getMember(ncid);
		if (nc == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("회원 ID : " + nc.getMemberId());
			System.out.println("회원 pw : " + nc.getMemberPw());
			System.out.println("이름 : " + nc.getMemberName());
			System.out.println("연락처 : " + nc.getMemberNumber());
		}
	}

	// 4.차량 조회
	public void getCar() {
		System.out.println("차량 번호>");
		int ncid = Integer.parseInt(sc.nextLine());
		NewCar nc = NewCarDAO.getInstance().getCar(ncid);
		if (nc == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("차량 번호 : " + nc.getCarNumber());
			System.out.println("차량 이름 : " + nc.getCarName());
			System.out.println("차량 종류 : " + nc.getCarKind());
			System.out.println("차량 연식 : " + nc.getCarYear());
			System.out.println("대여한 횟수  : " + nc.getCarCount());
			System.out.println("기름 : " + nc.getCarOil());
			System.out.println("엔진오일 : " + nc.getCarEnoil());
			System.out.println("타이어 : " + nc.getCarTire());
		}
	}

	// 5. 회원 등록
	public void insertNewMember() {
		System.out.println("-----------회원 등록-------------");
		System.out.println("회원 아이디>");
		String ncId = sc.nextLine();
		System.out.println("패스워드>");
		String ncPw = sc.nextLine();
		System.out.println("이름>");
		String ncName = sc.nextLine();
		System.out.println("연락처>");
		String ncNumber = sc.nextLine();

		NewCar nc = new NewCar();
		nc.setMemberId(ncId);
		nc.setMemberPw(ncPw);
		nc.setMemberName(ncName);
		nc.setMemberNumber(ncNumber);

		int result = NewCarDAO.getInstance().insertNewMember(nc);

		if (result > 0) {
			System.out.println("회원 등록 완료");

		} else {
			System.out.println("회원 등록 실패");
		}
	}

	// 6. 회원 정보 수정

	public void modifyMember() {
		System.out.println("-------------비밀번호 변경---------------");
		System.out.println("수정할 회원 ID");
		String ncId = sc.nextLine();
		System.out.println("수정된 비번");
		String ncPw = sc.nextLine();

		NewCar nc = new NewCar();
		nc.setMemberId(ncId);
		nc.setMemberPw(ncPw);

		int result = NewCarDAO.getInstance().modifyMember(nc);

		if (result > 0) {
			System.out.println("비밀번호 수정 완료");
		} else {
			System.out.println("비밀번호 수정 실패");
		}
	}

	// 7. 회원 탈퇴
	public void deleteMember() {
		System.out.println("-----------회원 삭제--------------");
		System.out.println("삭제 회원 ID>");
		String ncId = sc.nextLine();

		NewCar nc = new NewCar();
		nc.setMemberId(ncId);

		int result = NewCarDAO.getInstance().deleteMember(nc);

		if (result > 0) {
			System.out.println("회원 삭제 완료");
		} else {
			System.out.println("회원 삭제 실패");
		}

	}

	// 8. 차량 등록
	public void insertNewCar() {
		System.out.println("-----------차량 등록-------------");
		System.out.println("차 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());
		System.out.println("차 이름>");
		String ncName = sc.nextLine();
		System.out.println("차종>");
		String ncKind = sc.nextLine();

		NewCar nc = new NewCar();
		nc.setCarNumber(ncNumber);
		nc.setCarName(ncName);
		nc.setCarKind(ncKind);

		int result = NewCarDAO.getInstance().insertNewCar(nc);

	}

	// 8-1 차량 상태 등록
	public void insertNewCondition() {
		System.out.println("-----------차량 상태 등록-------------");
		System.out.println("차 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());
		System.out.println("차 연식>");
		int ncYear = Integer.parseInt(sc.nextLine());
		System.out.println("대여해 준 횟수>");
		int ncCount = Integer.parseInt(sc.nextLine());
		System.out.println("기름>");
		int ncOil = Integer.parseInt(sc.nextLine());
		System.out.println("엔진오일>");
		int ncEnoil = Integer.parseInt(sc.nextLine());
		System.out.println("타이어>");
		int ncTire = Integer.parseInt(sc.nextLine());

		NewCar nc = new NewCar();
		nc.setCarNumber(ncNumber);
		nc.setCarYear(ncYear);
		nc.setCarCount(ncCount);
		nc.setCarOil(ncOil);
		nc.setCarEnoil(ncEnoil);
		nc.setCarTire(ncTire);

		int result = NewCarDAO.getInstance().insertNewCondition(nc);

		if (result > 0) {
			System.out.println("차량 등록 완료");

		} else {
			System.out.println("차량 등록 실패");
		}
	}

	// 차 all 등록
	public void insertCar() {
		insertNewCar();
		insertNewCondition();
	}
	
	// 9. 차량 교체
	
	// 10. 차량 수정
	public void modifyCar() {
		System.out.println("-------------차 이름 변경---------------");
		System.out.println("차종>");
		String ncKind = sc.nextLine();
		System.out.println("차 이름>");
		String ncName = sc.nextLine();

		NewCar nc = new NewCar();
		nc.setCarKind(ncKind);
		nc.setCarName(ncName);

		int result = NewCarDAO.getInstance().modifyCar(nc);

		if (result > 0) {
			System.out.println("차 수정 완료");
		} else {
			System.out.println("차 수정 실패");
		}
	}

	// 11.차량 삭제

	public void deleteCar() {
		System.out.println("-----------차량 삭제--------------");
		System.out.println("삭제 차량 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());

		NewCar nc = new NewCar();
		nc.setCarNumber(ncNumber);

		int result = NewCarDAO.getInstance().deleteCar(nc);

		if (result > 0) {
			System.out.println("차량 삭제 완료");
		} else {
			System.out.println("차량 삭제 실패");
		}

	}

	// 12. 렌트 현황 조회
	public void getRentList() {
		List<NewCar> list = NewCarDAO.getInstance().getRentList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberId() != null) {
				System.out.println("렌트 ID : " + list.get(i).getRentId());
				System.out.println("차량 번호 : " + list.get(i).getCarNumber());
				System.out.println("날짜 : " + list.get(i).getRentDate());
				System.out.println("거리 : " + list.get(i).getRentDistance());
				System.out.println("예약 : " + list.get(i).getRentReserved());
				System.out.println("회원 ID : " + list.get(i).getMemberId());
				System.out.println("------------------------------------------");

			} else {
				System.out.println("차량 번호 : " + list.get(i).getCarNumber());
				System.out.println("렌트 되지 않았습니다.");
				System.out.println("------------------------------------------");
			}
		}
	}

	// 13. 보험 현황 조회
	public void getInsuranceList() {
		List<NewCar> list = NewCarDAO.getInstance().getInsuranceList();
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getMemberId() == null) {
				count++;
			} else {
				System.out.println("차량 번호 : " + list.get(i).getCarNumber());
				System.out.println("회원 ID : " + list.get(i).getMemberId());
				System.out.println("보험가입여부 : " + list.get(i).getInInsurance());
				System.out.println("------------------------------------------");
			}
		}
		if (count == list.size()) {
			System.out.println("조회된 값이 없습니다.");
		}

	}

	// 14. 수익
	int money = 0;

	public void getIncome() {
		int result = NewCarDAO.getInstance().Income2();
		System.out.println(result);
	}
	// 유저-----------------------------------------------------------------

	// 1. 마이페이지
	public void getMyMember() {

		NewCar nc = NewCarDAO.getInstance().getMember(memInfo.getMemberId());
		if (nc == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("회원 ID : " + nc.getMemberId());
			System.out.println("회원 pw : " + nc.getMemberPw());
			System.out.println("이름 : " + nc.getMemberName());
			System.out.println("연락처 : " + nc.getMemberNumber());
		}
	}

	// 1-1 렌트 조회
	public void getMyRent() {

		NewCar nc = NewCarDAO.getInstance().getMyRent(memInfo.getMemberId());
		if (nc == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("차량 번호 : " + nc.getCarNumber());
			System.out.println("차량 이름 : " + nc.getCarName());
			System.out.println("차종 : " + nc.getCarKind());
			System.out.println("렌트한 날짜 : " + nc.getRentDate());
			System.out.println("총 탈 수 있는 거리 : " + nc.getRentDistance());
			System.out.println("예약 : " + nc.getRentReserved());
		}
	}

	// 1-2 보험 조회
	public void getMyInsurance() {
		NewCar nc = NewCarDAO.getInstance().getMyInsurance(memInfo.getMemberId());

		if (nc == null) {
			System.out.println("보험 가입하지 않았습니다.");

		} else {
			System.out.println("보험가입여부 : " + nc.getInInsurance());
		}

	}

	public void getMR() {
		getMyMember();

		System.out.println("------------나의 렌트 조회-------------");
		NewCar nc = NewCarDAO.getInstance().getMyRent(memInfo.getMemberId());

		if (nc != null) {
			getMyRent();

		} else {
			System.out.println("조회된 결과 없음");
		}

		System.out.println("-------------보험 조회-----------------");

		NewCar ns = NewCarDAO.getInstance().getMyInsurance(memInfo.getMemberId());

		if (ns != null) {
			getMyInsurance();

		} else {
			System.out.println("조회된 결과 없음");
		}

	}

	// 2. 정보 수정
	public void modifyMyMember() {
		System.out.println("-------------비밀번호 변경---------------");
//		System.out.println("수정할 회원 ID");
//		String ncId = sc.nextLine();
		System.out.println("수정된 비번");
		String ncPw = sc.nextLine();

		NewCar nc = new NewCar();
		nc.setMemberId(memInfo.getMemberId());
		nc.setMemberPw(ncPw);

		int result = NewCarDAO.getInstance().modifyMember(nc);

		if (result > 0) {
			System.out.println("비밀번호 수정 완료");
		} else {
			System.out.println("비밀번호 수정 실패");
		}
	}

	// 3. 회원 탈퇴
	public void deleteMyMember() {
		System.out.println("-----------회원 삭제--------------");

		NewCar nc = new NewCar();
		nc.setMemberId(memInfo.getMemberId());

		int result = NewCarDAO.getInstance().deleteMember(nc);

		if (result > 0) {
			System.out.println("회원 삭제 완료");
		} else {
			System.out.println("회원 삭제 실패");
		}

	}

	// 4. 렌트

	public void Rent() {
		System.out.println("-------------렌트---------------");
//		System.out.println("수정할 회원 ID");
//		String ncId = sc.nextLine();

		System.out.println("렌트 번호>");
		int ncRentId = Integer.parseInt(sc.nextLine());
		System.out.println("차량 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());
		System.out.println("날짜>");
		String ncDate = sc.nextLine();
		System.out.println("거리>");
		int ncDistance = Integer.parseInt(sc.nextLine());
		System.out.println("예약>");
		String ncReserved = sc.nextLine();
//		System.out.println("예약자명(ex)아이디 기입)>");
//		String ncMemberId = sc.nextLine();
		System.out.println("보험(y/n)>");
		String ncIn = sc.nextLine();

		NewCar nc = new NewCar();
		nc.setRentId(ncRentId);
		nc.setInInsurance(ncIn);
		nc.setCarNumber(ncNumber);
		nc.setRentDate(ncDate);
		nc.setRentDistance(ncDistance);
		nc.setRentReserved(ncReserved);
		nc.setMemberId(memInfo.getMemberId());

		int result = NewCarDAO.getInstance().Rent(nc);

		if (ncIn.equals("y")) {

			int result2 = NewCarDAO.getInstance().insertInsurance(nc);
			System.out.println("보험 가입했습니다.");
		} else {
			System.out.println("보험 가입하지 않았습니다.");
		}

		if (result > 0) {
			System.out.println("렌트 완료");
		} else {
			System.out.println("렌트 실패");
		}
	}

	// 5. 렌트 취소

	public void CancelRent() {
		System.out.println("-------------렌트취소---------------");
//		System.out.println("수정할 회원 ID");
//		String ncId = sc.nextLine();

		System.out.println("차량 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());

//		System.out.println("예약자명(ex)아이디 기입)>");
//		String ncMemberId = sc.nextLine();

		NewCar nc = new NewCar();

		nc.setCarNumber(ncNumber);

		int result = NewCarDAO.getInstance().CancelRent(nc);
		int result2 = NewCarDAO.getInstance().CancelPrice(nc);
		int result3 = NewCarDAO.getInstance().CancelInsurance(nc);

		if (result > 0) {
			System.out.println("취소 완료");
		} else {
			System.out.println("취소 실패");
		}
	}

	// 6. 렌트 반납 및 결제
	public void RentReturn() {
		System.out.println("-------------렌트반납---------------");

		// 결제
		System.out.println("차량 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());

		System.out.println("=============결제 금액=============\n");
		NewCar ns = NewCarDAO.getInstance().getPrice(memInfo.getMemberId());
		NewCar nd = NewCarDAO.getInstance().getInsurance(ncNumber);
		int price = 0;
		if (nd==null) {
			price = (ns.getPricePrice() + ns.getPriceOil());
			System.out.println("렌트 번호 : " + ns.getRentId());
			System.out.println("차량 번호 : " + ns.getCarNumber());
			System.out.println("차량 이름 : " + ns.getCarName());
			System.out.println("차종 : " + ns.getCarKind());
			System.out.println("총 이용한 거리 : " + ns.getRentDistance());
			System.out.println("기본 가격 : " + ns.getPricePrice());
			System.out.println("기름값 : " + ns.getPriceOil());

			System.out.println("\n총 금액 " + price + "\n");
		} else  {
			price =(ns.getPricePrice() + ns.getPriceOil() + nd.getInPrice());
			System.out.println("렌트 번호 : " + ns.getRentId());
			System.out.println("차량 번호 : " + ns.getCarNumber());
			System.out.println("차량 이름 : " + ns.getCarName());
			System.out.println("차종 : " + ns.getCarKind());
			System.out.println("총 이용한 거리 : " + ns.getRentDistance());
			System.out.println("기본 가격 : " + ns.getPricePrice());
			System.out.println("기름값 : " + ns.getPriceOil());
			System.out.println("보험료 : " + nd.getInPrice());
			System.out.println("\n총 금액 " + price + "\n");
		}

		boolean run = true;
		while (run) {
			System.out.println("내신 금액>");
			int pay = Integer.parseInt(sc.nextLine());
			if (nd.getInInsurance().equals("n")) {
				if (ns.getPriceOil() + ns.getPricePrice() > pay) {
					System.out.println("\n결제 금액이 부족합니다");
				} else {

				}
			}
			if (nd.getInInsurance().equals("y")) {

				if (ns.getPriceOil() + ns.getPricePrice() + nd.getInPrice() > pay) {
					System.out.println("\n결제 금액이 부족합니다");
				}
			} else {

			}

			NewCar nc = new NewCar();

			nc.setCarNumber(ncNumber);

			// 반납
			int result = NewCarDAO.getInstance().RentReturn(ns);

			if (result > 0) {

				System.out.println(pay - (ns.getPriceOil() + ns.getPricePrice() + nd.getInPrice()) + "을 거슬러 드리겠습니다.");
				System.out.println("\n반납 완료");
				money += price;
				int re = NewCarDAO.getInstance().Income(price);
				
				int result2 = NewCarDAO.getInstance().CancelPrice(ns);
				int result3 = NewCarDAO.getInstance().CancelInsurance(ns);
				run = false;
			} else {
				System.out.println("\n반납 실패");
			}
		}
	}

	// 7. 가격

	public void getPrice() {

		NewCar nc = NewCarDAO.getInstance().getPrice(memInfo.getMemberId());

		NewCar is = NewCarDAO.getInstance().getInsurance(memInfo.getCarNumber());

		if (nc == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("렌트 번호 : " + nc.getRentId());
			System.out.println("차량 번호 : " + nc.getCarNumber());
			System.out.println("차량 이름 : " + nc.getCarName());
			System.out.println("차종 : " + nc.getCarKind());
			System.out.println("총 이용한 거리 : " + nc.getRentDistance());
			System.out.println("기본 가격 : " + nc.getPricePrice());
			System.out.println("기름값 : " + nc.getPriceOil());
			
			if (is == null) {
				System.out.println("보험 가입하지 않았습니다.");
				System.out.println("\n총 금액 " + (nc.getPricePrice() + nc.getPriceOil()));
			} else {
				System.out.println("보험료 : " + is.getInPrice());
				System.out.println("\n총 금액 " + (nc.getPricePrice() + nc.getPriceOil() + is.getInPrice()));
				money += is.getInPrice();
			}
		}
	}

	public void CancelPrice() {

		System.out.println("차량 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());

//		System.out.println("예약자명(ex)아이디 기입)>");
//		String ncMemberId = sc.nextLine();

		NewCar nc = new NewCar();

		nc.setCarNumber(ncNumber);

		int result = NewCarDAO.getInstance().CancelPrice(nc);

	}

	// 7-1 보험 조회

	public void getInsurance() {

		NewCar nc = NewCarDAO.getInstance().getMyRent(memInfo.getMemberId());

		if (nc == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("보험료 : " + nc.getInPrice());
		}
	}

	// 8. 보험
	public void insertInsurance() {
		System.out.println("-----------보험 가입-------------");
		System.out.println("보험 하실여부(y/n>");
		String ncin = sc.nextLine();

		System.out.println("차량 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());

		NewCar nc = new NewCar();
		nc.setCarNumber(ncNumber);
		nc.setInInsurance(ncin);
		nc.setMemberId(memInfo.getMemberId());

		int result = NewCarDAO.getInstance().insertInsurance(nc);

		if (result > 0) {
			System.out.println("보험 등록 완료");

		} else {
			System.out.println("보험 등록 실패");
		}
	}

	// 8-1 보험 취소
	public void CancelInsurance() {
		System.out.println("-------------보험 취소---------------");
//		System.out.println("수정할 회원 ID");
//		String ncId = sc.nextLine();

		System.out.println("차량 번호>");
		int ncNumber = Integer.parseInt(sc.nextLine());

//		System.out.println("예약자명(ex)아이디 기입)>");
//		String ncMemberId = sc.nextLine();

		NewCar nc = new NewCar();

		nc.setCarNumber(ncNumber);

		int result = NewCarDAO.getInstance().CancelInsurance(nc);

		if (result > 0) {
			System.out.println("취소 완료");
		} else {
			System.out.println("취소 실패");
		}
	}

}
