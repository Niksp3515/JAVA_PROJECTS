package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserUtil {

	public static Connection create_conn() {
		Connection conn =null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_mwf?characterEncoding=latin1","root","Niksp@3515");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Connection successfull");
		return conn;
		
	}
}
