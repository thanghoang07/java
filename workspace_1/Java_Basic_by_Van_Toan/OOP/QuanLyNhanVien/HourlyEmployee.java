package QuanLyNhanVien;

public class HourlyEmployee extends Employee {
	private int hourlyRate;
	private int primaryHours;

	public HourlyEmployee(String name, Date hiredDate,String ten, int hourlyRate,
			int primaryHours) {
		super(name, hiredDate, ten);
		this.hourlyRate = hourlyRate;
		this.primaryHours = primaryHours;
	}

	@Override
	public int monthlySalary() {
		return hourlyRate * primaryHours;
	}

}
