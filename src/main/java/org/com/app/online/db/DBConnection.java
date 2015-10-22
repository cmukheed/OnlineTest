package org.com.app.online.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.com.app.online.util.PropertyReader;

public final class DBConnection {

	private static Connection sqlConnection;

	private DBConnection() {
		try {
			Class.forName(new PropertyReader().getProperty("driver")).newInstance();
			sqlConnection = DriverManager.getConnection(
					new PropertyReader().getProperty("url") + new PropertyReader().getProperty("dbName"),
					new PropertyReader().getProperty("userName"), new PropertyReader().getProperty("password"));
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public synchronized static Connection getSqlConnection() {
		try {
			if (sqlConnection == null || sqlConnection.isClosed())
				new DBConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sqlConnection;
	}

	public static void closeConnection() {
		try {
			sqlConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
