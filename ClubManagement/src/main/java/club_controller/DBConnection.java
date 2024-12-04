/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package club_controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
        private static Connection conn = null;
    
    public static Connection get_connection () throws ClassNotFoundException {
        if(conn == null) {
                  try {
	     Class.forName("com.mysql.cj.jdbc.Driver");
	     conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/clubdb?useSSL=false","root",null);
                  }
	catch(SQLException e) {
	     System.err.println(e.toString());
	}
        }
        return conn;
    }
}
