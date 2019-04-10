package tinhCuocSuDungDien;

import java.util.ArrayList;
import java.util.List;

public class CaNhan extends NguoiDung {
	private ArrayList<DienSinhHoat> ghiChiSo;

	public CaNhan(String ID, String ten, String diaChi) {
		super(ID, ten, diaChi);
		ghiChiSo = new ArrayList<DienSinhHoat>();
	}

	@Override
	public List<DienSinhHoat> getNgayGhi() {
		return ghiChiSo;
	}

	public void themChiSo(DienSinhHoat chiSo) {
		getNgayGhi().add(chiSo);
	}

	/*
	 * Tinh tien dien cho khach hang. Gia dien sinh hoat tinh theo bac thang:
	 * 100kW dau tien : gia 550 50kW tiep theo: 900 50kW tiep theo: 1210 100kW
	 * tiep theo: 1340 kW thu 301 tro len: 1400
	 */
	public double tinhTienDien() {
		long chiSoCu = getChiSoCu().chiSoDien();
		long chiSoMoi = getChiSoMoi().chiSoDien();
		long usage = chiSoMoi - chiSoCu;

		// So kW chiu don gia 550
		long u1 = (usage <= 100 ? usage : 100);

		// So kW chiu don gia 900
		long u2 = (usage <= 150 ? (usage - u1) : 50);

		// So kW chiu don gia 1210
		long u3 = (usage <= 200 ? (usage - u1 - u2) : 50);

		// So kW chiu don gia 1340
		long u4 = (usage <= 300 ? (usage - u1 - u2 - u3) : 100);

		// So kW chiu don gia 1400
		long u5 = (usage - u1 - u2 - u3 - u4);

		double result = u1 * 550 + u2 * 900 + u3 * 1210 + u4 * 1340 + u5 * 1400;

		// Thue Gia Tri Gia Tang
		result += result * VAT;
		return result;
	}

	public void inHoaDon() {
		NgayGhiSoDienDung chiSoCu = getChiSoCu();
		NgayGhiSoDienDung chiSoMoi = getChiSoMoi();
		long luongDung = chiSoMoi.chiSoDien() - chiSoCu.chiSoDien();
		System.out.printf("ID: \t\t\t%s \nTen: \t\t\t%s\nDia chi: \t\t%s\n", getID(), getTen(), getDiaChi());
		System.out.print("---------------------------------");
		System.out.println("\nChi so cu: \t\t" + Math.round(chiSoCu.chiSoDien()) + " \nChi so moi: \t\t"
				+ Math.round(chiSoMoi.chiSoDien()));
		System.out.print("---------------------------------");
		System.out.println(" \nDien nang tieu thu: \t" + luongDung
				+ " \nThanh tien (10% VAT): \t" + Math.round(tinhTienDien()));
	}
}
