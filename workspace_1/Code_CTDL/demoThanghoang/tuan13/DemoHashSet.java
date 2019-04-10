/*package tuan13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import lab5_by_Van_Toan.ArrayStack;

public class DemoHashSet {
	private static Scanner nhapVao;

	public static void main(String[] args) {
		nhapVao = new Scanner(System.in);
		System.out.println("nhap vao n: ");
		int n = nhapVao.nextInt();
		System.out.println("nhap vao key: ");
		int key = nhapVao.nextInt();
		long start = System.currentTimeMillis();
		//long start = System.nanoTime();
		LinkedHashSet<Integer> set0 = new LinkedHashSet<Integer>();
		
		for (int i = 0; i < n; i++) {
			set0.add(i);
		}
		System.out.println(set0.contains(key));
		long end = System.currentTimeMillis();
		//long end = System.nanoTime();
		long total = end - start;
		System.out.println("1.LinkedHashSet: " + total);

		//hashset
		start = 0; end = 0;
		start = System.currentTimeMillis();
		//start = System.nanoTime();
		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set1.add(i);
		}
		System.out.println(set1.contains(key));
		
		end = System.currentTimeMillis();
		//end =  System.nanoTime();
		total = end - start;
		System.out.println("2.HashSet: " + total);
		start = 0; end = 0;
		//
		ArraySet<Integer> set2 = new ArraySet<Integer>();
		start = System.currentTimeMillis();
		//start = System.nanoTime();
		for (int i = 0; i < n; i++) {
			set2.add(i);
		}
		System.out.println(set2.contains(key));
		end = System.currentTimeMillis();
		//end =  System.nanoTime();
		total = end - start;
		System.out.println("3.ArraySet: " + total);
		
	}
}
*/