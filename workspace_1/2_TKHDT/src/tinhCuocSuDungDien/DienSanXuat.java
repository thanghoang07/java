package tinhCuocSuDungDien;

public class DienSanXuat extends NgayGhiSoDienDung {
	private long chiSoDienLucCaoDiem, chiSoDienLucThapDiem;

	public DienSanXuat(Date ngayGhiElectric, int chiSoDien) {
		super(ngayGhiElectric, chiSoDien);
	}

	/**
	 * @return the chiSoDienLucCaoDiem
	 */
	public long chiSoLucCD() {
		return chiSoDienLucCaoDiem;
	}

	/**
	 * @param chiSoDienLucCaoDiem
	 *            the chiSoDienLucCaoDiem to set
	 */
	public void setChiSoDienLucCaoDiem(long chiSoDienLucCaoDiem) {
		this.chiSoDienLucCaoDiem = chiSoDienLucCaoDiem;
	}

	/**
	 * @return the chiSoDienLucThapDiem
	 */
	public long chiSoLucTD() {
		return chiSoDienLucThapDiem;
	}

	/**
	 * @param chiSoDienLucThapDiem
	 *            the chiSoDienLucThapDiem to set
	 */
	public void setChiSoDienLucThapDiem(long chiSoDienLucThapDiem) {
		this.chiSoDienLucThapDiem = chiSoDienLucThapDiem;
	}

	public DienSanXuat(Date ngayGhiElectric, long chiSoDien, long chiSoDienLucCaoDiem, long chiSoDienLucThapDiem) {
		super(ngayGhiElectric, chiSoDien);
		this.chiSoDienLucCaoDiem = chiSoDienLucCaoDiem;
		this.chiSoDienLucThapDiem = chiSoDienLucThapDiem;
	}

}
