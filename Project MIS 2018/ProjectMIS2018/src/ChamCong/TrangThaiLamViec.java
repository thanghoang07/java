package ChamCong;

public class TrangThaiLamViec {
	private String maTrangThaiLamViec, tenTrangThaiLamViec;

	public TrangThaiLamViec(String maTrangThaiLamViec, String tenTrangThaiLamViec) {
		super();
		this.maTrangThaiLamViec = maTrangThaiLamViec;
		this.tenTrangThaiLamViec = tenTrangThaiLamViec;
	}

	@Override
	public String toString() {
		return "TrangThaiLamViec [maTrangThaiLamViec=" + maTrangThaiLamViec + ", tenTrangThaiLamViec="
				+ tenTrangThaiLamViec + "]";
	}

	public String getMaTrangThaiLamViec() {
		return maTrangThaiLamViec;
	}

	public void setMaTrangThaiLamViec(String maTrangThaiLamViec) {
		this.maTrangThaiLamViec = maTrangThaiLamViec;
	}

	public String getTenTrangThaiLamViec() {
		return tenTrangThaiLamViec;
	}

	public void setTenTrangThaiLamViec(String tenTrangThaiLamViec) {
		this.tenTrangThaiLamViec = tenTrangThaiLamViec;
	}

}
