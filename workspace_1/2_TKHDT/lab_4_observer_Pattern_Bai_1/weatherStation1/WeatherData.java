package weatherStation1;

public class WeatherData {
	// temperature
	public double nhietDo;
	// humidity
	public double doAm;
	// pressure
	public double apXuat;
	//
	public ManHinhHienTai manHinhHienTai;
	public ManHinhThongKe manHinhThongKe;
	public ManHinhDuBao manHinhDuBao;

	public double getNhietDo() {
		return nhietDo;
	}

	public void setNhietDo(double nhietDo) {
		this.nhietDo = nhietDo;
	}

	public double getDoAm() {
		return doAm;
	}

	public void setDoAm(double doAm) {
		this.doAm = doAm;
	}

	public double getApXuat() {
		return apXuat;
	}

	public void setApXuat(double apXuat) {
		this.apXuat = apXuat;
	}

	// thay đổi và các yếu tố khác thì các lớp khác thay đổi theo

	public void mensurementsChange() {
		double nhietDo = getNhietDo();
		double doAm = getDoAm();
		double apXuat = getApXuat();

		manHinhHienTai.capNhatThongTin(nhietDo, doAm, apXuat);
		// manHinhThongKe.capNhatThongTin(nhietDo, doAm, apXuat);
		// manHinhDuBao.capNhatThongTin(nhietDo, doAm, apXuat);
	}

	public void setMensurements(double nhietDo, double doAm, double apXuat) {
		this.nhietDo = nhietDo;
		this.doAm = doAm;
		this.apXuat = apXuat;
		mensurementsChange();
	}

	public void setManHinhHienTai(ManHinhHienTai manHinhHienTai) {
		this.manHinhHienTai = manHinhHienTai;
	}

	public void setManHinhThongKe(ManHinhThongKe manHinhThongKe) {

	}

	public void setManHinhDuBao(ManHinhDuBao manHinhDuBao) {

	}
}
