
	package com.company.util;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DBUtil {
		 private static final String URL = "jdbc:mysql://localhost:3306/codingwallah";
		 private static final String USERNAME = "root";
		 private static final String PASSWORD = "Muna@1234";
	    static {
	        try {
	            // Load the MySQL JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }

	    public static Connection getConnection() throws SQLException {
	    	System.out.println("connecrion build ho raha hey");
	        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    }
	       
	}


