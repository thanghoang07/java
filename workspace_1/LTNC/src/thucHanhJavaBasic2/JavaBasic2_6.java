package thucHanhJavaBasic2;

import java.util.Scanner;

public class JavaBasic2_6 {
	public static void main(String[] args) 
	{
	double Ax1, Ax2, Ax3;
// Scanner
	Scanner input = new Scanner(System.in);
	System.out.println("tam giac");
//	nhap canh a
	System.out.println("nhap canh a: ");
	int canhA = input.nextInt();
//	nhap canh b
	System.out.println("nhap canh b: ");
	int canhB = input.nextInt();
//	nhap canh c
	System.out.println("nhap canh c: ");
	int canhC = input.nextInt();
//	tinh chu vi
	double chuVi = canhA + canhB + canhC;
//  tinh nua chu vi
	double nuaChuVi = chuVi / 2;
//	tinh dien tich 
	double dienTich = Math.sqrt(nuaChuVi * (nuaChuVi - canhA )
			* (nuaChuVi - canhB ) * (nuaChuVi - canhC ));
	Ax1 = canhA * canhA;
	Ax2 = canhB * canhB;
	Ax3 = canhC * canhC;
//	co phai tam giac hay khong !!!
	if(canhA + canhB > canhC 
		|| canhA + canhC > canhB 
		|| canhB + canhC > canhA)
	{
//	coi thu tam giac do co phai la tam giac deu ko :v 
		if(canhA == canhB 
				|| canhA == canhC 
				|| canhB == canhC)
		{
			System.out.println(
					"day la tam giac deu co canh la: " 
			+ canhA + " va co dien tich la: " 
			+ dienTich + " chu vi la: " 
			+ chuVi);
		}
//	coi thu tam giac do co phai tam giac can hay khong 
		else if (canhA == canhB && canhA != canhC && canhB != canhC)
		{
			System.out.println(
					"day la tam giac can co canh la: "
					+ "\n" + "hai canh ben la: " + canhA
					+ " va " + canhB + " canh day la: " + canhC
					+ "\n" + " va co dien tich la: " 
					+ dienTich + " chu vi la: " 
					+ chuVi);
		}
		else if (canhA == canhC && canhA != canhB && canhC != canhB)
		{
			System.out.println(
					"day la tam giac can co canh la: "
					+ "\n" + "hai canh ben la: " + canhA
					+ " va " + canhC + " canh day la: " + canhB
					+ "\n" + " va co dien tich la: " 
					+ dienTich + " chu vi la: " 
					+ chuVi);
		}
// coi thu tam giac do co phai la tam giac vuong hay khong
		else if (Ax1 == Ax2 + Ax3)
		{
			System.out.println(
					"day la tam giac vuong" 
					+ "\n" + "co canh goc vuong la: " + canhB + " va " + canhC 
					+ "\n" + "co canh huyen la: " + canhA
					+ "\n" + " va co dien tich la: " 
					+ dienTich + " chu vi la: " 
					+ chuVi);	
		}
		else if (Ax2 == Ax1 + Ax3)
		{
			System.out.println(
					"day la tam giac vuong" 
					+ "\n" + "co canh goc vuong la: " + canhA + " va " + canhC 
					+ "\n" + "co canh huyen la: " + canhB
					+ "\n" + " va co dien tich la: " 
					+ dienTich + " chu vi la: " 
					+ chuVi);	
		}
		else if (Ax3 == Ax2 + Ax1)
		{
			System.out.println(
					"day la tam giac vuong" 
					+ "\n" + "co canh goc vuong la: " + canhA + " va " + canhB 
					+ "\n" + "co canh huyen la: " + canhC
					+ "\n" + " va co dien tich la: " 
					+ dienTich + " chu vi la: " 
					+ chuVi);	
		}
//tam giac thuong
		else
		{
			System.out.println(
					"day la tam giac thuong: " 
					+ "\n" + "co cac canh la: " + canhA + " va " + canhB + " va " + canhC
					+ "\n" + " va co dien tich la: " 
					+ dienTich + " chu vi la: " 
					+ chuVi);
		}
	}
//	khong phai tam giac
	else
	{
		System.out.println("khong phai tam giac");
	}
	}
}	
	
