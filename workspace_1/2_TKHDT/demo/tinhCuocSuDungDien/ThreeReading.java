package tinhCuocSuDungDien;

import java.util.Date;

public class ThreeReading extends Reading {
	// chi so gio thap diem
	private int lowIndex;
	// chi so gio cao diem
	private int highIndex;

	public ThreeReading(Date date, int index, int lowIndex, int highIndex) {
		super(date, index);
		this.lowIndex = lowIndex;
		this.highIndex = highIndex;
	}

	public int getHighIndex() {
		return highIndex;
	}

	public int getLowIndex() {
		return lowIndex;
	}
}
