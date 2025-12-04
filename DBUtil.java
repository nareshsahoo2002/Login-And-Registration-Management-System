package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    // These will read values from environment variables
    private static final String URL = System.getenv("DB_URL");
    private static final String USERNAME = System.getenv("DB_USER");
    private static final String PASSWORD = System.getenv("DB_PASS");

    static {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        System.out.println("Connection build ho raha hey");

        // If any env variable is missing, show clear error
        if (URL == null || USERNAME == null || PASSWORD == null) {
            throw new SQLException("Database environment variables DB_URL, DB_USER, DB_PASS are not set!");
        }

        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
