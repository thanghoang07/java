package lab7_by_Van_Toan;

import java.util.Random;

public class Test {
	
	public static void main(String[] args) {
//		ArraySort<Integer> test1 = new ArraySort<>(1000);
//		Random r = new Random();
//		for (int i = 0; i < 1000; i++) {
//			test1.insert(r.nextInt(10));
//		}
//		System.out.println(test1);
//		test1.selectionSort();
//		System.out.println("--------");
//		System.out.println(test1);
		Random r = new Random();
		ArraySort<Integer> test2 = new ArraySort<>(10000);

		for (int i = 0; i < 10000; i++) {
			test2.insert(r.nextInt(10));
		}
		System.out.println(test2);
		test2.selectionSort();
		System.out.println("--------");
		System.out.println(test2);
//		
//		ArraySort<Integer> test3 = new ArraySort<>(100000);
//
//		for (int i = 0; i < 100000; i++) {
//			test3.insert(r.nextInt(100));
//		}
//		System.out.println(test3);
//		test3.insertionSort();
//		System.out.println("--------");
//		System.out.println(test3);
	}
	
}
