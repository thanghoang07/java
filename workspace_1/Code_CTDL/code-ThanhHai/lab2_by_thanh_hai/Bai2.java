package lab2_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class Bai2 {
	private static Scanner nhapVao;
	//So thuc
	public static Double[][] createMatrixDouble(int m1, int m2){
		Random rd = new Random();
		Double[][] matrix = new Double[m1][m2];
		for(int i=0; i< matrix.length; i++){
			for(int j=0; j< matrix[0].length; j++){
				matrix[i][j]=rd.nextDouble();
			}
		}
		return matrix;
	}
	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.print("-Nhap chi so hang:");
		int m = nhapVao.nextInt();
		System.out.print("-Nhap chi so cot:");
		int n= nhapVao.nextInt();
		
		Double[][] d1 =createMatrixDouble(m, n);
		Double[][] d2 =createMatrixDouble(m, n);
		//
		DoubleMatrix2 doubleMatrix = new DoubleMatrix2();
		System.out.println("\nm1 + m2");
		Matrix2.printResult(d1, d2, doubleMatrix.addMatrix(d1, d2), '+');
		
		System.out.println("\nm1 * m2");
		Matrix2.printResult(d1, d2, doubleMatrix.multiplyMatrix(d1, d2), '*');
	}
}
