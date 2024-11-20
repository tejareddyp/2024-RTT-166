package org.example;

import java.sql.*;

public class JDBCExample {

    public static void main (String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "sunny";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // regular statement is going to run SQL when there are no substitutions
            Connection connection = DriverManager.getConnection(dburl, user, password);
            String SelectSQL = "Select * FROM employees";
            Statement stmt = connection.createStatement();


            ResultSet result =
                    stmt.executeQuery(SelectSQL);
            while (result.next()) {
                String EmployeeID = result.getString("id");
                String fname = result.getString("firstname");
                String lname = result.getString("lastname");
                System.out.println(EmployeeID + " | " + fname + "|" + lname);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}