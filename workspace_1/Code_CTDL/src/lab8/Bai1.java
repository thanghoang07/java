package lab8;

public class Bai1 {

	public static final int ASD = 100;
	public static final int INT = 100;
	public static final double DOU = 1.4;
	public static final String STR = "Hoang";
	public static final Character CHA = '0';

	public static void main(String[] args) {
		ArraySearch<Integer> mangInt = new ArraySearch<>(ASD);
		ArraySearch<Double> mangDou = new ArraySearch<>(ASD);
		ArraySearch<String> mangStr = new ArraySearch<>(ASD);
		ArraySearch<Character> mangCha = new ArraySearch<>(ASD);

		Integer searchKeyInt = new Integer(INT);
		Double searchKeyDou = new Double(DOU);
		String searchKeyStr = new String(STR);
		Character searchKeyCha = new Character(CHA);

		System.out.println("=====Search sequential=====\n" + "-----------Integer-----------\n" + "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");
		
		mangInt.intsert(0);
		mangInt.intsert(-10);
		mangInt.intsert(-1);
		mangInt.intsert(-1000);
		mangInt.intsert(1);
		mangInt.intsert(100);
		mangInt.intsert(1000);
		mangInt.intsert(10000);
		mangInt.intsert(10);
		mangInt.intsert(-100);
		
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangInt + "\nSap xep: ");
		
		mangInt.mergeSort(0, 9);
		
		System.out.println(mangInt);

		if (mangInt.sequentialSearch(searchKeyInt) == -1) {
			System.out.println("Khong tim thay " + searchKeyInt + " o trong mang!!");
		} else {
			System.out
					.println("Search sequential " + searchKeyInt + " o vi tri so: " + mangInt.sequentialSearch(searchKeyInt));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangInt.clear();		
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString());
		
