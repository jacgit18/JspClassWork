package dbconnect;

import java.io.IOException;
import java.sql.*;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBUtil extends HttpServlet {

	private static PreparedStatement preparedStatement;

//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Load the JDBC driver
		// Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Driver loaded");

		// Connect to a database
		Connection connection = DriverManager.getConnection(
				"jdbc:sqlserver://s16988308.onlinehome-server.com:1433;databaseName=CUNY_DB;integratedSecurity=false;",
				"cst4713", "password1");
		System.out.println("Database connected");

		// Create a statement
		// Statement statement = connection.createStatement();

		String queryString = "select firstName, mi, " + "lastName, title, grade from Students, Enrollment, Course "
				+ "where Students.ssn = ? and Enrollment.courseId = ? " + "and Enrollment.courseId = Course.courseId";

		// Create a statement
		preparedStatement = connection.prepareStatement(queryString);

		/*
		 * // Execute a statement ResultSet resultSet = statement.executeQuery (
		 * "select firstName, mi, lastName from Students where lastName " +
		 * " = 'Jeon'"); System.out.println(
		 * "select firstName, mi, lastName from Students where lastName " +
		 * " = 'Jeon'"); // Iterate through the result and print the student
		 * names while (resultSet.next())
		 * System.out.println(resultSet.getString(1) + "\t" +
		 * resultSet.getString(2) + "\t" + resultSet.getString(3));
		 * 
		 * // Close the connection resultSet.close();
		 */

//		String driver = request.getParameter("driver");

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter SSN: ");
		String ssn = keyboard.nextLine();
		// System.out.println("Enter Course ID: ");
		// String courseId = keyboard.nextLine();

		try {
			preparedStatement.setString(1, ssn);
			// preparedStatement.setString(2, courseId);
			ResultSet rset = preparedStatement.executeQuery();

			if (rset.next()) {
				String firstName = rset.getString(1);

				String mi = rset.getString(2);
				String lastName = rset.getString(3);

				String title = rset.getString(4);
				String grade = rset.getString(5);

				System.out.println(firstName + "Middle name is " + mi + "and last name is " + lastName
						+ " his grade for the course " + title + " is an " + grade);
			} else {
				System.out.println("Not found");
			}
			rset.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		connection.close();
		System.out.println("Database closed");
		// keyboard.close();
	}
}