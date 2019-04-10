package quanLyDiem;

import java.util.ArrayList;

import java.util.List;

public class Student {
	// khoi tao mssv
	public String mssv;
	// khoi tao ten
	public String ten;
	// khoi tao ngay sinh
	public Date ngaySinh;
	// khoi tao giang vien
	public Lecturer giangVien;
	// khoi tao danh sach mon dang ky
	public List<Register> danhSachMon;

	public Student(String mssv, String ten, Date ngaySinh) {
		this.mssv = mssv;
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.giangVien = giangVien;
		this.danhSachMon = new ArrayList<Register>();
	}

	public String getMssv() {
		return mssv;
	}

	public Student() {
		super();
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public List<Register> getDanhSachMon() {
		return danhSachMon;
	}

	public void setDanhSachMon(List<Register> danhSachMon) {
		this.danhSachMon = danhSachMon;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Lecturer getGiangVien() {
		return giangVien;
	}

	public void setGiangVien(Lecturer giangVien) {
		this.giangVien = giangVien;
	}

	// dang ly mon hoc
	public void dangKy(Course course) {
		danhSachMon.add(new Register(course));
	}

	// cập nhật điểm cho sinh viên
	public void capNhatDiem(Course course, float diem) {
		for (Register register : danhSachMon) {
			if (register.getCourse().getTen().equals(course.getTen())) {
				register.setDiem(diem);
				break;
			}
		}
	}

	public boolean timSinhVien(String mssv) {
		if (this.mssv.equals(mssv)) {
			return true;
		} else {
			return false;
		}
	}

	// phuong thuc in diem cua mot sinh vien co trong danh sach
	public void printOne(String mssv) {
		if (!timSinhVien(mssv)) {
			System.out.println("khong co trong danh sach sinh vien");
		} else {
			System.out.println("=================================\nMa so sinh vien:  " + getMssv() + "\nTen: "
					+ getTen() + "\n" + "Ngay sinh: " + getNgaySinh() + "\n" + "Stt\tMon\tSo Chi\tDiem");
			for (int i = 0; i < danhSachMon.size(); i++) {
				System.out.println(i + "\t" + danhSachMon.get(i).getCourse().getTen() + "\t"
						+ danhSachMon.get(i).getCourse().getSoTinChi() + "\t" + danhSachMon.get(i).getDiem());
			}
			System.out.printf("Diem trung binh: %.3f\nXep loai: %s\n", diemTrungBinh(), xepHang());
			System.out.println("=================================");
		}

	}

	// phuong thuc tinh diem trung binh
	public float diemTrungBinh() {
		float temp = 0;
		int temp2 = 0;
		for (Register f : danhSachMon) {
			temp += (f.getDiem() * f.getCourse().getSoTinChi());
			temp2 += f.getCourse().getSoTinChi();
		}
		return temp / temp2;
	}

	// in ra danh sach cac sinh vien
	public void print() {
		System.out.println("=================================\nMa so sinh vien:  " + getMssv() + "\nTen: " + getTen()
				+ "\n" + "Ngay sinh: " + getNgaySinh() + "\n" + "Stt\tMon\tSo Chi\tDiem");
		for (int i = 0; i < danhSachMon.size(); i++) {
			System.out.println(i + "\t" + danhSachMon.get(i).getCourse().getTen() + "\t"
					+ danhSachMon.get(i).getCourse().getSoTinChi() + "\t" + danhSachMon.get(i).getDiem());
		}
		System.out.printf("Diem trung binh: %.3f\nXep loai: %s\n", diemTrungBinh(), xepHang());
		System.out.println("=================================");
	}

	// in ra tung sinh vien
	public String toString() {
		return getTen() + " " + getNgaySinh() + " " + getDanhSachMon();
	}

	// phuong thuc sep hang
	public String xepHang() {
		float diemTB = diemTrungBinh();
		if (diemTB >= 9)
			return "Xuat Sac";
		else if (diemTB >= 8)
			return "Gioi";
		else if (diemTB >= 7)
			return "Kha";
		else if (diemTB >= 6)
			return "Trung Binh Kha";
		else if (diemTB >= 5)
			return "Trung Binh";
		else
			return "Rot";
	}
}
