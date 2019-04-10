package lab8_by_Van_Toan;

public class TestLKSearch {
	public static void main(String[] args) {
		LinkedlistSearch<Integer> test = new LinkedlistSearch<>();
		
		test.add(4);
		test.add(3);
		test.add(5);
		test.add(1);
		test.add(9);
		test.add(3);
		
		test.binarySearch(1);
	}
}
