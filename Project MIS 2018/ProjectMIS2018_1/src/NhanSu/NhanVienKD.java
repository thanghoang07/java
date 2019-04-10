package NhanSu;

import ThoiGian.DateTime;

public class NhanVienKD extends NhanSu {

	public NhanVienKD(String maNS, String tenNS, DateTime ngaySinh, String diaChi, Boolean gioiTinh, DateTime ngayVaoLam,
			LoaiNhanSu loai) {
		super(maNS, tenNS, ngaySinh, diaChi, gioiTinh, ngayVaoLam, loai);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void chamCong() {
		// TODO Auto-generated method stub

	}

	@Override
	public float tinhLuong() {
		// TODO Auto-generated method stub
		return 0;
	}

}