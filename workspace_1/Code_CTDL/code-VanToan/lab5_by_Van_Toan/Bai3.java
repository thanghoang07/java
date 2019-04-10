package lab5_by_Van_Toan;

import java.util.Scanner;

public class Bai3 {
    	
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao bieu thuc de kiem tra: ");
        String s = in.nextLine();
        System.out.println(MathGroupSymbol.isGroupingSymbols(s));
    }
}