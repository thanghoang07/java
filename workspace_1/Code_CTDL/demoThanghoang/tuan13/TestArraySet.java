/*package tuan13;

import tuan10.ArraySort;

public class TestArraySet {
	public static void main(String[] args) {
		ArraySet<Integer> mangInt = new ArraySet<Integer>();
		ArraySet<Integer> test1 = new ArraySet<>();
		ArraySet<Integer> test2 = new ArraySet<>();
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		mangInt.add(18);
		mangInt.add(20);
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang 1: \n" + mangInt.toString());
		test1.add(10);
		test1.add(11);
		test1.add(12);
		test1.add(13);
		test1.add(14);
		test1.add(15);
		System.out.println("In mang 2: \n" + test1.toString() + "\nSize mang 1: " + mangInt.size());
		mangInt.addAll(test1);
		System.out.println("In mang 1 sau khi addAll test1: \n" + mangInt.toString());
		mangInt.add(25);
		mangInt.add(26);
		System.out.println("In mang 1 sau khi them phan tu: \n" + mangInt.toString());
		test2.add(9);
		test2.addAll(mangInt);
		test2.add(21);
		test2.add(22);
		test2.add(23);
		System.out.println("In mang 3: \n" + test2.toString());
		test2.union(mangInt);
		System.out.println("In mang 3 sau khi union: \n" + test2.toString());
		System.out.println();
		mangInt.addAll(test2);
		
		 * mangInt.remove(10); System.out.println("In mang 1: \n" +
		 * mangInt.toString()+ "\nSize mang 1: " + mangInt.size());
		 * mangInt.removeRandom();
		 
		System.out.println("In mang 1: \n" + mangInt.toString());
		System.out.println("In mang 2: \n" + test1.toString());
		System.out.println("In mang 3: \n" + test2.toString());
		System.out.println("difference: "  + test1.difference(mangInt));
		System.out.println("In mang 1: \n" + mangInt.toString());
		System.out.println("In mang 3: \n" + test2.toString());
		System.out.println("In mang 1: \n" + mangInt.toString());
		test1.add(8);
		test1.add(1);
		System.out.println("difference: " + mangInt.difference(test1));
		System.out.println("In mang 1: \n" + mangInt.toString());
		System.out.println("In mang 2: \n" + test1.toString());
		
	}

}
*/