package QuanLyNhanVien;

import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class Employee implements Comparable {

	protected String name;
	protected Date hiredDate;
	protected String ten;

	public Employee(String name, Date hiredDate, String ten) {
		super();
		this.name = name;
		this.hiredDate = hiredDate;
		this.ten = ten;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hiredDate=" + hiredDate + ", ten="
				+ ten + "]";
	}

	public boolean sameName(Employee that) {
		if (this.name == that.name)
			return true;
		else
			return false;
	}

	public int workYear(int toYear) {
		return toYear - hiredDate.getYear();

	}

	public abstract int monthlySalary();

	public static void inMang(Employee[] staff) {
		for (int i = 0; i < staff.length; i++) {
			System.out.println("" + staff[i]);
		}
	}

	public static void main(String[] args) {
		Employee[] staff = new Employee[10];
		staff[0] = new Consultant("Nguyen Hung", new Date(12, 02, 2002),
				"Long", 0156325, 50000000);
		staff[1] = new SalaryEmployee("Tran Long", new Date(14, 05, 2001),
				"Anh", 452006, 2000);
		staff[2] = new HourlyEmployee("Tran Long", new Date(14, 05, 2001),
				"Tu", 5000000, 45);
		staff[3] = new SalaryEmployee("Pham Huu", new Date(14, 05, 2001),
				"Bao", 452006, 2000);
		staff[4] = new SalaryEmployee("Xau ly", new Date(14, 05, 2001), "Han",
				452006, 2000);
		staff[5] = new SalaryEmployee("Xau ly", new Date(14, 05, 2001), "Cuc",
				452006, 2000);
		staff[6] = new SalaryEmployee("Phuong Hoang", new Date(14, 05, 2001),
				"Phuong", 452006, 2000);
		staff[7] = new SalaryEmployee("Ly Hung", new Date(14, 05, 2001), "Yen",
				452006, 2000);
		staff[8] = new SalaryEmployee("Quoc Long", new Date(14, 05, 2001),
				"Luan", 452006, 2000);
		staff[9] = new SalaryEmployee("Anh Long", new Date(14, 05, 2001),
				"Hong", 452006, 2000);

		Arrays.sort(staff);

		inMang(staff);
		
		

	}

	@Override
	public int compareTo(Object o) {
		Employee e1 = (Employee) o;
		int sortName = this.name.compareToIgnoreCase(e1.name);
		if (sortName != 0)
			return sortName;
		return this.ten.compareToIgnoreCase(e1.ten);
	}
}
