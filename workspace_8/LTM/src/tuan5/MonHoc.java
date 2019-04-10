package tuan5;

import java.util.StringTokenizer;

/**
 * @author thang
 *
 */
public class MonHoc {
	private int maMH;
	private String tenMH;
	private double diem;

	public MonHoc() {
		
	}
	
	public MonHoc(int maMH, String tenMH, double diem) {
		this.maMH = maMH;
		this.tenMH = tenMH;
		this.diem = diem;
	}

	public int getMaMH() {
		return maMH;
	}

	public void setMaMH(int maMH) {
		this.maMH = maMH;
	}

	public String getTenMH() {
		return tenMH;
	}

	public void setTenMH(String tenMH) {
		this.tenMH = tenMH;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public String toString() {
		return "||" + maMH + "||" + tenMH + "||" + diem;
	}

	public MonHoc mhocToken(String mh) {
		StringTokenizer stz = new StringTokenizer(mh, "||");
		int maMH = Integer.parseInt(stz.nextToken());
		String tenMH = stz.nextToken();
		double diem = Double.parseDouble(stz.nextToken());
		//
		return new MonHoc(maMH, tenMH, diem);
	}
}