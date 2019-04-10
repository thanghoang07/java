package lab3_by_thanh_hai;

public class Bai3 {
	public static void main(String[] args) {
		MyList<Integer> myList = new MyList<Integer>();
		MyList<Integer> otherList = new MyList<Integer>();
		myList.addNode(34, 1);
		myList.addNode(65, 2);
		myList.addNode(18, 3);
		myList.addNode(39, 4);
		myList.addNode(27, 5);
		myList.addNode(89, 6);
		myList.addNode(12, 7);
		
		System.out.println("Danh sach MyList vua tao la: ");
		System.out.println(myList.toString());
		myList.divideAt(otherList, 18);
		System.out.println("Danh sach sau khi chia la: ");
		System.out.print("MyList:\t\t");
		System.out.println(myList.toString());
		System.out.print("OtherList:\t");
		System.out.println(otherList.toString());
	}
}
