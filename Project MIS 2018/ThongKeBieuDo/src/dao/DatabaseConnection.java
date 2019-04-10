package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {
	public static Connection getConnection() {
		Connection connection = null;
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYMOC;useUnicode=true;characterEncoding=UTF-8;";
		String user = "sa";
		String pass = "Aimondo08";

		try {
			Properties p = new Properties();
			p.setProperty("connectionCollation", "utf8_unicode_ci");
			Class.forName(driver);
			connection = (Connection) DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		return connection;
	}

	public static void main(String[] args) {
		Connection con = DatabaseConnection.getConnection();
		if (con != null)
			System.out.println("Connect successful databse sql server");
		else
			System.out.println("Connect not success");
	}
}
