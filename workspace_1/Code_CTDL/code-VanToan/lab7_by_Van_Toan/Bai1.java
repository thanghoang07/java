package lab7_by_Van_Toan;

public class Bai1 {
	public static void main(String[] args) {
		System.out.println("***Bubble Sort***");
		ArraySort<String> sBubbleSort = new ArraySort<>(6);
		sBubbleSort.insert("C");
		sBubbleSort.insert("A");
		sBubbleSort.insert("D");
		sBubbleSort.insert("G");
		sBubbleSort.insert("T");
		
		System.out.println("--String--");
		System.out.println(sBubbleSort);
		sBubbleSort.bubbleSortNew();
		System.out.println(sBubbleSort);
		
		ArraySort<Integer> intBubbleSort = new ArraySort<>(6);
		intBubbleSort.insert(1);
		intBubbleSort.insert(5);
		intBubbleSort.insert(10);
		intBubbleSort.insert(7);
		intBubbleSort.insert(9);
		
		System.out.println("--Int--");
		System.out.println(intBubbleSort);
		intBubbleSort.bubbleSortNew();
		System.out.println(intBubbleSort);
		
		ArraySort<Double> doubleBubbleSort = new ArraySort<>(6);
		doubleBubbleSort.insert(5.4);
		doubleBubbleSort.insert(7.0);
		doubleBubbleSort.insert(5.0);
		doubleBubbleSort.insert(1.2);
		doubleBubbleSort.insert(5.5);
		
		System.out.println("--Double--");
		System.out.println(doubleBubbleSort);
		doubleBubbleSort.bubbleSortNew();
		System.out.println(doubleBubbleSort);
		
		
		System.out.println("***Selection Sort***");
		ArraySort<String> sSelectionSort = new ArraySort<>(6);
		sSelectionSort.insert("toan");
		sSelectionSort.insert("ha");
		sSelectionSort.insert("thien");
		sSelectionSort.insert("van");
		sSelectionSort.insert("long");
		
		System.out.println("--String--");
		System.out.println(sSelectionSort);
		sSelectionSort.bubbleSortNew();
		System.out.println(sSelectionSort);
		
		ArraySort<Integer> intSelectionSort = new ArraySort<>(6);
		intSelectionSort.insert(1);
		intSelectionSort.insert(5);
		intSelectionSort.insert(10);
		intSelectionSort.insert(7);
		intSelectionSort.insert(9);
		
		System.out.println("--Int--");
		System.out.println(intSelectionSort);
		intSelectionSort.bubbleSortNew();
		System.out.println(intSelectionSort);
		
		ArraySort<Double> doubleSelectionSort = new ArraySort<>(6);
		doubleSelectionSort.insert(5.4);
		doubleSelectionSort.insert(7.0);
		doubleSelectionSort.insert(5.0);
		doubleSelectionSort.insert(1.2);
		doubleSelectionSort.insert(5.5);
		
		System.out.println("--Double--");
		System.out.println(doubleSelectionSort);
		doubleSelectionSort.bubbleSortNew();
		System.out.println(doubleSelectionSort);
		
		
		System.out.println("***Insertion Sort***");
		ArraySort<String> sInsertionSort = new ArraySort<>(6);
		sInsertionSort.insert("toan");
		sInsertionSort.insert("ha");
		sInsertionSort.insert("thien");
		sInsertionSort.insert("van");
		sInsertionSort.insert("long");
		
		System.out.println("--String--");
		System.out.println(sInsertionSort);
		sInsertionSort.bubbleSortNew();
		System.out.println(sInsertionSort);
		
		ArraySort<Integer> intInsertionSort = new ArraySort<>(6);
		intInsertionSort.insert(1);
		intInsertionSort.insert(5);
		intInsertionSort.insert(10);
		intInsertionSort.insert(7);
		intInsertionSort.insert(9);
		
		System.out.println("--Int--");
		System.out.println(intInsertionSort);
		intInsertionSort.bubbleSortNew();
		System.out.println(intInsertionSort);
		
		ArraySort<Double> doubleInsertionSort = new ArraySort<>(6);
		doubleInsertionSort.insert(5.4);
		doubleInsertionSort.insert(7.0);
		doubleInsertionSort.insert(5.0);
		doubleInsertionSort.insert(1.2);
		doubleInsertionSort.insert(5.5);
		
		System.out.println("--Double--");
		System.out.println(doubleInsertionSort);
		doubleInsertionSort.bubbleSortNew();
		System.out.println(doubleInsertionSort);
		
	}
}
