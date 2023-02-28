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

	// 9. 차량 오일 교체
	public int FixOil(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update condition set car_oil =200 where car_number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nc.getCarNumber());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	//9-1. 차량 엔진오일 교체
	public int FixEnOil(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update condition set car_enoil =100 where car_number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nc.getCarNumber());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	//9-3. 차량 타이어 교체
	
	public int FixTire(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update condition set car_Tire =50 where car_number=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nc.getCarNumber());
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	//9-4. 렌트 사용후 컨디션 변화
	public int FixCar(int num) {
		int result = 0;
		try {
			conn();
			String sql = "Update condition set car_count =(select car_count+1 from condition where car_number = ?),car_Enoil = (select car_Enoil-20 from condition where car_number =?), car_oil = (select car_oil-10 from condition where car_number =?), car_tire = (select car_tire-5 from condition where car_number=?) where car_number =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setInt(2, num);
			pstmt.setInt(3, num);
			pstmt.setInt(4, num);
			pstmt.setInt(5, num);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	// 10. 차량 수정

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

	// 11.차량 삭제

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

	// 12. 렌트 현황

	public List<NewCar> getRentList() {
		List<NewCar> list = new ArrayList<>();

		NewCar nc = null;
		try {
			conn();
			String sql = "select * from rent";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {

				nc = new NewCar();
				nc.setRentId(rs.getInt("rent_id"));
				nc.setCarNumber(rs.getInt("car_number"));
				nc.setRentDate(rs.getString("rent_date"));
				nc.setRentDistance(rs.getInt("rent_distance"));
				nc.setRentReserved(rs.getString("rent_reserved"));
				nc.setMemberId(rs.getString("member_id"));
				list.add(nc);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 13. 보험 현황
	public List<NewCar> getInsuranceList() {
		List<NewCar> list = new ArrayList<>();

		NewCar nc = null;
		try {
			conn();
			String sql = "select * from insurance";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				nc = new NewCar();
				nc.setMemberId(rs.getString("member_id"));
				nc.setInInsurance(rs.getString("in_insurance"));
				nc.setInPrice(rs.getInt("in_price"));
				nc.setCarNumber(rs.getInt("car_number"));

				list.add(nc);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 14. 수익
	public int Income(int money) {
		int result = 0;
		try {
			conn();
			String sql = "insert into income values (sysdate,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, money);
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public int Income2() {
		int result = 0;
		try {
			conn();
			String sql = "select sum(income_income)\r\n" + "from income";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				result = rs.getInt("sum(income_income)");
			}
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

	// 1-1 내 렌트 조회
	public NewCar getMyRent(String newcarKey) {
		NewCar nc = null;

		try {
			conn();
			String sql = "select * from rent r join car c on(r.car_number = c.car_number) where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nc = new NewCar();
				nc.setCarNumber(rs.getInt("car_number"));
				nc.setRentDate(rs.getString("rent_date"));
				nc.setRentDistance(rs.getInt("rent_distance"));
				nc.setRentReserved(rs.getString("rent_reserved"));
				nc.setMemberId(rs.getString("member_id"));
				nc.setCarName(rs.getString("car_name"));
				nc.setCarKind(rs.getString("car_Kind"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return nc;
	}

	// 1-2 내 보험 조회
	public NewCar getMyInsurance(String newcarKey) {
		NewCar nc = null;

		try {
			conn();
			String sql = "select * from insurance where member_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nc = new NewCar();
				nc.setInInsurance(rs.getString("In_insurance"));
				nc.setMemberId(rs.getString("member_id"));
				nc.setInPrice(rs.getInt("In_price"));
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

	// 3. 회원 탈퇴

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

	// 4. 정보

	public List<NewCar> RentInfo() {
		List<NewCar> list = new ArrayList<>();

		NewCar nc = null;
		try {
			conn();
			String sql = "select c.car_number,c.car_name,c.car_kind,p.price_price,r.rent_reserved,i.in_price  from rent r join car c on(r.car_number = c.car_number) join price p on(c.car_number= p.car_number) join insurance i on(i.car_number= p.car_number)";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				nc = new NewCar();
				nc.setCarNumber(rs.getInt("car_number"));
				nc.setCarName(rs.getString("car_name"));
				nc.setCarKind(rs.getString("car_kind"));
				nc.setPricePrice(rs.getInt("price_price"));
				nc.setRentReserved(rs.getString("rent_reserved"));
				nc.setInPrice(rs.getInt("in_price"));
				list.add(nc);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;
	}

	// 5. 렌트
	public int Rent(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update rent set rent_id = ?,rent_reserved=?,member_id=?,rent_date=?,rent_distance=? where car_number= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, nc.getRentId());
			pstmt.setString(2, nc.getRentReserved());
			pstmt.setString(3, nc.getMemberId());
			pstmt.setString(4, nc.getRentDate());
			pstmt.setInt(5, nc.getRentDistance());
			pstmt.setInt(6, nc.getCarNumber());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 5-1 렌트 예약 변경
	public int RentReserved(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update rent set rent_reserved='y' where car_number =?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, nc.getCarNumber());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 6. 렌트 취소

	public int CancelRent(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update rent set rent_id = null,rent_reserved='n',member_id=null,rent_date=null,rent_distance=null where car_number= ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, nc.getCarNumber());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	public int CancelPrice(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update price set price_priceoil= null where car_number= ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, nc.getCarNumber());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 7. 렌트 반납

	public int RentReturn(NewCar nc) {
		int result = 0;
		try {
			conn();
			String sql = "Update rent set rent_id = null,rent_reserved='n',member_id=null,rent_date=null,rent_distance=null where car_number= ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, nc.getCarNumber());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 8. 가격
	public NewCar getPrice(String newcarKey) {
		NewCar nc = null;

		try {
			conn();
			String sql = "select * from price p join car c on(p.car_number = c.car_number) join rent r on(r.car_number = c.car_number) where r.member_id = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				nc = new NewCar();
				nc.setRentId(rs.getInt("rent_id"));
				nc.setCarNumber(rs.getInt("car_number"));
				nc.setCarName(rs.getString("car_name"));
				nc.setCarKind(rs.getString("car_Kind"));
				nc.setPricePrice(rs.getInt("price_price"));
				nc.setRentDistance(rs.getInt("rent_distance"));
				nc.setPriceOil(rs.getInt(("rent_distance")) * 100);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return nc;
	}

	// 8-1 보험 조회
	public NewCar getInsurance(int newcarKey) {
		NewCar ns = null;

		try {
			conn();
			String sql = "select nvl(member_id,0) nvl,In_price, IN_insurance,car_number from insurance where car_number = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, newcarKey);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				ns = new NewCar();
				ns.setInPrice(rs.getInt("In_price"));
				ns.setInInsurance(rs.getString("In_Insurance"));
				ns.setMemberId(rs.getString("nvl"));

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return ns;
	}

	// 9. 보험
	public int insertInsurance(NewCar ns) {
		int result = 0;
		try {
			conn();
			String sql = "Update insurance set in_insurance = ?, member_id = ? where car_number = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ns.getInInsurance());
			pstmt.setString(2, ns.getMemberId());
			pstmt.setInt(3, ns.getCarNumber());

			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 9-1 보험 취소

	public int CancelInsurance(NewCar ns) {
		int result = 0;
		try {
			conn();
			String sql = "Update Insurance set in_insurance = 'n', member_id=null  where car_number= ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, ns.getCarNumber());
			result = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

}