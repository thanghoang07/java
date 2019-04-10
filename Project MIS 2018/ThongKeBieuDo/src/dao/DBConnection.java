package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static ConnectionPool pool;

	private final static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver", password = "Aimondo08",
			user = "sa",
			url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYMOC;useUnicode=true;characterEncoding=UTF-8;";

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		// Connect to database
		String hostName = "azurenl.database.windows.net";
		String dbName = "quanlymoc";
		String user = "binh1";
		String password = "Binh_12345678910";
		String url = String.format(
				"jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;encrypt=true;hostNameInCertificate=*.database.windows.net;loginTimeout=30;",
				hostName, dbName, user, password);

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			throw new ClassNotFoundException("SQL Server JDBC driver NOT detected in library path.", e);
		}

		System.out.println("SQL JDBC driver detected in library path.");

		Connection connection = null;

		try {

			// get connection
			connection = DriverManager.getConnection(url);

		} catch (SQLException e) {
			throw new SQLException("Failed to create connection to database.", e);
		}

		return connection;

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println(getConnection());
	}

}
