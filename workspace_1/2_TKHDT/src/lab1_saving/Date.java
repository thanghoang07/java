package lab1_saving;

public class Date {
	protected int ngay;
	protected int thang;
	protected int nam;

	public Date(int ngay, int thang, int nam) {
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return ngay + "/" + thang + "/" + nam;
	}

	/**
	 * @return the ngay
	 */
	public int getNgay() {
		return ngay;
	}

	/**
	 * @param ngay
	 *            the ngay to set
	 */
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	/**
	 * @return the thang
	 */
	public int getThang() {
		return thang;
	}

	/**
	 * @param thang
	 *            the thang to set
	 */
	public void setThang(int thang) {
		this.thang = thang;
	}

	/**
	 * @return the nam
	 */
	public int getNam() {
		return nam;
	}

	/**
	 * @param nam
	 *            the nam to set
	 */
	public void setNam(int nam) {
		this.nam = nam;
	}

}
