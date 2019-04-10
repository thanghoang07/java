package lab3_by_thanh_hai;

public class Bai1 {
	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.addNode("Toan", 1);
		list1.addNode("Van",2);
		list1.addNode("Ly", 3);
		list1.addNode("Hoa", 4);

		list1.addNode("Toan", 5);
		list1.addNode("Toan", 6);
		
		list1.addNode("###", 1);
		list1.addNode("///", 0);
		// xoa mot nut
		list1.remove("Van");
		// thay doi noi dung mot nut
		list1.set("Tin hoc", 3);
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		System.out.println(list1.toString());
		//test ham count
		System.out.println("-So lan xuat hien cua phan tu 'Toan': " + list1.count("Toan") + " lan");
		//kich thuoc danh sach
		System.out.println("Kich thuoc cua danh sach la: " + list1.size());
	}
}
