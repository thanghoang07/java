package quanLyNhanVien;

import java.util.Calendar;

public class CoHuu extends LoaiNV {
	private float hsLuong;
	private float tienBH;

	public CoHuu(float hsLuong, float tiemBH) {
		super();
		this.hsLuong = hsLuong;
		this.tienBH = tiemBH;
	}

	// tinh lương từ khi vào làm tới giờ :v
	@Override
	public float tinhluong(NhanVien nv) {
		float tempThang = 0;
		tempThang = (Calendar.getInstance().get(Calendar.YEAR) - nv.getNgayVaoLam().getNam()) * 12;
		return tempThang * ((nv.getLuongCoBan() * hsLuong) - tienBH);
	}

	@Override
	public float tinhThuong(NhanVien nv) {
		float tempThang = 0;
		tempThang = (Calendar.getInstance().get(Calendar.YEAR) - nv.getNgayVaoLam().getNam()) * 12;
		if (tempThang >= 12) {
			return (tempThang / 12) * nv.getLuongCoBan() * hsLuong;
		} else
			return 0;
	}

	/**
	 * @return the hsLuong
	 */
	public float getHsLuong() {
		return hsLuong;
	}

	/**
	 * @param hsLuong
	 *            the hsLuong to set
	 */
	public void setHsLuong(float hsLuong) {
		this.hsLuong = hsLuong;
	}

	/**
	 * @return the tienBH
	 */
	public float getTienBH() {
		return tienBH;
	}

	/**
	 * @param tienBH
	 *            the tienBH to set
	 */
	public void setTienBH(float tienBH) {
		this.tienBH = tienBH;
	}

	@Override
	public String toString() {
		return "\nHe So Luong: " + getHsLuong() + "\nTien Bao Hiem: " + getTienBH();
	}

}
