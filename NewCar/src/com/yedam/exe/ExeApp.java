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



	private void run() {

		String menu = "";
		while (run) {
			if (NewCarService.memInfo != null) {

				if (NewCarService.memInfo.getMemberId().equals("ge")) {
					SuperloginMenu();
				} else {
					loginMenu();
				}
			} else{
				
				logoutMenu();
			}

		}
	}

	private void SuperloginMenu() {
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("========================조회========================" + "\n" + "\n"
				+ "   1. 전체 회원 조회 | 2. 전체 차량 조회 | 3. 회원 조회 | 4. 차량 조회" + "\n" + "\n"
				+ "======================회원관리======================" + "\n" + "\n"
				+ "   5. 회원 등록  | 6. 회원 정보 수정 | 7.  회원 탈퇴" + "\n" + "\n"
				+ "======================차량관리======================" + "\n" + "\n"
				+ "   8. 차량 등록 | 9. 수동 차량 수리  | 10. 차량 정보 수정" + "\n" + "\n"
				+ "======================서비스======================" + "\n" + "\n"
				+ "   11. 차량 삭제 | 12. 렌트 현황 | 13. 보험 현황 | 14. 수익 | 15. 로그아웃" + "\n");
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
			ps.insertNewMember();
			break;

		case "6":
			ps.modifyMember();
			break;
		case "7":
			ps.deleteMember();
			break;
		case "8":
			ps.insertCar();
			break;
		case "9":
			ps.FixNewCar();
			
			break;	
		case "10":
			ps.modifyCar();
			break;
		case "11":
			ps.deleteCar();
			break;
		case "12":
			ps.getRentList();
			break;
		case "13":
			ps.getInsuranceList();
			break;
		
		case "14":
			ps.getIncome();
			break;
		case "15":
			logoutMenu();
			break;
		default:
			break;
		}
	}

	private void loginMenu() {
		System.out.println(
				"--------------------------------------------------------------------------------------------");
		System.out.println("   1. 마이페이지 | 2. 정보 수정 | 3. 회원 탈퇴 | 4. 안내 | 5. 렌트(예약) " + "\n" + "\n"
				+ "   6. 렌트 취소 | 7. 반납 및 결제  | 8. 가격 | 9. 보험 가입 | |10. 보험 취소 | 11. 로그아웃");
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
			logoutMenu();
			break;
		case "4":
			ps.RentInfo();
			
			break;
		case "5":
			ps.Rent();
			break;
		case "6":
			ps.CancelRent();

			break;
		case "7":
			ps.RentReturn();
			
			break;
		case "8":
			ps.getPrice();
			break;
		case "9":
			ps.insertInsurance();
			break;

		case "10":
			ps.CancelInsurance();
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