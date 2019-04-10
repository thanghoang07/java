package tuan14_1;

import java.util.*;

public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		/* Thêm giá trị tương ứng vào các key. */
		hmap.put(12, "Hà Nội");
		hmap.put(2, "Đà Nẵng");
		hmap.put(7, "Nha Trang");
		hmap.put(49, "Thành Phố Hồ Chí Minh");
		hmap.put(3, "Cà Mau");
		/* Hiện thị giá trị bên trong HashMap sử dụng Iterator */
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}

		/* Lấy ra giá trị dựa vào key */
		String var = hmap.get(2);
		System.out.println("Value at index 2 is: " + var);

		/* Xóa dữ liệu dựa vào key */
		hmap.remove(3);
		System.out.println("Map key and values after removal:");
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}

	}
}
