package tinhCuocSuDungDien;

import java.util.ArrayList;
import java.util.List;

public class BusinessCustomer extends Customer {
	private String accountNumber;
	private ArrayList<ThreeReading> readings = new ArrayList<ThreeReading>();

	public BusinessCustomer(String id, String name, String accountNumber) {
		super(id, name);
		this.accountNumber = accountNumber;
	}

	public List<ThreeReading> getReadings() {
		return readings;
	}

	public void addReading(ThreeReading reading) {
		getReadings().add(reading);
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	/*
	 * Gia tien dien cho khach hang san xuat: Gio binh thuong (tu 4h - 18h): gia
	 * 895 Gio cao diem (tu 18h - 22h): gia 1480 Gio thap diem (tu 22h - 4h hom
	 * sau) : gia 505
	 */
	public double charge() {
		ThreeReading oldReading = (ThreeReading) getOldReading();
		ThreeReading newReading = (ThreeReading) getNewReading();
		double result = getNormalUsage(oldReading, newReading) * 895 + getLowUsage(oldReading, newReading) * 505
				+ getHighUsage(oldReading, newReading) * 1480;
		// Thue Gia Tri Gia Tang
		result += result * TAX_RATE;
		return result;
	}

	private int getNormalUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getIndex() - oldReading.getIndex() - getLowUsage(oldReading, newReading)
				- getHighUsage(oldReading, newReading);
	}

	private int getHighUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getHighIndex() - oldReading.getHighIndex();
	}

	private int getLowUsage(ThreeReading oldReading, ThreeReading newReading) {
		return newReading.getLowIndex() - oldReading.getLowIndex();
	}

	public String statement() {
		ThreeReading oldReading = (ThreeReading) getOldReading();
		ThreeReading newReading = (ThreeReading) getNewReading();
		int usage = newReading.getIndex() - oldReading.getIndex();
		return "Ma Nha SX: " + getId() + "\nTen Nha SX: " + getName() + "\nSo tai khoan: " + getAccountNumber()
				+ "\nChi So Cu: " + oldReading.getIndex() + "\nChi so moi: " + newReading.getIndex()
				+ "\nDien nang tieu thu: " + usage + "\nGio binh thuong: " + getNormalUsage(oldReading, newReading)
				+ "\nGio cao diem: " + getHighUsage(oldReading, newReading) + "\nGio thap diem: "
				+ getLowUsage(oldReading, newReading) + "\nthanh tien(10%VAT): " + charge() + " VND\n\n\n\n";
	}
}
