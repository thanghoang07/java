package people;

import modul.Date;

public abstract class Person implements View {
	public String name, email, pass, sdt, diaChi, thanhPho;
	public Date ngayThanhNamSinh;

	public Person(String name, String email, String pass, String sdt, String diaChi, String thanhPho,
			Date ngayThanhNamSinh) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.thanhPho = thanhPho;
		this.ngayThanhNamSinh = ngayThanhNamSinh;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", pass=" + pass + ", sdt=" + sdt + ", diaChi=" + diaChi
				+ ", thanhPho=" + thanhPho + ", ngayThanhNamSinh=" + ngayThanhNamSinh + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getThanhPho() {
		return thanhPho;
	}

	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}

	public Date getNgayThanhNamSinh() {
		return ngayThanhNamSinh;
	}

	public void setNgayThanhNamSinh(Date ngayThanhNamSinh) {
		this.ngayThanhNamSinh = ngayThanhNamSinh;
	}

}
