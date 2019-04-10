package ChamCong;

import NhanSu.NhanSu;

public class ChiTietChamCong {
	private ChamCong chamCong;
	private NhanSu nhanSu;
	private TrangThaiLamViec trangThaiLamViec;

	public ChiTietChamCong(ChamCong chamCong, NhanSu nhanSu, TrangThaiLamViec trangThaiLamViec) {
		super();
		this.chamCong = chamCong;
		this.nhanSu = nhanSu;
		this.trangThaiLamViec = trangThaiLamViec;
	}

	@Override
	public String toString() {
		return "ChiTietChamCong [chamCong=" + chamCong + ", nhanSu=" + nhanSu + ", trangThaiLamViec=" + trangThaiLamViec
				+ "]";
	}

	public ChamCong getChamCong() {
		return chamCong;
	}

	public void setChamCong(ChamCong chamCong) {
		this.chamCong = chamCong;
	}

	public NhanSu getNhanSu() {
		return nhanSu;
	}

	public void setNhanSu(NhanSu nhanSu) {
		this.nhanSu = nhanSu;
	}

	public TrangThaiLamViec getTrangThaiLamViec() {
		return trangThaiLamViec;
	}

	public void setTrangThaiLamViec(TrangThaiLamViec trangThaiLamViec) {
		this.trangThaiLamViec = trangThaiLamViec;
	}

}
