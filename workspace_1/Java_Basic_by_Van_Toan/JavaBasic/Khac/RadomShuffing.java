package Khac;

public class RadomShuffing {
	public static void main(String[] args) {
		double[] myList = new double[10];
		for (int i = 0; i < myList.length; i++) {
			// tao ra vi tri j ngau nhien
			int index = (int) (Math.random() * myList.length);
			System.out.print(index);
			System.out.println();
			// doi myList[i] vs myList[j]
			double temp = myList[i];
			myList[i] = myList[index];
			myList[index] = temp;
			System.out.print(myList[index] + "");
		}
	}
}
