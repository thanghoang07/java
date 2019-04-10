package tuan10;

public class Sort {
	/*
	 * public static void swap(int a, int b) { int temp = a; a = b; b = temp; }
	 * public static void BubbleSort(int mang[], int n) { for (int i = 0; i < n
	 * - 1; i++) { for (int j = n - 1; j > i; j--) { if (mang[j] < mang[j - 1])
	 * swap(mang[j], mang[j - 1]); } } } public static void InsertionSort(int
	 * mang[], int n) { int x, temp; for (int i = 1; i < n; i++) { x = i - 1;
	 * temp = mang[i]; while (x >= 0 && mang[x] > temp) { mang[x + 1] = mang[x];
	 * x--; } mang[x + 1] = temp; } }
	 */
	public static int[] BubbleSort(int[] num) {
		int j;
		boolean flag = true; // set flag to true to begin first pass
		int temp; // holding variable

		while (flag) {
			flag = false; // set flag to false awaiting a possible swap
			for (j = 0; j < num.length - 1; j++) {
				if (num[j] < num[j + 1]) // change to > for ascending sort
				{
					temp = num[j]; // swap elements
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = true; // shows a swap occurred
				}
			}
		}
		return num;
	}

	public static void SelectionSort(int[] num) {
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
	}

	public static void InsertionSort(int[] num, int key) {
		int j; // the number of items sorted so far
		// the item to be inserted
		int i;
		for (j = 1; j < num.length; j++) // Start with 1 (not 0)
		{
			key = num[j];
			for (i = j - 1; (i >= 0) && (num[i] < key); i--) // Smaller values
																// are moving up
			{
				num[i + 1] = num[i];
			}
			num[i + 1] = key; // Put the key in its proper location
		}
	}
	/*public static void insertionSort(Object[] a) {

        for (int i=0;  i != a.length;  i = i+1) {
           Object itemToInsert = a[i];
           int j = i;
           while (j != 0  &&  a[j-1] > itemToInsert) {
              a[j] = a[j-1];  j = j-1;
           }
           a[j] = itemToInsert;
        }
     }*/

	public static <T> void inRa(int[] mang) {
		for (int i : mang) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] mang = { 2, 2, 4, 5, 6, 7, 8, 9, 2, 4, 2, 1, 0, 8 };
		inRa(mang);
		/*System.out.println("+");
		BubbleSort(mang);
		inRa(mang);
		System.out.println("++");
		SelectionSort(mang)*/;
		System.out.println("+++");
		InsertionSort(mang, 3);
		inRa(mang);
	}
}
