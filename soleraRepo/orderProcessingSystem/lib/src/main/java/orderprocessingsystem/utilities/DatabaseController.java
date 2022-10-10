package orderprocessingsystem.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseController {
	private static final String URL = "jdbc:postgresql://localhost:5432/ordersystem";
	
	public static Connection getDBConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL,"postgres","1478");
		}
		catch(SQLException e) {
			e.getMessage();
		}
		return conn;
	}
}
