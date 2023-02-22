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
			} if (NewCarService.memInfo == null) {

				logoutMenu();
			}

		}
	}

	private void SuperloginMenu() {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println(
				"--1.전체 회원 조회 | 2. 전체 차량 조회 | 3. 단건 조회 | 4. 정보 수정  | 5.회원 강제 탈퇴  | 6.수익,판매량 | 7.블랙리스트 | 8.랭킹");
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

			break;
		case "5":

			break;
		case "6":

			break;
		case "7":

			break;
		case "8":

			break;
		case "9":

			break;

		default:
			break;
		}
	}

	private void loginMenu() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("--1.정보 수정 | 2. 대여(예약) | 3. 가격 | 4. 보험 | 5. 리뷰 | 6. 쿠폰 | 7. 블랙리스트 | 8.랭킹");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("입력>");
		menu = sc.nextLine();

		switch (menu) {
		case "1":

			break;
		case "2":

			break;
		case "3":

			break;
		case "4":

			break;
		case "5":

			break;
		case "6":

			break;
		case "7":

			break;
		case "8":

			break;

		default:
			break;
		}

	}

	private void logoutMenu() {
		System.out.println("1. 로그인 | 2. 종료");
		System.out.println("입력>");
		menu = sc.nextLine();
		if (menu.equals("1")) {
			ps.login();
		} else if (menu.equals("2")) {
			run = false;
			System.out.println("프로그램 종료");
		}
	}

}