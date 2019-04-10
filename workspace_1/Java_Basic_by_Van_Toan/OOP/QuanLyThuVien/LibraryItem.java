package QuanLyThuVien;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import QuanLyNhanVien.Employee;

public abstract class LibraryItem implements Comparable {
	protected int catID;
	protected String title;
	protected int dueDays;

	public LibraryItem(int catID, String title, int dueDays) {
		super();
		this.catID = catID;
		this.title = title;
		this.dueDays = dueDays;
	}

	public boolean smallerThan(LibraryItem that) {
		return this.catID < that.catID;

	}

	public int overdueDays(int rentDays) {
		return rentDays - dueDays;
	}

	public static void printArray(LibraryItem[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);

		}
	}

	public static ArrayList<LibraryItem> taoDanhSach() {
		ArrayList<LibraryItem> danhSach = new ArrayList<LibraryItem>();
		LibraryItem l1 = new Book(102, "How  to design class hirarchies", 5,
				"Tin hoc", "Matthias Fellesen", 2004);
		LibraryItem l2 = new CD(1023, "Pearl", 40, "JJ");
		LibraryItem l3 = new Magazine(143, "MW", 3, 20, 4);
		danhSach.add(l1);
		danhSach.add(l2);
		danhSach.add(l3);
		return danhSach;
	}

	public static void main(String[] args) {
//		LibraryItem[] arr = new LibraryItem[3];
//		arr[0] = new Book(102, "Wow to", 5, "Tin hoc", "Matthias Felleisen",
//				2004);
//		arr[1] = new CD(1023, "Bearl", 40, "JJ");
//		arr[2] = new Magazine(143, "TW", 3, 20, 4);
//
//		Arrays.sort(arr);
//
//		printArray(arr);
		
		ArrayList<LibraryItem> danhSach = new ArrayList<LibraryItem>();
		danhSach = taoDanhSach();
		
		Collections.sort(danhSach);
		
		for (int i = 0; i < danhSach.size(); i++) {
			System.out.println("" + danhSach.get(i));
		}
	}

	@Override
	public int compareTo(Object o) {
		LibraryItem l1 = (LibraryItem) o;
		return this.title.compareToIgnoreCase(l1.title);
	}

	@Override
	public String toString() {
		return "LibraryItem [catID=" + catID + ", title=" + title
				+ ", dueDays=" + dueDays + "]";
	}

}
