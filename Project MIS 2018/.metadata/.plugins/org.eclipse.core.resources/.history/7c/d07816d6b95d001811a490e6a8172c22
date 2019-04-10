package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThongKeSoLuongDonHang {
	private static ConnectionPool pool;
	
	private final static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver", password = "Aimondo08",
			user = "sa",
			url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLYMOC;useUnicode=true;characterEncoding=UTF-8;";

	public ThongKeSoLuongDonHang() {}
	
	public ArrayList<String> layMAKH() throws ClassNotFoundException, SQLException {
		pool = new ConnectionPool(url, user, password, driver, 10, 5);
		Connection con = pool.getConnection();
		
		String sql = "SELECT DONHANG.MA_KH FROM DONHANG INNER JOIN KHACHHANG ON KHACHHANG.MA_KH = DONHANG.MA_KH GROUP BY DONHANG.MA_KH;";
		
		ArrayList<String> listMAKH = new ArrayList<String>();
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			String makh = rs.getString("MA_KH");
			listMAKH.add(makh);
		}
		
		con.close();
		
		return listMAKH;
		
	}
	
	public int thongKeDonHangTheoDanhSachMKH(String makh) throws ClassNotFoundException, SQLException {
		
		pool = new ConnectionPool(url, user, password, driver, 10, 5);
		Connection conn = pool.getConnection();
		
		String sql = "SELECT COUNT(DONHANG.MA_DH) AS SOLUONGDONHANGTHEOMAKH FROM DONHANG INNER JOIN KHACHHANG ON KHACHHANG.MA_KH = DONHANG.MA_KH WHERE DONHANG.MA_KH = '"+ makh +"';";
		
		PreparedStatement ps = conn.prepareStatement(sql);
		
		int countDH = 0;
		
		ResultSet rs = ps.executeQuery();
		
		while (rs.next()) {
			
			countDH = rs.getInt("SOLUONGDONHANGTHEOMAKH");	
		}
		
		conn.close();	
		
		return countDH;
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ThongKeSoLuongDonHang tk = new ThongKeSoLuongDonHang();
		
		List<String> listMAKH = new ArrayList<String>();
		
		listMAKH = tk.layMAKH();
		
		for (String makh : listMAKH) {
			System.out.print(makh + "\n");
		}
		
		for (String makh1 : listMAKH) {
			int count = tk.thongKeDonHangTheoDanhSachMKH(makh1);
			System.out.println(count);
		}
		
	}

}
