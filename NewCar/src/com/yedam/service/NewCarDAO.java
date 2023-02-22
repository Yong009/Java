package com.yedam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.common.DAO;

public class NewCarDAO extends DAO {
	Scanner sc = new Scanner(System.in);
	// 싱글톤

	private static NewCarDAO nDao = new NewCarDAO();

	private NewCarDAO() {

	}

	public static NewCarDAO getInstance() {
		return nDao;
	}

	// 1.로그인 기능
	public NewCar login(String id) {
		NewCar mem = null;
		try {
			conn();
			String sql = "select * from member where member_id = ?";
			System.out.println(id);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				mem = new NewCar();
				mem.setMemberId(rs.getString("member_id"));
				mem.setMemberPw(rs.getString("member_pw"));
				mem.setMemberName(rs.getString("member_name"));
				mem.setMemberNumber(rs.getString("member_number"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return mem;

	}
	
	//2.회원 정보 조회
	public List<NewCar> getMemberList() {
		List<NewCar> list = new ArrayList<>();
		
		NewCar nc = null;
		try {
			conn();
			String sql = "select * from member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				nc = new NewCar();
				nc.setMemberId(rs.getString("member_id"));
				nc.setMemberPw(rs.getString("member_pw"));
				nc.setMemberName(rs.getString("member_name"));
				nc.setMemberNumber(rs.getString("member_number"));
				
				list.add(nc);
			}
			
			
			
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				disconn();
			}
		return list;
		}
	
  //3. 차량 정보 조회
	public List<NewCar> getCarList(){
		List<NewCar> list = new ArrayList<>();
		
		NewCar nc = null;
		try {
			conn();
			String sql = "select * from car ca join condition co on(ca.car_number = co.car_number)";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				nc = new NewCar();
				nc.setCarNumber(rs.getInt("car_number"));
				nc.setCarName(rs.getString("car_name"));
				nc.setCarKind(rs.getString("car_kind"));
				nc.setCarYear(rs.getInt("car_year"));
				nc.setCarCount(rs.getInt("car_count"));
				nc.setCarOil(rs.getInt("car_Oil"));
				nc.setCarEnoil(rs.getInt("car_Enoil"));
				nc.setCarTire(rs.getInt("car_tire"));
				
				list.add(nc);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	//4. 단건 조회
	public NewCar getNewCar(String newcarKey) {
		NewCar nc = null;
		
		try {
			conn();
			String sql = "select * from member where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newcarKey);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				nc = new NewCar();
				nc.setMemberId(rs.getString("member_id"));
				nc.setMemberPw(rs.getString("member_pw"));
				nc.setMemberName(rs.getString("member_Name"));
				nc.setMemberNumber(rs.getString("member_Number"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return nc;
	}
	
	//5. 정보 수정
	public int modifyNewCar(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update set member_pw = ? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nc.getMemberPw());
			pstmt.setString(1, nc.getMemberId());

			result = pstmt.executeUpdate();
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			disconn();
		}
		return result;
	}
	
}


