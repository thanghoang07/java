package lab4;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[] myList = { 2, -1, 6, -5, 3, -2, 7 };
		int x = 0;
		int i = 0;
		while (i < myList.length && myList[i] != x) {
			i++;
		}
		if ( i < myList.length)
			System.out.println(i);
		else 
			System.out.println("Ngu");
	}
	public static boolean xetX(int[] myList, int n, int x) {
		int i = 0;
		while (i < n && myList[i] != x) {
			i++;
		}
		if (i < n)
			return true;
		else
			return false;
	}
}