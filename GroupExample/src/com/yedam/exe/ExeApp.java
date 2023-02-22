package com.yedam.exe;

import java.util.Scanner;

import com.yedam.sgroup.service.SgroupService;

public class ExeApp {
	SgroupService sg = new SgroupService();
	Scanner sc = new Scanner(System.in);
	String menu = "";
	boolean run = true;
	
	public ExeApp() {
		run();
	}
	
	private void run() {
	
		while(run) {
			if(SgroupService.sgrInfo != null) {
				loginMenu();
			} else if(SgroupService.sgrInfo == null) {
				logoutMenu();
			}
		}
	}
	
	private void loginMenu() {
		System.out.println("=====================================");
		System.out.println("==1. 등록 2. 조회 3. 한명 조회 4. 수정  5. 종료==");
		System.out.println("======================================");
		System.out.println("입력>");
		menu = sc.nextLine();
		
		switch (menu){
		case "1":
			//등록
		sg.insertSgroup();
			break;
		
		case "2":
			//조회
			sg.getSgroupList();
			break;
		
		case "3":
			sg.getSgroup();
			break;
		
		case "4":
			sg.modifySgr();
			break;
		
		case "5":
			System.out.println("프로그램 종료");
			break;
		}
	}
	
	private void logoutMenu() {
		System.out.println("1.로그인 | 2. 종료");
		System.out.println("입력>");
		menu = sc.nextLine();
		if(menu.equals("1")){
			sg.login();
		} else if (menu.equals("2")) {
			run = false;
			System.out.println("프로그램 종료");
		}
				 
	}
	
}
