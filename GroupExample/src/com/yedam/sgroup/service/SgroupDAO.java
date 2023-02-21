package com.yedam.sgroup.service;

import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class SgroupDAO extends DAO {

	// 싱글톤
	private static SgroupDAO sGr = null;

	private SgroupDAO() {

	}

	public static SgroupDAO getInstance() {
		if(sGr == null) {
			sGr = new SgroupDAO();
		}
		
		return sGr;
	}

	// 0. 로그인 기능
	public Sgroup login(String id) {
		Sgroup sgr = null;
		try {
			conn();
			String sql = "Select * From sgroup where sgroup_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				sgr = new Sgroup();
				sgr.setSgroupId(rs.getString("sgroup_id"));
				sgr.setSgroupName(rs.getString("sgroup_name"));
				sgr.setSgroupHiredate(rs.getString("sgroup_hiredate"));
				sgr.setSgroupEmail(rs.getString("sgroup_email"));
				sgr.setSgroupAge(rs.getInt("sgroup_age"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return sgr;
	}

	// 1.새 회원 등록
	public int insertSgroup(Sgroup sqr) {
		int result = 0;
		try {
			conn();
			String sql = "insert into sgroup values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sqr.getSgroupId());
			pstmt.setString(2, sqr.getSgroupName());
			pstmt.setString(1, sqr.getSgroupHiredate());
			pstmt.setString(1, sqr.getSgroupEmail());
			pstmt.setInt(1, sqr.getSgroupAge());

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}

	// 2. 모든 회원 조회 -> 가입날짜순
	public List<Sgroup> getSgroupList() {
		List<Sgroup> list = new ArrayList<>();

		Sgroup sgr = null;
		try {
			conn();
			String sql = "select * from sgroup order by hiredate";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				sgr = new Sgroup();
				sgr.setSgroupId(rs.getString("sgroup_id"));
				sgr.setSgroupName(rs.getString("sgroup_name"));
				sgr.setSgroupHiredate(rs.getString("sgroup_hiredate"));
				sgr.setSgroupEmail(rs.getString("sgroup_Email"));
				sgr.setSgroupAge(rs.getInt("sgroup_age"));

				list.add(sgr);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return list;

	}

	//3.아이디로 회원 조회
	public Sgroup getSgroup(String sgroupKey) {
		Sgroup sgr = null;
		
		try {
			conn();
			String sql = "select * from sgroup where sgroup_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sgroupKey);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				sgr = new Sgroup();
				sgr.setSgroupId(rs.getString("sgroup_id"));
				sgr.setSgroupName(rs.getString("sgroup_name"));
				sgr.setSgroupHiredate(rs.getString("sgroup_hiredate"));
				sgr.setSgroupEmail(rs.getString("sgroup_email"));
				sgr.setSgroupAge(rs.getInt("sgroup_age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
			
		}
		return sgr;
	}
	
	//4. 이메일 변경
	public int modifySgroup(Sgroup sgr) {
		int result = 0;
		try {
			conn();
			String sql = "update set email = ? where sgroup_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, sgr.getSgroupEmail());
			pstmt.setString(1, sgr.getSgroupId());
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
	
	//5. 소모임 인원 강제 탈퇴
	
	public int deleteSgroup(Sgroup s) {
		int result = 0;
		try {
			conn();
			String sql ="DELETE FROM Sgroup WHERE sgroup_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getSgroupId());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconn();
		}
		return result;
	}
}

