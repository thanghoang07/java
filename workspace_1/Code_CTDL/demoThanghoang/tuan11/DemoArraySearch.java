package tuan11;

import java.util.Random;

public class DemoArraySearch<T extends Comparable<T>> {
	public static final int ASD = 1000;
	public static final int SDA = 200;
	private static int count;

	public static <T> int sequentialSearch(T[] mang, T value) {
		for (int i = 0; i < mang.length; ++i) {
			if (value.equals(mang[i]))
				return i;
		}
		return -1;
	}

	public int binarySearch(T[] mang, T value, int left, int right) {
		count++;
		if (left > right)
			return -1;
		int middle = (left + right) / 2;
		if (mang[middle].compareTo(value) == 0) {
			return middle;
		} else if (mang[middle].compareTo(value) > 0) {
			return binarySearch(mang, value, left, middle - 1);
		} else {
			return binarySearch(mang, value, middle + 1, right);
		}
	}

	public int binarySearch2(T[] mang, T value) {
		// null is never included in the list
		if (value == null) {
			return -1;
		}
		int left = 0, right = mang.length - 1;
		count++;
		while (left <= right) {
			int mid = (left + right) / 2;
			int rc = value.compareTo(mang[mid]);
			if (rc < 0) {
				// searchKey is less than list[i]
				right = mid - 1;
			} else if (rc > 0) {
				// searchKey is greater than list[i]
				left = mid + 1;
			} else {
				// found the item.
				return mid;
			}
		}
		return -1;
	}

	public void bubbleSort(T[] mang) {
		for (int i = 0; i < mang.length - 1; i++) {
			for (int j = 1; j < (mang.length - i); j++) {
				if ((((Comparable) (mang[j])).compareTo(mang[j - 1])) < 0) {
					T tmp = mang[j];
					mang[j] = mang[j - 1];
					mang[j - 1] = tmp;
				}
			}
			/*
			 * System.out.println("lan thu " + (i + 1) + " sap xep: \t" +
			 * Arrays.toString(mang));
			 */
		}
	}

	public static <T> void inRa(T[] mang) {
		for (T i : mang) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer arr1[] = new Integer[ASD];
		Random abc = new Random();
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = abc.nextInt(10);
		}
		Integer searchKey = new Integer(SDA);
		DemoArraySearch demo = new DemoArraySearch();
		System.out.println("mang chua sap xep: ");
		inRa(arr1);
		System.out.println("bubble sort: ");
		demo.bubbleSort(arr1);
		inRa(arr1);

		if (sequentialSearch(arr1, searchKey) == -1)
			System.out.println("Khong tim thay " + searchKey + " o vi tri nao trong mang");
		else
			System.out.println("Search sequential " + searchKey + " o vi tri so: "
					+ DemoArraySearch.sequentialSearch(arr1, searchKey));

		if (demo.binarySearch2(arr1, searchKey) == -1) {
			System.out.println("Khong tim thay " + searchKey + " o vi tri nao trong mang");
			System.out.println("so sanh: " + count);
		} else {
			System.out.println(
					"Search binary 2: " + searchKey + " o vi tri so: " + demo.binarySearch2(arr1, searchKey));
			System.out.println("so sanh: " + count);
		}
		if (demo.binarySearch(arr1, searchKey, 0, arr1.length) == -1) {
			System.out.println("Khong tim thay " + searchKey + " o vi tri nao trong mang");
			System.out.println("so sanh: " + count);
		} else {
			System.out.println("Search binary 1: " + searchKey + " o vi tri so: "
					+ demo.binarySearch(arr1, searchKey, 0, arr1.length));
			System.out.println("so sanh: " + count);
		}

	}
}
