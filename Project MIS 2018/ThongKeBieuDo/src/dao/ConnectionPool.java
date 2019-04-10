package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Hashtable;

public class ConnectionPool {
	private static Hashtable<Connection, Boolean> connections;
	private static int increment;
	private static String dbURL, user, password;

	public ConnectionPool(String dbURL, String user, String password,
			String driverClassName, int initialConnections, int increment)
			throws SQLException, ClassNotFoundException {

		Class.forName(driverClassName);

		this.dbURL = dbURL;
		this.user = user;
		this.password = password;
		this.increment = increment;

		connections = new Hashtable<Connection, Boolean>();

		// Put our pool of Connections in the Hashtable
		// The FALSE value indicates they're unused
		for (int i = 0; i < initialConnections; i++) {
			connections.put(DriverManager.getConnection(dbURL, user, password),
					Boolean.FALSE);
		}
	}

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		Enumeration<Connection> cons = connections.keys();
		synchronized (connections) {
			while (cons.hasMoreElements()) {
				con = (Connection) cons.nextElement();
				Boolean b = (Boolean) connections.get(con);
				if (b == Boolean.FALSE) {
					try {
						con.setAutoCommit(true);
					} catch (SQLException e) {
						con = DriverManager
								.getConnection(dbURL, user, password);
					}
					connections.put(con, Boolean.TRUE);
					return con;
				}
			}
		}
		for (int i = 0; i < increment; i++) {
			connections.put(DriverManager.getConnection(dbURL, user, password),
					Boolean.FALSE);
		}
		// de quy de tao connection moi
		return getConnection();
	}

	// tra ket noi
	public void returnConnection(Connection returned) {
		Connection con;
		Enumeration<Connection> cons = connections.keys();
		while (cons.hasMoreElements()) {
			con = cons.nextElement();
			if (con == returned) {
				connections.put(con, Boolean.FALSE);
				break;
			}
		}
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ConnectionPool pool = new ConnectionPool(
				"jdbc:sqlserver://localhost:1433;databaseName=QUANLYMOC;useUnicode=true;characterEncoding=UTF-8;",
				"sa", "Aimondo08",
				"com.microsoft.sqlserver.jdbc.SQLServerDriver", 10, 5);
		Connection con = pool.getConnection();
		if (con != null)
			System.out.println("connect success");
		else
			System.out.println("not connect");
	}
}
