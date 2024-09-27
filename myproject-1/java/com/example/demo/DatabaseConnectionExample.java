package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class DatabaseConnectionExample {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/city"; // Replace with your database URL
        String username = "root"; // Replace with your database username
        String password = "sravya@0926"; // Replace with your database password

        try {
            // Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            // Create a statement
            Statement statement = connection.createStatement();

            // Execute a simple query
            String query = "SELECT * FROM user  "; // Replace with your table name
            ResultSet resultSet = statement.executeQuery(query);

            // Process the query result
            while (resultSet.next()) {
                // Access data using resultSet.getXXX(columnName)
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String passString = resultSet.getString("password");
                
                // Process the data as needed
                System.out.println("ID: " + id + ", Name: " + name + ", email: " + email + ", password: " + passString);
            }

            // Close the result, statement, and the database connection when done
            resultSet.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
