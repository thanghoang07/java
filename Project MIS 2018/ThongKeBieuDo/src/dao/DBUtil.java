package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	public static void closeStatement(Statement s) {
		try {
			if (s != null)
				s.close();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void closePreparedStatement(PreparedStatement ps) {
		try {
			if (ps != null)
				ps.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
