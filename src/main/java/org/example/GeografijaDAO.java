package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GeografijaDAO {
    private static GeografijaDAO instance = null;
    //private PreparedStatement
    private Connection conn;
    private GeografijaDAO() throws SQLException {
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:baza.db");

        } catch(SQLException e) {

        }
        
    }
}
