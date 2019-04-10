package QLNguyenLieu;

	public class NguyenLieu implements INguyenLieu {
		private String maNL, ten;
		private int soLuong;
		private LoaiNguyenLieu loai;
		private NhaCungCap nhaCungCap;

		public NguyenLieu(String maNL, String ten, int soLuong, LoaiNguyenLieu loai, NhaCungCap nhaCungCap) {
			super();
			this.maNL = maNL;
			this.ten = ten;
			this.soLuong = soLuong;
			this.loai = loai;
			this.nhaCungCap = nhaCungCap;
		}

		public String getMaNL() {
			return maNL;
		}

		public void setMaNL(String maNL) {
			this.maNL = maNL;
		}

		public String getTen() {
			return ten;
		}

		public void setTen(String ten) {
			this.ten = ten;
		}

		public int getSoLuong() {
			return soLuong;
		}

		public void setSoLuong(int soLuong) {
			this.soLuong = soLuong;
		}

		public LoaiNguyenLieu getLoai() {
			return loai;
		}

		public void setLoai(LoaiNguyenLieu loai) {
			this.loai = loai;
		}

		public NhaCungCap getNhaCungCap() {
			return nhaCungCap;
		}

		public void setNhaCungCap(NhaCungCap nhaCungCap) {
			this.nhaCungCap = nhaCungCap;
		}

		@Override
		public String toString() {
			return "NguyenLieu [maNL=" + maNL + ", ten=" + ten + ", soLuong=" + soLuong + ", loai=" + loai + ", nhaCungCap="
					+ nhaCungCap + "]";
		}

		@Override
		public void themNguyenLieu(NguyenLieu nguyenLieu) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void xoaNguyenLieu(String maNguyenLieu) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void suaNguyenLieu(String maNguyenLieu) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void timKiemNguyenLieu(String maNguyeLieu) {
			// TODO Auto-generated method stub
			
		}

	
	
}
