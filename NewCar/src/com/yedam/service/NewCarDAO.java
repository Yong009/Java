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

	// 0.로그인 기능
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

	// 1. 전체 회원 정보 조회
	public List<NewCar> getMemberList() {
		List<NewCar> list = new ArrayList<>();

		NewCar nc = null;
		try {
			conn();
			String sql = "select * from member";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				nc = new NewCar();
				nc.setMemberId(rs.getString("member_id"));
				nc.setMemberPw(rs.getString("member_pw"));
				nc.setMemberName(rs.getString("member_name"));
				nc.setMemberNumber(rs.getString("member_number"));

				list.add(nc);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 2. 전체 차량 정보 조회
	public List<NewCar> getCarList() {
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

	// 3. 회원 조회
	public NewCar getMember(String newcarKey) {
		NewCar nc = null;

		try {
			conn();
			String sql = "select * from member where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nc = new NewCar();
				nc.setMemberId(rs.getString("member_id"));
				nc.setMemberPw(rs.getString("member_pw"));
				nc.setMemberName(rs.getString("member_Name"));
				nc.setMemberNumber(rs.getString("member_Number"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return nc;
	}

	// 4. 차량 조회
	public NewCar getCar(int newcarKey) {
		NewCar nc = null;

		try {
			conn();
			String sql = "select * from car c join condition d on(c.car_number = d.car_number) where c.car_number = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nc = new NewCar();
				nc.setCarNumber(rs.getInt("car_number"));
				nc.setCarName(rs.getString("car_name"));
				nc.setCarKind(rs.getString("car_Kind"));
				nc.setCarYear(rs.getInt("car_year"));
				nc.setCarCount(rs.getInt("car_count"));
				nc.setCarOil(rs.getInt("car_oil"));
				nc.setCarEnoil(rs.getInt("car_Enoil"));
				nc.setCarTire(rs.getInt("car_tire"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return nc;
	}

	// 5. 회원 가입
	public int insertNewMember(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "insert into member values (?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nc.getMemberId());
			pstmt.setString(2, nc.getMemberPw());
			pstmt.setString(3, nc.getMemberName());
			pstmt.setString(4, nc.getMemberNumber());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 6. 회원 정보 수정
	public int modifyMember(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update member set member_pw = ? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nc.getMemberPw());
			pstmt.setString(2, nc.getMemberId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 7. 회원 탈퇴
	public int deleteMember(NewCar n) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM member where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getMemberId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 8.차량 등록
	public int insertNewCar(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "insert into car values (?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nc.getCarNumber());
			pstmt.setString(2, nc.getCarName());
			pstmt.setString(3, nc.getCarKind());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 8-1. 차 상태 등록
	public int insertNewCondition(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "insert into condition values (?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nc.getCarNumber());
			pstmt.setInt(2, nc.getCarYear());
			pstmt.setInt(3, nc.getCarCount());
			pstmt.setInt(4, nc.getCarOil());
			pstmt.setInt(5, nc.getCarEnoil());
			pstmt.setInt(6, nc.getCarTire());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 9. 차량 수정

	public int modifyCar(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update car set car_name = ? where car_kind = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nc.getCarName());
			pstmt.setString(2, nc.getCarKind());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 10.차량 삭제

	public int deleteCar(NewCar n) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM condition where car_number =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, n.getCarNumber());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 유저-------------------------------------------------------------------------------------------------------

	// 1.마이 페이지

	public NewCar MyMember(String newcarKey) {
		NewCar nc = null;

		try {
			conn();
			String sql = "select * from member where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nc = new NewCar();
				nc.setMemberId(rs.getString("member_id"));
				nc.setMemberPw(rs.getString("member_pw"));
				nc.setMemberName(rs.getString("member_Name"));
				nc.setMemberNumber(rs.getString("member_Number"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return nc;
	}
	
	//1-1 내 렌트 조회
	public NewCar getMyRent(String newcarKey) {
		NewCar nc = null;

		try {
			conn();
			String sql = "select * from rent where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nc = new NewCar();
				nc.setMemberId(rs.getString("member_id"));
				nc.setCarNumber(rs.getInt("car_number"));
				nc.setRentDate(rs.getString("rent_date"));
				nc.setRentDistance(rs.getInt("rent_distance"));
				nc.setRentReserved(rs.getString("rent_reserved"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return nc;
	} 
	
	
	// 2. 정보 수정
	public int modifyMyMember(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update member set member_pw = ? where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, nc.getMemberPw());
			pstmt.setString(2, nc.getMemberId());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	//3. 회원 탈퇴
	
	public int deleteMyMember(NewCar n) {
		int result = 0;
		try {
			conn();
			String sql = "DELETE FROM member where member_id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getMemberId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	//4. 렌트
	public int rent(NewCar r) {
		int result = 0;
		try {
			conn();
			String sql = "Insert into rent values(?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, r.getCarNumber());
			pstmt.setString(2, r.getRentDate());
			pstmt.setInt(3, r.getRentDistance());
			pstmt.setString(4, r.getRentReserved());
			pstmt.setString(5,r.getMemberId());

			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	
}
