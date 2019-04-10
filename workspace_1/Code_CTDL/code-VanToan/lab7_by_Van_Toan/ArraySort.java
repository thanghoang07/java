package lab7_by_Van_Toan;

public class ArraySort<T extends Comparable<T>> {
	private T[] arr;
	private int nElems;

	public ArraySort(int max) {
		arr = (T[]) new Comparable[max];
		nElems = 0;
	}

	public void insert(T value) {
		arr[nElems] = value;
		nElems++; //
	}

	public void bubbleSort() {
		T tmp = null;
		for (int i = nElems - 1; i > 1; i--)
			for (int j = 0; j < i; j++)
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					tmp = arr[i];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
	}

	public void bubbleSortNew() {
		boolean swapped = true;
		int j = 0;
		T tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < nElems - j; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swapped = true;
				}
			}
		}
	}

	public void selectionSort() {
		int minIndex;
		for (int i = 0; i < nElems - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < nElems; j++)
				if (arr[j].compareTo(arr[minIndex]) < 0)
					minIndex = j;
			if (minIndex != i) {
				T tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}

	}

	public void insertionSort() {
		int j;
		for (int i = 1; i < nElems; i++) {
			T temp = arr[i];
			j = i; // start shifts at out
			while (j > 0 && arr[j - 1].compareTo(temp) > 0) {// until one is
																// smaller
				arr[j] = arr[j - 1]; // shift item right,
				j--; // go left one position
			}
			arr[j] = temp;
		} // end for
	}

	public void quickSort(int left, int right) {
		int index = findParrtition(left, right);
		if (left < index - 1)
			quickSort(left, index - 1);
		if (index < right)
			quickSort(index, right);
	}

	private int findParrtition(int left, int right) {
		int i = left, j = right;
		T pivotElement = arr[(left + right) / 2];
		while (i <= j) {
			while (arr[i].compareTo(pivotElement) < 0)
				i++;
			while (arr[j].compareTo(pivotElement) > 0)
				j--;
			if (i <= j) {
				T tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
		}
		return i;
	}

	public void mergeSort(int min, int max) {
		int left, right;
		if (min == max)
			return;
		int size = max - min + 1;
		int pivot = (max + min) / 2;
		T[] tmp = (T[]) new Comparable[size];
		mergeSort(min, pivot);
		mergeSort(pivot + 1, max);
		for (int i = 0; i < tmp.length; i++) {
			tmp[i] = arr[min + i];
		}
		left = 0;
		right = pivot - min + 1;
		for (int i = 0; i < tmp.length; i++) {
			if (right <= max - min)
				if (left <= pivot - min)
					if (tmp[left].compareTo(tmp[right]) > 0)
						arr[i + min] = tmp[right++];
					else
						arr[i + min] = tmp[left++];
				else
					arr[i + min] = tmp[right++];
			else
				arr[i + min] = tmp[left++];
		}
	}
	// public static <T> T[] createArray(int n) {
	// T[] arrInts = (T[]) new Comparable[n];
	// Random r = new Random();
	// for (int i = 0; i < n; i++) {
	// arrInts[i] = r.n
	// }
	// return arrInts;
	// }
	//
	// public static void printArray(int[] arrInts) {
	// System.out.println("Gía trị của mảng là: ");
	// for (int i = 0; i < arrInts.length; i++) {
	// System.out.printf("%4d", arrInts[i]);
	// }
	// }

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder();
		if (arr.length == 0)
			output.append("[ ]");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				output.append(arr[i] + " ");
		}
		return output.toString();
	}
}
