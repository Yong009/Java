package com.yedam.exe;

import java.util.Scanner;

import com.yedam.service.NewCar;
import com.yedam.service.NewCarDAO;
import com.yedam.service.NewCarService;

public class ExeApp {
	NewCarService ps = new NewCarService();
	Scanner sc = new Scanner(System.in);
	String menu = "";
	boolean run = true;

	public ExeApp() {
		run();
	}

//	Project member = new Project();

//	Project memberId = ProjectDAO.getInstance().login(memberID);

//    String member = ProjectService.login(memberID);
//	member = ProjectDAO.getInstance().login(memberID);

	private void run() {

		String menu = "";
		while (run) {
			if (NewCarService.memInfo != null) {

				if (NewCarService.memInfo.getMemberId().equals("ge")) {
					SuperloginMenu();
				} else {
					loginMenu();
				}
			}
			if (NewCarService.memInfo == null) {

				logoutMenu();
			}

		}
	}

	private void SuperloginMenu() {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("========================조회========================" + "\n" + "\n"
				+ "   1.전체 회원 조회 | 2.전체 차량 조회 | 3.회원 조회 | 4.차량 조회" + "\n" + "\n"
				+ "======================회원관리======================" + "\n" + "\n" + "   5.회원 정보 수정  | 6.회원 탈퇴" + "\n"
				+ "\n" + "======================차량관리======================" + "\n" + "\n"
				+ "   7.차량 등록 | 8.차량 정보 수정  | 9.차량 삭제" + "\n" + "\n" + "======================서비스======================"
				+ "\n" + "\n" + "   10.렌트 현황 | 11.수익 | 12.블랙리스트 | 13.리뷰 | 14.보험 | 15.쿠폰 | 16.랭킹 | 17. 로그아웃" + "\n");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("입력>");
		menu = sc.nextLine();

		switch (menu) {
		case "1":
			ps.getMemberList();
			break;
		case "2":
			ps.getCarList();
			break;
		case "3":
			ps.getMember();
			break;
		case "4":
			ps.getCar();
			break;
		case "5":
			ps.modifyMember();
			break;
		case "6":
			ps.deleteMember();
			break;
		case "7":
			ps.insertCar();
			break;
		case "8":
			ps.modifyCar();
			break;
		case "9":
			ps.deleteCar();
			break;
		case "10":
			ps.getRentList();
			break;
		case "17":
			logoutMenu();
			break;

		default:
			break;
		}
	}

	private void loginMenu() {
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println("   1. 마이페이지 | 2. 정보 수정 | 3. 회원 탈퇴 | 4. 렌트(예약) | 5. 렌트 취소 " + "\n" + "\n"
				+ "   6. 반납 | 7.가격  | 8. 쿠폰 | 9. 리뷰 | 10. 랭킹 | 11. 로그아웃 ");
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println("입력>");
		menu = sc.nextLine();

		switch (menu) {
		case "1":
			ps.getMR();
			break;
		case "2":
			ps.modifyMyMember();
			break;
		case "3":
			ps.deleteMyMember();
			break;
		case "4":
			ps.Rent();
			break;
		case "5":
			ps.CancelRent();
			break;
		case "6":
			ps.RentReturn();
			break;
		case "7":
			ps.getPrice();
			break;
		case "8":

			break;

		case "9":

			break;
		case "10":
			
			break;
		case "11":
			logoutMenu();
			break;
		default:
			break;
		}

	}

	private void logoutMenu() {
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
		System.out.println("입력>");
		menu = sc.nextLine();
		if (menu.equals("1")) {
			ps.login();
		} else if (menu.equals("2")) {
			ps.insertNewMember();
			logoutMenu();
		} else if (menu.equals("3")) {
			run = false;
			System.out.println("프로그램 종료");
		}
	}

}