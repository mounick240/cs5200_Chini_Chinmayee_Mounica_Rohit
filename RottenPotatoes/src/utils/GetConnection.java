package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public final class GetConnection {
	
	public static Connection getConnection() throws Exception {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms_project",
		"root", "rohit");
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		return connection;
	}

}
