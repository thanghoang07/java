package tuan11;

public class TestListSearch {
	public static void main(String[] args) {
		ListSearch<String> listString = new ListSearch<>();
		/*
		 * listInt.add(-10); listInt.add(1); listInt.add(10); listInt.add(100);
		 * listInt.add(1000); listInt.add(10000);
		 */
		listString.add("A");
		listString.add("C");
		listString.add("R");
		listString.add("W");
		listString.add("Z");

		System.out.println("In mang: \n" + listString.toString() + "\nBinary Search: " + listString.binarySearch(listString, "T"));
		System.out.println("Sequential Search: " + listString.sequentialSearch("R"));
	}
}
