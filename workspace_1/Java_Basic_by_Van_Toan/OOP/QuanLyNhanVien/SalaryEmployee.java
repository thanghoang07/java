package QuanLyNhanVien;

public class SalaryEmployee extends Employee {
	private int annualSalary;
	private int stockOption;

	public SalaryEmployee(String name, Date hiredDate,String ten, int annualSalary,
			int stockOption) {
		super(name, hiredDate, ten);
		this.annualSalary = annualSalary;
		this.stockOption = stockOption;
	}

	@Override
	public int monthlySalary() {
		int phuCap = 0;
		if (2008 - hiredDate.getYear() > 5)
			phuCap = 500000;
		else
			phuCap = 0;
		return annualSalary / 12 + phuCap;
	}

}
