package lab3_by_Van_Toan;

public class Bai4 {
	public static void main(String[] args) {
		LinkedList<SinhVien> danhSachSV = new LinkedList<SinhVien>();

		danhSachSV.add(new SinhVien(1, "A"));
		danhSachSV.add(new SinhVien(2, "Hung"));
		danhSachSV.add(new SinhVien(3, "Thien"));
		danhSachSV.add(new SinhVien(4, "Bao"));
		danhSachSV.add(new SinhVien(5, "Lan"));
		danhSachSV.add(new SinhVien(6, "Tuan"));
		danhSachSV.add(new SinhVien(7, "Hoang"));
		danhSachSV.add(new SinhVien(8, "Thuan"));
		danhSachSV.add(new SinhVien(9, "Hong"));
		danhSachSV.add(new SinhVien(10, "Vi"));
		danhSachSV.add(new SinhVien(11, "Duc"));
		danhSachSV.add(new SinhVien(12, "Thang"));
		danhSachSV.add(new SinhVien(13, "Nguyen"));
		danhSachSV.add(new SinhVien(14, "Thuy"));
		danhSachSV.add(new SinhVien(15, "Thuong"));
		danhSachSV.add(new SinhVien(16, "Trang"));
		danhSachSV.add(new SinhVien(17, "Tinh"));
		danhSachSV.add(new SinhVien(18, "Trinh"));
		danhSachSV.add(new SinhVien(19, "Thy"));
		danhSachSV.add(new SinhVien(20, "Ngoai"));

		// TÃ¬m má»™t sinh viÃªn cÃ³ tÃªn â€œAâ€�
		System.out.println("CÃ¢u 1. TÃ¬m má»™t sinh viÃªn cÃ³ tÃªn â€œAâ€� ");
		System.out.print(LinkedList.find(danhSachSV, "A"));
		// XÃ³a sinh viÃªn â€œAâ€� ra khá»�i danh sÃ¡ch
		System.out.println("CÃ¢u 2. XÃ³a sinh viÃªn â€œAâ€� ra khá»�i danh sÃ¡ch ");
		danhSachSV.remove(LinkedList.find(danhSachSV, "A"));
		System.out.print(danhSachSV);

	}

}
