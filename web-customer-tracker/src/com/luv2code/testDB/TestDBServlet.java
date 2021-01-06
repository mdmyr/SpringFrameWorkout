package com.luv2code.testDB;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public TestDBServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// connection variables

		String username = "springstudent";
		String password = "springstudent";
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";

		String driver = "com.mysql.cj.jdbc.Driver";
		// get connection to the database

		try {
			PrintWriter out = response.getWriter();

			Class.forName(driver);

			Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

			out.println("SuccessFull!");

			conn.close();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