		//
		System.out.println("-----------Double-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou + "\nChen phan tu vao mang: ");	
		
		mangDou.intsert(1.12344);
		mangDou.intsert(99.5432);
		mangDou.intsert(43.43241);
		mangDou.intsert(5.8234);
		mangDou.intsert(5.612343);
		
		System.out.print(mangDou.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangDou + "\nSap xep: ");	
		
		mangDou.mergeSort(0, 4);		
		
		System.out.println(mangDou);
		
		if (mangDou.sequentialSearch(searchKeyDou) == -1) {
			System.out.println("Khong tim thay " + searchKeyDou + " o trong mang!!");
		} else {
			System.out
					.println("Search sequential " + searchKeyDou + " o vi tri so: " + mangDou.sequentialSearch(searchKeyDou));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangDou.clear();		
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou.toString());
		
		//
		System.out.println("-----------String-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr + "\nChen phan tu vao mang: ");
		
		mangStr.intsert("Thang");
		mangStr.intsert("Toan");
		mangStr.intsert("Duc");
		mangStr.intsert("Huy");
		mangStr.intsert("Van");
		
		System.out.print(mangStr.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangStr + "\nSap xep: ");
		
		mangStr.mergeSort(0, 4);
		
		System.out.println(mangStr);
		
		if (mangStr.sequentialSearch(searchKeyStr) == -1) {
			System.out.println("Khong tim thay " + searchKeyStr + " o trong mang!!");
		} else {
			System.out
					.println("Search sequential " + searchKeyStr + " o vi tri so: " + mangStr.sequentialSearch(searchKeyStr));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangStr.clear();		
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr.toString());
		
		//
		System.out.println("-----------Character-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha + "\nChen phan tu vao mang: ");

		mangCha.intsert('J');
		mangCha.intsert('H');
		mangCha.intsert('D');
		mangCha.intsert('R');
		mangCha.intsert('e');
		mangCha.intsert(CHA);
		
		System.out.print(mangCha.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangCha + "\nSap xep: ");
		
		mangCha.mergeSort(0, 4);	
		
		System.out.println(mangCha);
		
		if (mangCha.sequentialSearch(searchKeyCha) == -1) {
			System.out.println("Khong tim thay " + searchKeyCha + " o trong mang!!");
		} else {
			System.out
					.println("Search sequential " + searchKeyCha + " o vi tri so: " + mangCha.sequentialSearch(searchKeyCha));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangCha.clear();		
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha.toString());
		////////////////////////////////////////////////////
		System.out.println("=====Search binary=====\n" + "-----------Integer-----------\n" + "Kiem tra mang co rong khong: ");
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt + "\nChen phan tu vao mang: ");
		
		mangInt.intsert(0);
		mangInt.intsert(-10);
		mangInt.intsert(-1);
		mangInt.intsert(-1000);
		mangInt.intsert(1);
		mangInt.intsert(100);
		mangInt.intsert(1000);
		mangInt.intsert(10000);
		mangInt.intsert(10);
		mangInt.intsert(-100);
		
		System.out.print(mangInt.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangInt + "\nSap xep: ");
		
		mangInt.mergeSort(0, 9);
		
		System.out.println(mangInt);

		if (mangInt.binarySearch(searchKeyInt, 0, 9) == -1) {
			System.out.println("Khong tim thay " + searchKeyInt + " o trong mang!!");
		} else {
			System.out.println("Search binary " + searchKeyInt + " o vi tri so: " + mangInt.binarySearch(searchKeyInt, 0, 9));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangInt.clear();		
		System.out.print(mangInt.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangInt.toString());
		
		//
		System.out.println("-----------Double-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou + "\nChen phan tu vao mang: ");	
		
		mangDou.intsert(1.12344);
		mangDou.intsert(99.5432);
		mangDou.intsert(43.43241);
		mangDou.intsert(5.8234);
		mangDou.intsert(5.612343);
		
		System.out.print(mangDou.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangDou + "\nSap xep: ");	
		
		mangDou.mergeSort(0, 4);		
		
		System.out.println(mangDou);
		
		if (mangDou.sequentialSearch(searchKeyDou) == -1) {
			System.out.println("Khong tim thay " + searchKeyDou + " o trong mang!!");
		} else {
			System.out
					.println("Search sequential " + searchKeyDou + " o vi tri so: " + mangDou.binarySearch(searchKeyDou, 0, 4));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangDou.clear();		
		System.out.print(mangDou.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangDou.toString());
		
		//
		System.out.println("-----------String-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr + "\nChen phan tu vao mang: ");
		
		mangStr.intsert("Thang");
		mangStr.intsert("Toan");
		mangStr.intsert("Duc");
		mangStr.intsert("Huy");
		mangStr.intsert("Van");
		
		System.out.print(mangStr.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangStr + "\nSap xep: ");
		
		mangStr.mergeSort(0, 4);
		
		System.out.println(mangStr);
		
		if (mangStr.sequentialSearch(searchKeyStr) == -1) {
			System.out.println("Khong tim thay " + searchKeyStr + " o trong mang!!");
		} else {
			System.out
					.println("Search sequential " + searchKeyStr + " o vi tri so: " + mangStr.binarySearch(searchKeyStr, 0, 4));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangStr.clear();		
		System.out.print(mangStr.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangStr.toString());
		
		//
		System.out.println("-----------Character-----------\n" 
						+ "Kiem tra mang co rong khong: ");
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha + "\nChen phan tu vao mang: ");

		mangCha.intsert('J');
		mangCha.intsert('H');
		mangCha.intsert('D');
		mangCha.intsert('R');
		mangCha.intsert('e');
		mangCha.intsert('0');
		
		System.out.print(mangCha.isEmpty() ? "=>mang rong\n" : "=>mang ko rong\n");
		System.out.println("In mang: \n" + mangCha + "\nSap xep: ");
		
		mangCha.mergeSort(0, 5);	
		
		System.out.println(mangCha);
		
		if (mangCha.sequentialSearch(searchKeyCha) == -1) {
			System.out.println("Khong tim thay " + searchKeyCha + " o trong mang!!");
		} else {
			System.out
					.println("Search sequential " + searchKeyCha + " o vi tri so: " + mangCha.binarySearch(searchKeyCha, 0, 5));
		}		
		System.out.println("Xoa mang vua tao: ");
		mangCha.clear();		
		System.out.print(mangCha.isEmpty() ? "=>mang rong" : "=>mang ko rong");
		System.out.println(mangCha.toString());
		
	}

}
