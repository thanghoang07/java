package thucHanhJavaBasic4;

import java.util.Random;
import java.util.Scanner;

public class JavaBasic4_9 {
	public static int[][] taoMang(int n) {
		Scanner scan = new Scanner(System.in);
		int[][] arrInts= new int[n][n];
		for(int i=0;i<arrInts.length;i++){
			for(int j =0;j<arrInts.length;j++){
				System.out.printf(" a[%d,%d] \n" ,i,j);
				arrInts[i][j]=scan.nextInt();
			}
		}
		return arrInts;
	}
	public static void printArray(int[][] arrInts) {
		System.out.print("ma tran nhap vao la: ");
		for(int i=0; i<arrInts.length;i++){
			System.out.printf("\n");
			for(int j =0;j<arrInts.length;j++){
				System.out.printf("%4d", arrInts[i][j]);
			}
		}	
	}
	public static boolean kiemTraMTTGTren(int[][] arrInts) {
		int test1 = 0, test2 = 0;
		for(int row = 0; row<arrInts.length; row++){
				if(arrInts[row][row]!=0){
					test1++;
				}
		}
		for(int row = 1; row<arrInts.length; row++){
			for (int column=0; column< arrInts.length;column++){
			if(arrInts[row][column]==0){
				test2++;
				}
			}
		}
		int soPTBang0= arrInts.length*(arrInts.length-1)/2;
		if(test1!=0 && test2 ==soPTBang0){
			return true;
		}
		else {
			return false;
			}
		}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao ma tran vuong cap n: ");
		int n = scan.nextInt();
		
		int[][] arrInts= new int[n][n] ;
		arrInts = taoMang(n);
		printArray(arrInts);
		System.out.println(" \n MT la tam giac tren hay ko?:"+ kiemTraMTTGTren(arrInts));
	}
}
