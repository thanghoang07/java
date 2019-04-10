package tinhCuocSuDungDien;

import java.util.ArrayList;
import java.util.List;

public class ResidentalCustomer extends Customer {
	private ArrayList<OneReading> readings = new ArrayList<OneReading>();

	public ResidentalCustomer(String id, String name) {
		super(id, name);
	}

	public List<OneReading> getReadings() {
		return readings;
	}

	public void addReading(OneReading reading) {
		getReadings().add(reading);
	}

	/*
	 * Tinh tien dien cho khach hang. Gia dien sinh hoat tinh theo bac thang:
	 * 100kW dau tien : gia 550 50kW tiep theo: 900 50kW tiep theo: 1210 100kW
	 * tiep theo: 1340 kW thu 301 tro len: 1400
	 */
	public double charge() {
		int oldIndex = getOldReading().getIndex();
		int newIndex = getNewReading().getIndex();
		int usage = newIndex - oldIndex;

		// So kW chiu don gia 550
		int u1 = (usage <= 100 ? usage : 100);

		// So kW chiu don gia 900
		int u2 = (usage <= 150 ? (usage - u1) : 50);

		// So kW chiu don gia 1210
		int u3 = (usage <= 200 ? (usage - u1 - u2) : 50);

		// So kW chiu don gia 1340
		int u4 = (usage <= 300 ? (usage - u1 - u2 - u3) : 100);

		// So kW chiu don gia 1400
		int u5 = (usage - u1 - u2 - u3 - u4);

		double result = u1 * 550 + u2 * 900 + u3 * 1210 + u4 * 1340 + u5 * 1400;

		// Thue Gia Tri Gia Tang
		result += result * TAX_RATE;
		return result;
	}

	public String statement() {
		Reading oldReading = getOldReading();
		Reading newReading = getNewReading();
		int usage = newReading.getIndex() - oldReading.getIndex();
		return "Ma Khach: " + getId() + "\nTen: " + getName() + "\nChi so cu: " + oldReading.getIndex()
				+ "\nChi so moi: " + newReading.getIndex() + "\ndien nang tieu thu: " + usage
				+ "\nthanh tien (10% VAT): " + charge() + " VND\n\n\n\n";
	}
}
