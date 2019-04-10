package tuan10;

import java.util.Arrays;

public class CrunchifyBubbleSortAsce {

	public static void main(String[] args) {

		int arrayList[] = { 2, 2, 4, 5, 6, 7, 8, 9, 2, 4, 2, 1, 0, 8 };
		System.out.println("mang chua sap xep: " + Arrays.toString(arrayList));
		System.out.println("BubbleSort");
		System.out.println("\nBubble Sort: " + Arrays.toString(BubbleSort(arrayList)));
		System.out.println("Selection Sort");
		System.out.println("\nSelection Sort: " + Arrays.toString(SelectionSort(arrayList)));
	}

	public static int[] BubbleSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println((i + 1) + "th iteration result: " + Arrays.toString(arr));
		}
		return arr;
	}
	public static int[] SelectionSort(int[] num) {
		int i, j, first, temp;
		for (i = num.length - 1; i > 0; i--) {
			first = 0; // initialize to subscript of first element
			for (j = 1; j <= i; j++) // locate smallest element between
										// positions 1 and i.
			{
				if (num[j] < num[first])
					first = j;
			}
			temp = num[first]; // swap smallest found with element in position
								// i.
			num[first] = num[i];
			num[i] = temp;			
		}		
		return num;
	}
	/*public static int[] selectionSort1(int[] num)
	{
		int minIndex;
		for(int i = 0; i < num.l
	}*/
}
