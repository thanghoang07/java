package quanLyNhanVien;

import java.util.Calendar;

public class HopDong extends LoaiNV {
	private static final Date DATE = null;
	protected Date ngayDungLamViec;

	public HopDong(Date ngayDungLamViec) {
		super();
		this.ngayDungLamViec = ngayDungLamViec;
	}

	public HopDong() {
		super();
	}

	public Date getNgayDungLamViec() {
		return ngayDungLamViec;
	}

	public void setNgayDungLamViec(Date ngayDungLamViec) {
		this.ngayDungLamViec = ngayDungLamViec;
	}

	@Override
	public float tinhThuong(NhanVien nv) {
		float tempThang = 0;
		if (getNgayDungLamViec() != DATE)
			tempThang = ((getNgayDungLamViec().getNam() - nv.getNgayVaoLam().getNam()) * 12);
		else
			tempThang = (((Calendar.getInstance().get(Calendar.YEAR) - nv.getNgayVaoLam().getNam()) * 12));
		if (tempThang >= 12)
			return tinhluong(nv);
		else
			return 0;
	}

	@Override
	public float tinhluong(NhanVien nv) {
		float luong = 0;
		float tempThang = 0;
		if (getNgayDungLamViec() != DATE) {
			if (nv.getNgayVaoLam().getThang() <= getNgayDungLamViec().getThang()) {
				tempThang = (getNgayDungLamViec().getThang() - nv.getNgayVaoLam().getThang());
				luong = (tempThang * nv.getLuongCoBan());
			} else {
				tempThang = (getNgayDungLamViec().getNam() - nv.getNgayVaoLam().getNam()) * 12;
				luong = (tempThang * nv.getLuongCoBan());
			}
		} else {
			tempThang = (((Calendar.getInstance().get(Calendar.YEAR) - nv.getNgayVaoLam().getNam()) * 12));
			luong = (float) (tempThang * nv.getLuongCoBan());
		}
		return luong;
	}
}
