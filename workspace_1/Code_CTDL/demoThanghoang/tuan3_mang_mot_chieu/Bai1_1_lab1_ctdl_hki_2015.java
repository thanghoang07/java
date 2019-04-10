/*Bài 1: Viết chương trình nhập vào số nguyên n: 
1. Viết phương thức để trả v�? một mảng số thực gồm n phần tử 
2. Viết phương thức gán giá trị x cho phần tử cuối cùng 
3. Viết phương thức trả v�? tổng của 2 phần tử đầu tiên. 
4. Viết phương thức sử dụng vòng lặp tính toán tổng của tất cả các phần tử trong mảng 
5. Viết phương thức dùng vòng lặp để tìm giá trị nh�? nhất trong mảng 
6. Tự động tạo ra một số ngẫu nhiên index < n và hiển thị giá trị của phần tử tại vị trí index 
7. Dùng array initializer để tạo một mảng với giá trị khởi tạo là 3.5, 5.5, 4.52 và 5.6 
*/

package tuan3_mang_mot_chieu;


import java.util.Arrays;
import java.util.Scanner;

public class Bai1_1_lab1_ctdl_hki_2015 
{
	private static Scanner nhapVao;
	private static int mang1[];
	private static int n = 0;
	private static int i;
	private static int index;
	
	public static void main(String[] args) 
	{
		//nhap vao mang		
		nhapVao = new Scanner(System.in);
		System.out.print("Nhap vao phan tu n: ");
		n = nhapVao.nextInt();
		
		mang1 = new int[n + 1];
		
		for( i = 0; i < n; i++)  
	    {  
	      System.out.print("Nhap phan tu thu a["+ i +"]: ");  
	      mang1[i]= nhapVao.nextInt();  
	    }  	      
	    for( i = 0; i < n; i++)  
	    {    
	      System.out.print("\t" + mang1[i]);  
	    }  
		//tinh gia tri nho nhat
		int min = mang1[0];
		
		for( i = 0; i < n; i++)
			if(mang1[i] < min)
				min = mang1[i];
		System.out.print("\n\nGia tri nho nhat la: \t" 
							+ min);
		
		//tinh gia tri lon nhat
		int max = mang1[0]; 
		
		for( i = 0; i < n; i++)
			if(mang1[i] > max)
				max = mang1[i];
		System.out.print("\nGia tri lon nhat la: \t" + max);
		
		//tinh tong cac phan tu trong mang
		int tong = 0;
				
		for( i = 0; i < n; i++)
			tong += mang1[i];		
		System.out.print("\nTong la: \t\t" + tong);
				
		//tinh tong phan tu dau va cuoi trong mang
		int tong_Dau_Cuoi = 0;
				
		for( i = 0; i < n; i++)
			tong_Dau_Cuoi = mang1[n-1] + mang1[0];
		System.out.print("\nTong dau + cuoi la: \t" 
							+ tong_Dau_Cuoi);
				
		//tinh tong hai phan tu dau trong mang
		int tong_Hai_So_Dau = 0;
						
		for( i = 0; i < n; i++)
			tong_Hai_So_Dau = mang1[1] + mang1[0];
		System.out.print("\nTong hai so dau la: \t" 
							+ tong_Hai_So_Dau);
		//sap xep mang
		
		//thay the phan tu trong mang
		int mang_b_1[] = mang1.clone();
		
		int A = 0;
		
		mang_b_1[n - 1] = A;
		
		System.out.println("\nThay the phan tu cuoi: \n");
		for( i = 0; i < n; i++)
			System.out.print("\t" + mang_b_1[i]);
		//*********dung fill*********
		int mang_c_1[] = new int[8];
		mang_c_1[0] = 1; mang_c_1[1] = 3;
		mang_c_1[2] = 5; mang_c_1[3] = 7;
		mang_c_1[4] = 9; mang_c_1[5] = 0;
		mang_c_1[6] = 2; mang_c_1[7] = 4;
		Arrays.fill(mang_c_1, 2, 4, max);
		System.out.print("\n");
		for (i = 0, n = mang_c_1.length; i < n; i++)
			System.out.println(mang_c_1[i]);
		
		
		setIndex(0);
		
	}

	public static int getIndex() {
		return index;
	}

	public static void setIndex(int index) {
		Bai1_1_lab1_ctdl_hki_2015.index = index;
	}
}
