package tuan8;

public class Student {
	private String mssv, name, sdt;
	private double diem;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String mssv, String name, String sdt, double diem) {
		super();
		this.mssv = mssv;
		this.name = name;
		this.sdt = sdt;
		this.diem = diem;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", name=" + name + ", sdt=" + sdt + ", diem=" + diem + "]";
	}

}
