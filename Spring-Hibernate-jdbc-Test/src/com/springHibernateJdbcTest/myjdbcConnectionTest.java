package com.springHibernateJdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class myjdbcConnectionTest {

	//simple jdbc test
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/mysql?useSSL=false&serverTimezone=UTC";
		String userName="hbstudent";
		String password="hbstudent";
		
		try {
			Connection conn =DriverManager.getConnection(url , userName, password);
			System.out.println(conn.getMetaData());
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
