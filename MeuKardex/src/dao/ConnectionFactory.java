package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
	
	private static final String SQLITE = "jdbc:sqlite:C:/Users/brunp/git/javaprograma/MeuKardex/db/Kardex.db";
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(SQLITE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	public static void closeConnection(Connection con) {
		try {
			if (con != null) con.close();
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	}
	public static void closeConnection(Connection con,PreparedStatement pst, ResultSet rs) {
		try {
			if (rs != null) rs.close();
			if (pst != null) pst.close();
			if (con != null) con.close();
		
	} catch (SQLException e) {
		System.out.println(e.getMessage());
	}
	}
}
