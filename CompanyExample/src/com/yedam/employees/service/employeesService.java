package com.yedam.employees.service;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class employeesService {
	Scanner sc = new Scanner(System.in);
	
	//모든 부서 조회
	public void getEmployeesList() {
		List<Employees> list = EmployeesDAO.getInstance().getEmployeesList();
		for(int i=0; i<list.size(); i++) {
			System.out.println("사원 번호 : " + list.get(i).getEmployeeId());
			System.out.println("성 : " + list.get(i).getFirstName());
			System.out.println("이름 : " + list.get(i).getLastName());
			System.out.println("메일 : " + list.get(i).getEmail());
			System.out.println("폰번호 : " + list.get(i).getPhoneNumber());
			System.out.println("입사일 : " + list.get(i).getHireDate());
			System.out.println("업무 이름 : " + list.get(i).getJobId());
			System.out.println("급여 : " + list.get(i).getSalary());
			System.out.println("수당 : " + list.get(i).getCommissionPct());
		}
	}
	//사원 조회
	public void getEmployees() {
		System.out.println("사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		Employees emp = EmployeesDAO.getInstance().getEmployee(empNo);
		if(emp == null) {
			System.out.println("조회된 결과 없음");
		} else {
			System.out.println("사원 번호 : " + emp.getEmployeeId());
			System.out.println("성 : " + emp.getFirstName());
			System.out.println("이름 : " + emp.getLastName());
			System.out.println("메일 : " + emp.getEmail());
			System.out.println("폰번호 : " + emp.getPhoneNumber());
			System.out.println("입사일 : " + emp.getHireDate());
			System.out.println("업무 이름 : " + emp.getJobId());
			System.out.println("급여 : " + emp.getSalary());
			System.out.println("수당 : " + emp.getCommissionPct());
		}
	}
	//등록
	public void insertEmp() {
		System.out.println("=============사원 등록============");
		System.out.println("사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("성");
		String empFirst = sc.nextLine();
		System.out.println("이름");
		String empLast = sc.nextLine();
		System.out.println("이메일");
		String empEmail = sc.nextLine()	;
		System.out.println("폰번호");
		String empPhone = sc.nextLine();
		System.out.println("입사일");
		String empHire = sc.nextLine();
		System.out.println("업무 이름");
		String empJob = sc.nextLine();
		System.out.println("급여");
		int empSalary = Integer.parseInt(sc.nextLine());
		System.out.println("수당");
		double empCo = Double.parseDouble(sc.nextLine());
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		emp.setFirstName(empFirst);
		emp.setLastName(empLast);
		emp.setEmail(empEmail);
		emp.setPhoneNumber(empPhone);
		emp.setHireDate(empHire);
		emp.setJobId(empJob);
		emp.setSalary(empSalary);
		emp.setCommissionPct(empCo);
		
		int result = EmployeesDAO.getInstance().insertEmp(emp);
		
		if(result>0) {
			System.out.println("사원 등록 완료");
			
		} else {
			System.out.println("사원 등록 실패");
		}
	}

	//수정
	public void modifyEmp() {
		System.out.println("=============사원 수정===========");
		System.out.println("수정 사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
		System.out.println("바꿀 급여 번호>");
		int empSalary = Integer.parseInt(sc.next());
		
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		emp.setSalary(empSalary);
		
		int result = EmployeesDAO.getInstance().modifyEmp(emp);
		
		if(result>0) {
			System.out.println("사원 수정 완료");
		} else {
			System.out.println("사원 수정 실패");
		}
	}
	//삭제
	public void deleteEmp() {
		System.out.println("============사원 삭제==============");
		System.out.println("삭제 사원 번호>");
		int empNo = Integer.parseInt(sc.nextLine());
				
		Employees emp = new Employees();
		emp.setEmployeeId(empNo);
		
		
		int result = EmployeesDAO.getInstance().deleteEmp(emp);
		
		if(result>0) {
			System.out.println("사원 삭제 완료");
		} else {
			System.out.println("사원 삭제 실패");
		}
	}
	}


