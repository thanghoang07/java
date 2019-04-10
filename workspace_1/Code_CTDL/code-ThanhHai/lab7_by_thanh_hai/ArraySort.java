package lab7_by_thanh_hai;

public class ArraySort<T extends Comparable<T>> {
	private T[] arr;
	private int nElems; // number of data items

	public ArraySort(int max) {
		// constructor
		arr = (T[]) new Comparable[max]; // create the array
		nElems = 0; // no items yet
	}

	// put element into array
	public void intsert(T value) {
		arr[nElems] = value; // insert it
		nElems++; // increment size
	}
	//Bubble Sort
	public void bubbleSort() {
		T tmp = null;
		for (int i = nElems - 1; i > 1; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	public void bubbleSortNew() {
		boolean swapped = true;
		int j = 0;
		T tmp;
		while (swapped) {
			swapped = false;
			j++;
			for (int i = 0; i < nElems - 1; i++) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					tmp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = tmp;
					swapped = true;
				}
			}
		}

	}
	//Selection Sort
	public void selectionSort() {
		int minIndex;
		for (int i = 0; i < nElems - 1; i++) {
			minIndex = i;
			for (int j = i + 1; j < nElems; j++) {
				if (arr[j].compareTo(arr[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				T tmp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = tmp;
			}
		}
	}
	//Insert Sort
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
	//Merga Sort
	public void mergeSort(int min, int max) {
		int left, right;
		// return if the list's lenghth = 1
		if (min == max)
			return;
		// find the length and the midpoint of the list
		int size = max - min + 1;
		int pivot = (max + min) / 2;
		T[] tmp = (T[]) new Comparable[size];
		// sort left half of the list
		mergeSort(min, pivot);
		mergeSort(pivot + 1, max);
		// copy sorted data to workspace
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
	//Quick Sort
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
			}// end if
		}// end while
		return i;
	}
	//toString
	public String toString() {
		StringBuilder stb = new StringBuilder();
		stb.append("[");
		for (int i = 0; i < nElems; i++) {
			stb.append(arr[i] + "\n");
//			if (i < nElems - 1) {
//				stb.append(", ");
//			}
		}
		stb.append(arr[nElems-1]+"]");
		//stb.append("]");
		return stb.toString();
	}
}
