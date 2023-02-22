package com.yedam.common;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DAO {

	protected Connection conn = null;

	protected PreparedStatement pstmt = null;

	protected Statement stmt = null;

	protected ResultSet rs = null;

//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	String id = "hr";
//	String pw = "hr";
//	

	Properties pro = new Properties();

	String driver = null;
	String url = null;
	String id = null;
	String pw = null;

	public void conn() {

		try {
			getProperties();
			
			Class.forName(driver);

			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

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

	private void getProperties() {
		try {
			FileReader resource = new FileReader("src/config/db.properties");
			pro.load(resource);
			driver = pro.getProperty("driver");
			url = pro.getProperty("url");
			id = pro.getProperty("id");
			pw = pro.getProperty("pw");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
