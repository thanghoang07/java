package lab8;

public class ArraySearch<T extends Comparable<T>> {
	private T[] mang;
	private int num;
	public static final int ASD = 100;
	public static final int ABC = 100;
	public int demSoSanhSequentialSearch = 0, demSoSanhBinarySearch = 0, dem = 0;

	public ArraySearch(int max) {
		// constructor
		mang = (T[]) new Comparable[max]; // create the array
		num = 0; // no items yet
	}

	// put element into array
	public void intsert(T value) {
		mang[num] = value; // insert it
		num++; // increment size
	}

	public boolean isEmpty() {
		return num == 0;
	}

	public void clear() {
		for (int i = 0; i <= num; i++)
			mang[i] = null;
		num = 0;
	}

	// mergeSort
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
			tmp[i] = mang[min + i];
		}
		left = 0;
		right = pivot - min + 1;
		for (int i = 0; i < tmp.length; i++) {
			if (right <= max - min)
				if (left <= pivot - min)
					if (tmp[left].compareTo(tmp[right]) > 0)
						mang[i + min] = tmp[right++];
					else
						mang[i + min] = tmp[left++];
				else
					mang[i + min] = tmp[right++];
			else
				mang[i + min] = tmp[left++];
		}
	}

	public String toString() {
		StringBuilder inRa = new StringBuilder();
		if (mang.length == 0)
			inRa.append("[]");
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] != null)
				inRa.append("|" + mang[i] + "|");
		}
		return inRa.toString();
	}

	// sequentialSearch
	public int sequentialSearch(T searchValue) {
		/*
		 * for (int i = 0; i < mang.length; ++i) { if (value.equals(mang[i]))
		 * return i; } return -1;
		 */
		int i = 0;
		while (i != mang.length && mang[i] != searchValue) {
			i++;
			demSoSanhSequentialSearch++;
		}
		if (i > (mang.length - 1))
			return -1;
		return i;
	}

	// binarySearch
	public int binarySearch(T searchValue, int left, int right) {
		if (right < left) {
			return -1;
		}
		int mid = (left + right) / 2;
		demSoSanhBinarySearch++;
		if (0 > mang[mid].compareTo(searchValue)) {
			return binarySearch(searchValue, mid + 1, right);
		} else if (0 < mang[mid].compareTo(searchValue)) {
			return binarySearch(searchValue, left, mid - 1);
		} else {
			return mid;
		}
	}

	public int binaryAndSequentialSearch(T searchKey, int n) {
		if (n >= 15) {
			int left = 0;
			int right = n - 1;
			int mid = (left + right) / 2;
			int compare = mang[mid].compareTo(searchKey);
			if (right < left) {
				System.out.printf("Khong tim thay %s\n", searchKey);
				return -1;
			}
			dem++;
			if (0 > mang[mid].compareTo(searchKey)) {
				return binarySearch(searchKey, mid + 1, right);
			} else if (0 < mang[mid].compareTo(searchKey)) {
				return binarySearch(searchKey, left, mid - 1);
			} else {
				System.out.printf("Tim thay %s tai vi tri thu %s \n", searchKey, mid);
				return mid;
			}
		}

		int i = 0;
		while (i != mang.length && mang[i] != searchKey) {
			i++;
			dem++;
		}
		if (i > (mang.length - 1)) {
			System.out.printf("Khong tim thay %s\n", searchKey);
			return -1;
		}
		System.out.printf("Tim thay %s tai vi tri thu %s \n", searchKey, i);
		return i;
	}
}
