/*
 * package OOP;
 * 
 * import java.util.Arrays;
 * 
 * public abstract class NhanVien { protected String ten; protected Date
 * ngayVaoLam; static NhanVien[] danhSachNhanVien = new NhanVienChinhThuc[10];
 * 
 * public NhanVien(String ten, Date ngayVaoLam) { this.ten = ten;
 * this.ngayVaoLam = ngayVaoLam; }
 * 
 * public String getTen() { return ten; }
 * 
 * public Date getNgayVaoLam() { return ngayVaoLam; }
 * 
 * public boolean sameName(String that) { return this.ten == that; }
 * 
 * public int workYears(int toYear) { return toYear - ngayVaoLam.getNam(); }
 * 
 * public abstract int monthlySalary();
 * 
 * public static NhanVien[] danhSachNhanViens() { for (int i = 0; i <
 * danhSachNhanVien.length; i++) { danhSachNhanVien[i] = new NhanVienChinhThuc(
 * "Nguoi thu " + i, new Date(i + 1, i + 1, i + 2000), 5000000 + i, 30 + i); }
 * return danhSachNhanVien; }
 * 
 * @Override public String toString() { return "NhanVien [ten=" + ten +
 * ", ngayVaoLam=" + ngayVaoLam + ", danhSachNhanVien=" +
 * Arrays.toString(danhSachNhanVien) + "]"; }
 * 
 * public static void main(String[] args) { danhSachNhanViens(); for (int i = 0;
 * i < danhSachNhanVien.length; i++) {
 * System.out.println(danhSachNhanVien[i].toString()); } }
 * 
 * public boolean timNamLonHon() { return this.ngayVaoLam.getNam() > 2004; }
 * 
 * public void sapXep() {
 * 
 * }
 * 
 * }
 */