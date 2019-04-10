package lab5_stack;

public class Bai1 {
	private static final int ASD = 15;

	public static void main(String[] args) {
		// Array Stack
		System.out.println("<<Array Stack>>");
		// integer
		ArrayStack<Integer> mang1 = new ArrayStack<Integer>(ASD);
		System.out.println("-----------integer-----------");
		mang1.push(4);
		mang1.push(3);
		mang1.push(6);
		mang1.push(9);
		mang1.push(6);
		mang1.push(0);
		System.out.println("in mang: " + mang1.toString() + "\n\t*size: " + mang1.size() + "\n\t+peek: " + mang1.peek()
				+ "\nin mang: " + mang1.toString() + "\n\t*size: " + mang1.size());
		System.out.println(mang1.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("xoa mang: ");
		mang1.clear();
		System.out.println("in mang: " + mang1.toString() + "\n\t*size: " + mang1.size());
		System.out.println(mang1.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		mang1.push(1);
		mang1.push(3);
		mang1.push(5);
		mang1.push(7);
		mang1.push(9);
		mang1.push(0);
		mang1.push(8);
		mang1.push(6);
		mang1.push(4);
		mang1.push(2);
		System.out.println("in mang: " + mang1.toString() + "\n\t*size: " + mang1.size());
		System.out.println(mang1.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("\t+peek: " + mang1.peek() + "\n\t*size: " + mang1.size() + "\n\t+pop: " + mang1.pop()
				+ "\n\t*size: " + mang1.size() + "\n\t+pop: " + mang1.pop() + "\n\t*size: " + mang1.size()
				+ "\nin mang: " + mang1.toString() + "\n\t*size: " + mang1.size());
		System.out.println(mang1.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("xoa mang: ");
		mang1.clear();
		System.out.println("in mang: " + mang1.toString() + "\n\t*size: " + mang1.size());
		System.out.println(mang1.isEmpty() ? "=>mang trong" : "=>mang khong trong");

		// String
		System.out.println("-----------String-----------");
		ArrayStack<String> mang2 = new ArrayStack<String>(ASD);
		mang2.push("asd");
		mang2.push("bcd");
		mang2.push("sda");
		mang2.push("cdb");
		mang2.push("ads");
		mang2.push("dbc");
		System.out.println("in mang: " + mang2.toString() + "\n\t*size: " + mang2.size());
		System.out.println(mang2.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("\t*size: " + mang2.size() + "\n\t+peek: " + mang2.peek() + "\nin mang: " + mang2.toString()
				+ "\n\t*size: " + mang2.size());
		System.out.println(mang2.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("xoa mang: ");
		mang2.clear();
		System.out.println("in mang: " + mang2.toString() + "\n\t*size: " + mang2.size());
		System.out.println(mang2.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		mang2.push("asd");
		mang2.push("sda");
		mang2.push("ads");
		mang2.push("aaa");
		mang2.push("sss");
		mang2.push("ddd");
		mang2.push("bcd");
		mang2.push("cdb");
		mang2.push("dbc");
		mang2.push("bbb");
		mang2.push("ccc");
		mang2.push("ddd");
		System.out.println("in mang: " + mang2.toString() + "\n\t*size: " + mang2.size());
		System.out.println(mang2.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("\t+peek: " + mang2.peek() + "\n\t*size: " + mang2.size() + "\n\t+pop: " + mang2.pop()
				+ "\n\t*size: " + mang2.size() + "\n\t+pop: " + mang2.pop() + "\n\t*size: " + mang2.size()
				+ "\nin mang: " + mang2.toString() + "\n\t*size: " + mang2.size());
		System.out.println(mang2.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("xoa mang: ");
		mang2.clear();
		System.out.println("in mang: " + mang2.toString() + "\n\t*size: " + mang2.size());
		System.out.println(mang2.isEmpty() ? "=>mang trong" : "=>mang khong trong");

		// double
		System.out.println("-----------double-----------");
		ArrayStack<Double> mang3 = new ArrayStack<Double>(ASD);
		mang3.push(1.5);
		mang3.push(2.5);
		mang3.push(3.5);
		mang3.push(4.5);
		mang3.push(5.5);
		mang3.push(6.5);
		System.out.println("in mang: " + mang3.toString() + "\n\t*size: " + mang3.size());
		System.out.println(mang3.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("\t*size: " + mang3.size() + "\n\t+peek: " + mang3.peek() + "\nin mang: " + mang3.toString()
				+ "\n\t*size: " + mang3.size());
		System.out.println("xoa mang: ");
		mang3.clear();
		System.out.println("in mang: " + mang3.toString() + "\n\t*size: " + mang3.size());
		System.out.println(mang3.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		mang3.push(6.59);
		mang3.push(5.52);
		mang3.push(4.53);
		mang3.push(3.56);
		mang3.push(2.51);
		mang3.push(1.59);
		mang3.push(3.56);
		mang3.push(2.78);
		mang3.push(2.13);
		mang3.push(9.32);
		System.out.println("in mang: " + mang3.toString() + "\n\t*size: " + mang3.size());
		System.out.println(mang3.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("\t+peek: " + mang3.peek() + "\n\t*size: " + mang3.size() + "\n\t+pop: " + mang3.pop()
				+ "\n\t*size: " + mang3.size() + "\n\t+pop: " + mang3.pop() + "\n\t*size: " + mang3.size()
				+ "\nin mang: " + mang3.toString() + "\n\t*size: " + mang3.size());
		System.out.println(mang3.isEmpty() ? "=>mang trong" : "=>mang khong trong");
		System.out.println("xoa mang: ");
		mang3.clear();
		System.out.println("in mang: " + mang3.toString() + "\n\t*size: " + mang3.size());
		System.out.println(mang3.isEmpty() ? "=>mang trong" : "=>mang khong trong");

		// Linked List Stack
		System.out.println("\n\n<<Linked List Stack>>");
		ListStack<Integer> list1 = new ListStack<Integer>();
		// integer
		System.out.println("-----------integer-----------");
		list1.push(45);
		list1.push(415);
		list1.push(42);
		list1.push(433);
		list1.push(444);
		list1.push(232);
		System.out.println("in danh sach: " + list1.toString() + "\n\t*size: " + list1.size());
		System.out.println(list1.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("\t+peek: " + list1.peek() + "\n\t*size: " + list1.size() + "\n\t+pop: " + list1.pop()
				+ "\n\t*size: " + list1.size() + "\n\t+pop: " + list1.pop() + "\n\t*size: " + list1.size());
		list1.clear();
		System.out.println("in danh sach: " + list1.toString() + "\n\t*size: " + list1.size());
		System.out.println(list1.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");
		list1.push(11);
		list1.push(22);
		list1.push(33);
		list1.push(44);
		list1.push(55);
		list1.push(66);
		list1.push(77);
		list1.push(88);
		list1.push(99);
		list1.push(00);
		System.out.println("in danh sach: " + list1.toString() + "\n\t*size: " + list1.size());
		System.out.println(list1.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");

		// double
		ListStack<Double> list2 = new ListStack<Double>();
		System.out.println("-----------double-----------");
		list2.push(4.8);
		list2.push(7.2);
		list2.push(6.5);
		list2.push(0.7);
		list2.push(7.9);
		list2.push(2.8);
		System.out.println("in danh sach: " + list2.toString() + "\n\t*size: " + list2.size());
		System.out.println(list2.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("\n\tpeek: " + list2.peek() + "\n\t*size: " + list2.size() + "\n\t+pop: " + list2.pop()
				+ "\n\t*size: " + list2.size() + "\n\t+pop: " + list2.pop() + "\n\t*size: " + list2.size());
		list2.clear();
		System.out.println("in danh sach: " + list2.toString() + "\n\t*size: " + list2.size());
		System.out.println(list2.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");
		list2.push(1.1);
		list2.push(2.2);
		list2.push(3.3);
		list2.push(4.4);
		list2.push(5.5);
		list2.push(6.6);
		list2.push(7.7);
		list2.push(8.8);
		list2.push(9.9);
		list2.push(0.0);
		System.out.println("in danh sach: " + list2.toString() + "\n\t*size: " + list2.size());
		System.out.println(list2.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");

		// string
		ListStack<String> list3 = new ListStack<String>();
		System.out.println("-----------double-----------");
		list3.push("ASD");
		list3.push("DSA");
		list3.push("ADS");
		list3.push("DAS");
		list3.push("SDA");
		list3.push("SAD");
		System.out.println("in danh sach: " + list3.toString() + "\n\t*size: " + list3.size());
		System.out.println(list3.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("\t+peek: " + list3.peek() + "\n\t*size: " + list3.size() + "\n\t+pop: " + list3.pop()
				+ "\n\t*size: " + list3.size() + "\n\t+pop: " + list3.pop() + "\n\t*size: " + list3.size());
		list3.clear();
		System.out.println("in danh sach: " + list3.toString() + "\n\t*size: " + list3.size());
		System.out.println(list3.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");

		list3.push("AAA");
		list3.push("EEE");
		list3.push("SSS");
		list3.push("FFF");
		list3.push("DDD");
		list3.push("GGG");
		list3.push("BBB");
		list3.push("HHH");
		list3.push("CCC");
		list3.push("III");
		System.out.println("in danh sach: " + list3.toString() + "\n\t*size: " + list3.size());
		System.out.println(list3.isEmpty() ? "=>danh sach trong" : "=>danh sach khong trong");

	}
}
