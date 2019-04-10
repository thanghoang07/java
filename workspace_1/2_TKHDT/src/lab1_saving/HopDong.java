package lab1_saving;

import java.util.Calendar;

/**
 * @author thang
 *
 */
public class HopDong extends LoaiNV {
	/*
	 * khoi tao bien date chua thoi gian ma nguoi lao dong lam viec toi ( luc
	 * ket thuc hoac dang con lam)
	 */
	protected Date ngayLamViec;

	@Override
	protected float tinhThuong(NhanVien nhan) {
		float temp = 0;
		float tempThang = 0;
		tempThang = (getNgayLamViec().getNam() - nhan.getNgayVaoLam().getNam()) * 12;
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
		if (nhan.getNgayVaoLam().getThang() <= getNgayLamViec().getThang()) {
			tempThang = (getNgayLamViec().getThang() - nhan.getNgayVaoLam().getThang());
			luong = (float) (tempThang * nhan.getLuongCoBan());
		} else {
			tempThang = (getNgayLamViec().getNam() - nhan.getNgayVaoLam().getNam()) * 12;
			luong = (float) (tempThang * nhan.getLuongCoBan());
		}
		return luong;
	}

	public HopDong(Date ngayLamViec) {
		this.ngayLamViec = ngayLamViec;
	}

	/**
	 * @return the ngayLamViec
	 */
	public Date getNgayLamViec() {
		return ngayLamViec;
	}

	/**
	 * @param ngayLamViec
	 *            the ngayLamViec to set
	 */
	public void setNgayLamViec(Date ngayLamViec) {
		this.ngayLamViec = ngayLamViec;
	}

}
