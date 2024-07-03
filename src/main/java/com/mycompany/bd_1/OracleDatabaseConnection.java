package com.mycompany.bd_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDatabaseConnection {
    private static final String URL = "jdbc:oracle:thin:@bd.ipg.pt:1521:test";
    private static final String USER = "bd_tc_1709711";
    private static final String PASSWORD = "bd";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error establishing connection: " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }

    public static ResultSet executeQuery(Connection connection, String query) {
        ResultSet resultSet = null;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error executing query: " + e.getMessage());
        }
        return resultSet;
    }

    public static int executeUpdate(Connection connection, String query) {
        int rowsAffected = 0;
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            rowsAffected = statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error executing update: " + e.getMessage());
        }
        return rowsAffected;
    }

    // You can add more methods for other types of queries (e.g., insert, delete)

    public static void main(String[] args) {
        Connection connection = getConnection();
        if (connection != null) {
            // Example: Execute a SELECT query
            String selectQuery = "SELECT * FROM BD_TC_1709711.DESTINO";
            ResultSet resultSet = executeQuery(connection, selectQuery);
            System.out.println();
            try {
                while (resultSet.next()) {
                    // Process each row of the result set
                    // Example: Retrieve values from resultSet
                    int id = resultSet.getInt("N_DESTINO");
                    String institution = resultSet.getString("INSTITUIÇÃO");
                    System.out.println("Id: "+ id);
                    System.out.println("institution: "+ institution);
                    // Handle retrieved data as needed
                }
            } catch (SQLException e) {
                System.out.println("Error processing result set: " + e.getMessage());
            }

            closeConnection(connection);
        }
    }
}