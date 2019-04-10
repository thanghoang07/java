package LTNC_12072012;

public class Demo {
	public static void main(String[] args) {
		int[] arrInts = { 7, 7, 5, 12, 5, 12, 7, 1, 5, 7 };
		printArray(arrInts);
		
		for (int i = 0; i < arrInts.length; i++) {
			System.out.printf("\nSo lan xuat hien cua %d la %d lan", arrInts[i], count(arrInts, arrInts[i]));
		}
		
	}
	public static int count(int[] arrInts, int k) {
		int count = 0;
		for (int i = 0; i < arrInts.length; i++) {
			if (arrInts[i] == k)
				count++;
		}
		return count;
	}
	public static void printArray(int[] arrInts) {
		for (int i = 0; i < arrInts.length; i++) {
			System.out.print(arrInts[i] + " ");
		}
	}
	
}
