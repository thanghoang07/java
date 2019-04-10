package tinhCuocSuDungDien;

import java.util.Date;

public abstract class Reading {
	// Ngay ghi chi so dien ke
	private Date date;
	// chi so tren dien ke
	private int index;

	public Reading(Date date, int index) {
		this.date = date;
		this.index = index;
	}

	public Date getDate() {
		return date;
	}

	public int getIndex() {
		return index;
	}
}
