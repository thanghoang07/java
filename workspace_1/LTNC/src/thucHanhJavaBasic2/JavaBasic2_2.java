package thucHanhJavaBasic2;

import java.awt.Color;
import java.util.Scanner;

public class JavaBasic2_2 {
	public static boolean isLeapYear(int nam){
//		kiem tra nam nhuan
		if((nam%4==0)&&(nam%100!=0)||(nam%400==0)) 
			return true;
		
		else 
			return false;
	}
	public static void main (String[] args) {
		int nam;
		int thang;
//		nhap vao mot nam bat ki
		System.out.print("nhap vao mot nam bat ki: ");
		Scanner input = new Scanner(System.in);
		nam = input.nextInt();
//		nhap vao mot thang bat ki
		System.out.print("nhap vao mot thang bat ki trong nam do: ");
		thang = input.nextInt();
		
		if(isLeapYear(nam))
			System.out.println("nam "+nam+ " la nam nhuan");
		else 
			System.out.println("nam "+nam+" khong phai la nam nhuan");
		
		switch(thang){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("thang "+ thang+" nam "+ nam+"  co 31 ngay");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("thang "+ thang+" nam "+nam+" co 30 ngay");
			break;
		case 2:
			if(isLeapYear(nam)) 
				System.out.println("thang "+thang+" nam "+nam +" co 29 ngay");
			else 
				System.out.println("thang "+thang+" nam "+ nam+" co 28 ngay");
			break;
		}
		

	}	
}

