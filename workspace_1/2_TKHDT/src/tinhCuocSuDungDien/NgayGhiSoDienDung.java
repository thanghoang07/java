package tinhCuocSuDungDien;

public abstract class NgayGhiSoDienDung {

	private Date ngayGhiElectric;
	private long chiSoDien;

	public NgayGhiSoDienDung(Date ngayGhiElectric, long chiSoDien) {
		super();
		this.ngayGhiElectric = ngayGhiElectric;
		this.chiSoDien = chiSoDien;
	}

	/**
	 * @return the ngayGhiElectric
	 */
	public Date getNgayGhiElectric() {
		return ngayGhiElectric;
	}

	/**
	 * @param ngayGhiElectric
	 *            the ngayGhiElectric to set
	 */
	public void setNgayGhiElectric(Date ngayGhiElectric) {
		this.ngayGhiElectric = ngayGhiElectric;
	}

	/**
	 * @return the chiSoDien
	 */
	public long chiSoDien() {
		return chiSoDien;
	}

	/**
	 * @param chiSoDien
	 *            the chiSoDien to set
	 */
	public void setChiSoDien(long chiSoDien) {
		this.chiSoDien = chiSoDien;
	}

}