package lab1_saving;

import java.util.Calendar;

/**
 * @author thang
 *
 */
public class CoHuu extends LoaiNV {
	protected float hsLuong;
	protected float tienBaoHiem;

	public CoHuu(float hsLuong, float tienBaoHiem) {
		this.hsLuong = hsLuong;
		this.tienBaoHiem = tienBaoHiem;
	}

	public CoHuu() {

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
	 * @return the tienBaoHiem
	 */
	public float getTienBaoHiem() {
		return tienBaoHiem;
	}

	/**
	 * @param tienBaoHiem
	 *            the tienBaoHiem to set
	 */
	public void setTienBaoHiem(float tienBaoHiem) {
		this.tienBaoHiem = tienBaoHiem;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nHe So Luong: " + getHsLuong() + "\nTien Bao Hiem: " + getTienBaoHiem();
	}

	@Override
	protected float tinhThuong(NhanVien nhan) {
		float temp = 0;
		float tempThang = 0;
		tempThang = (Calendar.getInstance().get(Calendar.YEAR) - nhan.getNgayVaoLam().getNam()) * 12;
		if (tempThang >= 12) {
			temp = (float) (temp + nhan.getLuongCoBan());
		} else {
			return temp;
		}
		return temp;
	}

	@Override
	protected float tinhluong(NhanVien nhan) {
		float luong = 0;
		float tempThang = 0;
		tempThang = (Calendar.getInstance().get(Calendar.YEAR) - nhan.getNgayVaoLam().getNam()) * 12;
		luong = (float) (tempThang * (nhan.getLuongCoBan() * getHsLuong() - getTienBaoHiem()));
		return luong;
	}
}
