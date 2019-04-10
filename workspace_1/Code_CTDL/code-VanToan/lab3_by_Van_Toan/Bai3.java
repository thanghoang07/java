package lab3_by_Van_Toan;

public class Bai3 {
	public static void main(String[] args) {
		LinkedList<Integer> myList = new LinkedList<Integer>();
		LinkedList<Integer> otherList = new LinkedList<Integer>();

		myList.add(65);
		myList.add(18);
		myList.add(39);
		myList.add(4, 27);
		myList.addFirst(34);
		myList.addLast(89);
		myList.addLast(12);

		System.out.println("Danh sách liên kết myList: ");
		System.out.println(myList);
		System.out.println("Danh sách liên kết sau khi chia:");
		myList.divideAt(otherList, 18);
		System.out.print("myList: ");
		System.out.println(myList);
		System.out.print("otherList: ");
		System.out.println(otherList);

		
	}
}
