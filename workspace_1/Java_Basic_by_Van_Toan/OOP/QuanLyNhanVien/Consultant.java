package QuanLyNhanVien;

public class Consultant extends Employee {
	private int contractNumber;
	private int billingRate;

	public Consultant(String name, Date hiredDate,String ten, int contractNumber,
			int billingRate) {
		super(name, hiredDate, ten);
		this.contractNumber = contractNumber;
		this.billingRate = billingRate;
	}

	@Override
	public int monthlySalary() {
		return billingRate;
	}

}
