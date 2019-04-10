package lab7_by_Van_Toan;

public class TestLinkedList {
	public static void main(String[] args) {
		LinkedlistSort<Integer> test = new LinkedlistSort<>();
		test.add(3);
		test.add(8);
		test.add(10);
		test.add(4);
		test.add(3);
		test.add(1);
		test.add(90);
		
		System.out.println(test.size());
		System.out.println(test);
		test.insertionSort();
		System.out.println(test);
	}
	
}
