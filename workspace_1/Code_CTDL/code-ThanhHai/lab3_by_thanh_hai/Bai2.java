package lab3_by_thanh_hai;

public class Bai2 {
	public static void main(String[] args) {
		DoublyLinkedList<String> dLinkedListString = new DoublyLinkedList<String>();
		
		dLinkedListString.addLast("Xanh");
		dLinkedListString.addFirst("Cam");
		dLinkedListString.addLast("Do");
		
		dLinkedListString.addNode("Den", 1);
		
		//test ham xoa
		dLinkedListString.remove("Xanh");
		// thay doi dung mot nut
		dLinkedListString.set("Nau", 2);
		DoublyLinkedList<Integer> dLinkedListInteger = new DoublyLinkedList<Integer>();
		System.out.println(dLinkedListString.toString());
		//test ham count
		System.out.println("-So lan xuat hien cua Xanh: " + dLinkedListString.count("Xanh"));
		//kich thuoc danh sach
		System.out.println("Kich thuocc cua danh sach la: " + dLinkedListString.size());
	}
}
