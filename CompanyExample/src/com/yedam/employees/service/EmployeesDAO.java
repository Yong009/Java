package com.yedam.employees.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmployeesDAO extends DAO {
	// 싱글톤
	private static EmployeesDAO employDao = null;

	private EmployeesDAO() {

	}

	private static EmployeesDAO getInstance() {
		if (employDao == null) {
			employDao = new EmployeesDAO();
		}
		return employDao;
	}

	// 모든 부서 조회
	public List<Employees> getEmployeesList() {
		List<Employees> list = new ArrayList<>();

		Employees employ = null;
		try {
			conn();
			String sql = "select * from emp";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				employ = new Employees();
				employ.setEmployeeId(rs.getInt("employee_id"));
				employ.setFirstName(rs.getInt("fisrst_name"));
				employ.setLastName(rs.getInt("last_name"));
				employ.setEmail(rs.getInt("email"));
				employ.setPhoneNumber(rs.getInt("phone_number"));
				employ.setHireDate(rs.getInt("hire_date"));
				employ.setJobId(rs.getInt("job_id"));
				employ.setSalary(rs.getInt("salary"));
				employ.setCommissionPct(rs.getInt("commission_pct"));

				list.add(employ);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 단건 조회
	public Employees getEmployee(int employeeKey) {
		Employees employ = null;
		try {
			conn();
			String sql = "select * from emp where employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, employeeKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {

				employ = new Employees();
				employ.setEmployeeId(rs.getInt("employee_id"));
				employ.setFirstName(rs.getInt("fisrst_name"));
				employ.setLastName(rs.getInt("last_name"));
				employ.setEmail(rs.getInt("email"));
				employ.setPhoneNumber(rs.getInt("phone_number"));
				employ.setHireDate(rs.getInt("hire_date"));
				employ.setJobId(rs.getInt("job_id"));
				employ.setSalary(rs.getInt("salary"));
				employ.setCommissionPct(rs.getInt("commission_pct"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();

		}

		return employ;

	}

	// 삭제
	public int deleteEmp(Employees em) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM EMP WHERE employee_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, em.getEmployeeId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	//수정
	public int modifyEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "update set employee_id = ? where salary =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setInt(2, emp.getSalary());
			
			result = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
				
		}finally {
			disconn();
		}
		return result;
	}
	
	//등록
	public int insertEmp(Employees emp) {
		int result = 0;
		try {
			conn();
			String sql = "insert into emp values (?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFisrtName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setString(4, emp.getEmail());
			pstmt.setInt(5, emp.getPhoneNumber());
			pstmt.setString(6, emp.getHireDate());
			pstmt.setInt(7, emp.getEmployeeId());
			pstmt.setString(8, emp.getJobId());
			pstmt.setDouble(9, emp.getCommissionPct());
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
}
