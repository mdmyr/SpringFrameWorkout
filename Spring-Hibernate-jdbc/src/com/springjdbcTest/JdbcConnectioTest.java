package com.springjdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectioTest {
	//create a connection to database
	
	public static void main(String[] args) {
		String url;
		String userName;
		String password;
		
		url="jdbc:mysql://localhost:3306/mysql?useSSL=false&serverTimezone=UTC";
		userName="hbstudent";
		password="hbstudent";
		
		try {
			Connection conn = DriverManager.getConnection(url,userName,password);
			conn.getClass();
			//conn.close();			
			System.out.println(conn);
			System.out.println(conn.getSchema());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
