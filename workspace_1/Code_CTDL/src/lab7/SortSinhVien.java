package lab7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SortSinhVien implements Comparable<SortSinhVien> {
	
	public void bubbleSortDiemTrungBinh(ArrayList<SinhVien> sinhV) {

		SinhVien tmp = null;
		for (int i = sinhV.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sinhV.get(j).getDiemTrungBinh() < (sinhV.get(j + 1).getDiemTrungBinh())) {
					tmp = sinhV.get(j);
					sinhV.set(j, sinhV.get(j + 1));
					sinhV.set(j + 1, tmp);
				}
			}
		}
	}

	public void bubbleSortTen(ArrayList<SinhVien> sinhV) {

		SinhVien tmp = null;
		for (int i = sinhV.size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (sinhV.get(j).getTen().compareTo(sinhV.get(j + 1).getTen()) > 0) {
					tmp = sinhV.get(j);
					sinhV.set(j, sinhV.get(j + 1));
					sinhV.set(j + 1, tmp);
				} else if (sinhV.get(j).getHo().compareTo(sinhV.get(j + 1).getHo()) > 0) {
					tmp = sinhV.get(j);
					sinhV.set(j, sinhV.get(j + 1));
					sinhV.set(j + 1, tmp);
				}
			}
		}
	}

	@Override
	public int compareTo(SortSinhVien o) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void ghiFile(ArrayList<SinhVien> sinhV) throws IOException {
		FileOutputStream fos = new FileOutputStream("danhSachSinhVien.txt");
		PrintWriter pw = new PrintWriter(fos);

		for (int i = 0; i < sinhV.size(); i++) {
			if (sinhV.get(i) != null) {
				pw.println("\nSinh Vien thu: " + (i + 1) + "\n" + sinhV.get(i) + "\n");
			} else {
				pw.println("");
			}
		}
		pw.close();
		fos.flush();
		fos.close();
	}
	
}
