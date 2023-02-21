package com.yedam.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DAO {

protected Connection conn = null;

	
	protected PreparedStatement pstmt = null;

	
	protected Statement stmt = null;

	
	protected ResultSet rs = null;

	// hr 계정 접속

	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "hr";
	String pw = "hr";

	// DB 연결 메소드
	public void conn() {
		// 1. 드라이버 로딩
		try {
			Class.forName(driver);
			// 2. DB 연결
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	// DB 연결 해제
	public void disconn() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (stmt != null) {
				stmt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
