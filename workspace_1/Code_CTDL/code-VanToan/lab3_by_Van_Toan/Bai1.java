package lab3_by_Van_Toan;

public class Bai1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(65);
		list.add(18);
		list.add(39);
		list.add(4, 27);
		list.addFirst(34);
		list.addLast(89);
		list.addLast(12);

		System.out.println("Danh sách liên kết : ");
		System.out.println(list);

		// Lay 1 node ra xem noi dung
		System.out.printf("Câu 2. Nội dung của node vừa lấy ra: %d\n", list.get(3));

		// thay doi noi dung cua mot node
		System.out.println("Câu 3. Thay đổi nội dung của một node: ");
		list.set(2, 20);
		System.out.println(list);

		// xoa mot node cu
		System.out.println("Câu 5. Xóa một node cũ: ");
		list.remove(39);
		System.out.println(list);

		System.out.printf("Câu 6. Kích thước của danh sách: %d", list.size());

		System.out.printf("\nCâu 7. Số lần xuất hiện của một phẩn tử bất kỳ: %d", list.count(65));
	}
}
