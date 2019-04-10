package weatherStation2;

public class ManHinhDuBao implements Observer, HienThi {
	public double nhietDo, doAm, apXuat;
	private Subject weatherData;

	public ManHinhDuBao() {
		super();
	}

	public ManHinhDuBao(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void inRa() {
		System.out.println("***********************************");
		System.out.printf("\tDu Bao Thoi Tiet \nNhiet Do: \t%.3f \nDo Am: \t\t%.3f \nAp Xuat: \t%.3f \n",
				duBaoNhietDo(nhietDo), duBaoDoAm(doAm), duBaoApXuat(apXuat));
		System.out.println("-----------------------------------\nDu Bao: \t");
		duBao();
		System.out.println("***********************************");

	}

	@Override
	public void capNhatThongTin(double nhietDo, double doAm, double apXuat) {
		this.nhietDo = nhietDo;
		this.doAm = doAm;
		this.apXuat = apXuat;
		inRa();
	}

	public double duBaoNhietDo(double nhietDo) {
		double temp = 0;
		temp = Math.sqrt(nhietDo * Math.random() * Math.pow(4, 3));
		return temp;
	}

	public double duBaoDoAm(double doAm) {
		double temp = 0;
		temp = Math.sqrt(doAm * Math.random() * Math.pow(6, 3));
		return temp;
	}

	public double duBaoApXuat(double apXuat) {
		double temp = 0;
		temp = Math.sqrt(apXuat * Math.random() * Math.pow(5, 3)) / 100;
		return temp;
	}

	public void duBao() {
		if (duBaoNhietDo(nhietDo) < 0.0) {
			System.out.println("Ban khong nen ra duong vao hom sau");
		} else if (duBaoNhietDo(nhietDo) >= 0.0 && duBaoNhietDo(nhietDo) <= 10.0) {
			if (duBaoDoAm(doAm) < 0.0) {
				System.out.println("Troi rat lanh va hanh kho");
			} else if (duBaoDoAm(doAm) >= 0.0 && duBaoDoAm(doAm) <= 15.0) {
				System.out.println("Troi co tuyet va rat lanh :3");
			} else if (duBaoDoAm(doAm) > 15.0 && duBaoDoAm(doAm) <= 30.0) {
				System.out.println("Troi co tuyet va lanh va hanh");
			} else if (duBaoDoAm(doAm) > 30.0 && duBaoDoAm(doAm) <= 45.0) {
				System.out.println("Troi co tuyet va lanh va hanh");
			} else if (duBaoDoAm(doAm) > 45.0 && duBaoDoAm(doAm) <= 60.0) {
				System.out.println("Troi co tuyet va lanh va hanh");
			} else {
				System.out.println("......");
			}
		} else if (duBaoNhietDo(nhietDo) > 10.0 && duBaoNhietDo(nhietDo) <= 20.0) {
			if (duBaoDoAm(doAm) < 0.0) {
				System.out.println("Troi lanh va hanh kho");
			} else if (duBaoDoAm(doAm) >= 0.0 && duBaoDoAm(doAm) <= 15.0) {
				System.out.println("Troi mat va kho :3");
			} else if (duBaoDoAm(doAm) > 15.0 && duBaoDoAm(doAm) <= 30.0) {
				System.out.println("Troi mat va co ve hoi am");
			} else if (duBaoDoAm(doAm) > 30.0 && duBaoDoAm(doAm) <= 45.0) {
				System.out.println("Troi mat va am co mua");
			} else if (duBaoDoAm(doAm) > 45.0 && duBaoDoAm(doAm) <= 60.0) {
				System.out.println("Troi am va sap co mua to");
			} else {
				System.out.println("Troi nom");
			}
		} else if (duBaoNhietDo(nhietDo) > 20.0 && duBaoNhietDo(nhietDo) <= 30.0) {
			if (duBaoDoAm(doAm) < 0.0) {
				System.out.println("Troi mat va kho");
			} else if (duBaoDoAm(doAm) >= 0.0 && duBaoDoAm(doAm) <= 15.0) {
				System.out.println("Troi mat va hoi kho :3");
			} else if (duBaoDoAm(doAm) > 15.0 && duBaoDoAm(doAm) <= 30.0) {
				System.out.println("Troi mat va co ve am sap co mua");
			} else if (duBaoDoAm(doAm) > 30.0 && duBaoDoAm(doAm) <= 45.0) {
				System.out.println("Troi mat va hoi am sap co mua to");
			} else if (duBaoDoAm(doAm) > 45.0 && duBaoDoAm(doAm) <= 60.0) {
				System.out.println("Troi mua vua va to ");
			} else {
				System.out.println("Ngap lut");
			}
		} else {
			System.out.println("Ngay mai troi rat nong va nang to");
		}
	}
}
