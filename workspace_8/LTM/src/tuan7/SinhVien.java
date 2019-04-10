package tuan7;

public class SinhVien {
private String ten,mssv;
private int age;
private double diem;
public SinhVien(String ten, String mssv, int age, double diem) {
	super();
	this.ten = ten;
	this.mssv = mssv;
	this.age = age;
	this.diem = diem;
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public String getMssv() {
	return mssv;
}
public void setMssv(String mssv) {
	this.mssv = mssv;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getDiem() {
	return diem;
}
public void setDiem(double diem) {
	this.diem = diem;
}

}
