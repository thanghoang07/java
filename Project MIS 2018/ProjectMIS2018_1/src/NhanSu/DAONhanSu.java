package NhanSu;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DAO.ConnectionPool;
import DAO.DBUtil;
import ThoiGian.DateTime;

public class DAONhanSu {
	private static ConnectionPool pool;
	private static List<NhanSu> accList;

	private final static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver", password = "Aimondo08",
			user = "sa",
			url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYMOC;useUnicode=true;characterEncoding=UTF-8;";

	public static List<NhanSu> getListNhanSu() throws SQLException, ClassNotFoundException {
		pool = new ConnectionPool(url, user, password, driver, 10, 5);
		if (accList == null)
			accList = new ArrayList<NhanSu>();

		if (accList.size() == 0) {
			Connection conn = pool.getConnection();
			PreparedStatement ps = null;
			String sql = "select * from NHANSU inner join LOAINHANSU on LOAINHANSU.MA_LOAINS = NHANSU.MA_LOAINS;";
			try {
				conn.setAutoCommit(false);
				ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					@SuppressWarnings("deprecation")
					Date date = new Date(rs.getDate(7).getDay(), rs.getDate(7).getMonth(), rs.getDate(7).getYear());
					NhanSu ns = new NhanVienKho(rs.getString(1), rs.getString(2),
							new DateTime(rs.getDate(4).getDay(), rs.getDate(4).getMonth(), rs.getDate(4).getYear()),
							rs.getString(6), (rs.getInt(5) == 1 ? true : false),
							new DateTime(date.getDay(), date.getMonth(), date.getYear()),
							new LoaiNhanSu(rs.getString(8), rs.getString(9), rs.getFloat(10)));
					accList.add(ns);
				}
				ps.executeBatch();
				conn.commit();
				return accList;
			} catch (SQLException e) {
				System.out.println(e);
				conn.rollback();
			} finally {
				pool.returnConnection(conn);
			}
		}
		return accList;
	}

	public static boolean insertNhanSu(NhanSu acc) throws ClassNotFoundException, SQLException {
		pool = new ConnectionPool(url, user, password, driver, 10, 5);
		Connection conn = pool.getConnection();
		PreparedStatement statement = null;
		ResultSet rs = null;

		String sql = "INSERT INTO NHANSU (MA_NS, TEN_NS, MA_LOAINS, NGAY_SINH, GIOI_TINH, DIA_CHI, NGAY_VAO_LAM) VALUES (N'"
				+ acc.getMaNS() + "',N'" + acc.getTenNS() + "',N'" + acc.getLoai().getLoaiNS() 
				+ "','" + acc.epKieuNgaySinh() + "'," + (acc.getGioiTinh() == true ? 1 : 0) + ", N'" + acc.getDiaChi()
				+ "','" + acc.epKieuNgayVaoLam() + "');";
		try {
			statement = conn.prepareStatement(sql);
			rs = statement.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			System.out.println(e);
		} finally {
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(statement);
			pool.returnConnection(conn);
		}
		return false;
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// String maNS, String tenNS, DateTime ngaySinh, String diaChi, Boolean
		// gioiTinh, DateTime ngayVaoLam, LoaiNhanSu loai
		NhanSu acc = new QuanLy("QL02", "ABC", new DateTime(28, 12, 1989), "dahgj", true, new DateTime(16, 07, 2010),
				new LoaiNhanSu("QL", "Quan ly", 12387980));
		System.out.println(!insertNhanSu(acc));

	}

}
