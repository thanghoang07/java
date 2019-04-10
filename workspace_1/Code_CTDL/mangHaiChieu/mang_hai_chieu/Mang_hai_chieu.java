package mang_hai_chieu;

import java.util.Random;
import java.util.Scanner;

public class Mang_hai_chieu {
	static Scanner nhapVao;
	private final int soHang; // so hang
	private final int soCot; // so cot
	private final int[][] nhanMaTran; // hang voi cot trong ma tran
	static final int MAX = 5;
	static final int MAX1 = 3;

	public Mang_hai_chieu(int soHang, int soCot) {
		this.soHang = soHang;
		this.soCot = soCot;
		nhanMaTran = new int[soHang][soCot];
	}

	public Mang_hai_chieu(int[][] nhanMaTran) {
		soHang = nhanMaTran.length;
		soCot = nhanMaTran[0].length;
		this.nhanMaTran = new int[soHang][soCot];
		for (int i = 0; i < soHang; i++)
			for (int j = 0; j < soCot; j++)
				this.nhanMaTran[i][j] = nhanMaTran[i][j];
	}

	public static Mang_hai_chieu taoMaTranNgauNhien(int soHang, int soCot) {
		Mang_hai_chieu maTranA = new Mang_hai_chieu(soHang, soCot);
		Random abc = new Random();
		for (int i = 0; i < soHang; i++)
			for (int j = 0; j < soCot; j++)
				maTranA.nhanMaTran[i][j] = abc.nextInt(MAX);
		return maTranA;
	}

	// tao ma tran duong cheo
	public static Mang_hai_chieu taoMaTranCheo(int soHang) {
		Mang_hai_chieu maTranI = new Mang_hai_chieu(soHang, soHang);
		for (int i = 0; i < soHang; i++)
			maTranI.nhanMaTran[i][i] = MAX1;
		return maTranI;
	}

	// in ma tran
	public void inMaTran() {
		/*
		 * for (int i = 0; i < soHang; i++) { for (int j = 0; j < soCot; j++) {
		 * System.out.print("|" + nhanMaTran[i][j] + "|"); }
		 * System.out.println(); }
		 */
		for (int i = 0; i < this.size(); i++) {
			for (int j = 0; j < this.size(); j++) {
				System.out.print(nhanMaTran[i][j] + " ");
			}
			System.out.println();
		}

	}

	public int size() {
		return this.nhanMaTran.length;
	}

	public static int tinhTongDong(int[][] maTran, int soDong, int soCot, int chiSoDong) {
		int tong = 0;
		for (int j = 0; j < soCot; j++) {
			tong += maTran[chiSoDong][j];
		}
		return tong;
	}

	public static int tinhTongDuongCheoChinh(int[][] maTran, int soDong, int soCot) {
		int tong = 0;
		for (int i = 0; i < soDong; i++) {
			tong += maTran[i][i];
		}
		return tong;
	}

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao so hang cua ma tran: ");
		int n = nhapVao.nextInt();
		System.out.print("Nhap vao so hang cua ma tran cheo: ");
		int m = nhapVao.nextInt();

		Mang_hai_chieu maTranA = Mang_hai_chieu.taoMaTranNgauNhien(n, n);
		System.out.print("Ma tran thu nhat la: \n");
		maTranA.inMaTran();
		System.out.println();

		Mang_hai_chieu maTranB = Mang_hai_chieu.taoMaTranNgauNhien(n, n);
		System.out.print("Ma tran thu hai la: \n");
		maTranB.inMaTran();
		System.out.println();

		Mang_hai_chieu maTranCheo = Mang_hai_chieu.taoMaTranCheo(m);
		System.out.println("Ma tran cheo: \n");
		maTranCheo.inMaTran();
		System.out.println();

	}
}
