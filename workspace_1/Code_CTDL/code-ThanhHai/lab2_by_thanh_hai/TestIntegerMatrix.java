package lab2_by_thanh_hai;

import java.util.Random;
import java.util.Scanner;

public class TestIntegerMatrix {
	private static Scanner nhapVao;
	public static Integer[][] createMatrix(int m1, int m2){
		Random rd = new Random();
		Integer[][] matrix = new Integer[m1][m2];
		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				matrix[i][j]=rd.nextInt(2)+10;
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
		Integer[][] m1 =createMatrix(m, n);
		Integer[][] m2 =createMatrix(m, n);
		//
		IntegerMatrix integerMatrix = new IntegerMatrix();
		System.out.println("\nm1 + m2 la:");
		GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');
		
		System.out.println("\nm1 * m2 la:");
		GenericMatrix.printResult(m1, m2, integerMatrix.multiplyMatrix(m1, m2), '*');
	}
}
