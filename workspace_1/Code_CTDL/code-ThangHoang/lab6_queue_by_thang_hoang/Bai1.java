package lab6_queue_by_thang_hoang;

public class Bai1 
{
	public static void main(String[] args) 
	{
		System.out.println("<<<Array>>>\n--------Integer--------");		
		ArrayQueue<Integer> mang1 = new ArrayQueue<Integer>();
		System.out.println(mang1.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang1.toString() 
							+ "\nkich thuoc mang: " + mang1.size()
							+ "\nthem phan tu cho mang");
		mang1.enqueue(2);		mang1.enqueue(4);
		mang1.enqueue(6);		mang1.enqueue(8);
		mang1.enqueue(9);		mang1.enqueue(0);		
		System.out.println(mang1.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang1.isFull()? "=>mang da day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang1.toString() 
							+ "\nkich thuoc mang: " + mang1.size()
							+ "\ngetFront: " + mang1.getFront() 
							+ "\ndequeue: " + mang1.dequeue());
		System.out.println(mang1.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang1.toString() 
							+ "\nkich thuoc mang: " + mang1.size());
		mang1.enqueue(2);		mang1.enqueue(4);
		mang1.enqueue(6);		mang1.enqueue(8);
		mang1.enqueue(9);	
		System.out.println(mang1.isFull()? "=>mang day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang1.toString() 
							+ "\nkich thuoc mang: " + mang1.size() 
							+ "\n--------Double--------");
		
		ArrayQueue<Double> mang2 = new ArrayQueue<Double>();
		System.out.println(mang2.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang2.toString() 
							+ "\nkich thuoc mang: " + mang2.size()
							+ "\nthem phan tu cho mang");
		mang2.enqueue(2.2);		mang2.enqueue(4.6);
		mang2.enqueue(6.4);		mang2.enqueue(8.5);
		mang2.enqueue(9.3);		mang2.enqueue(0.10);		
		System.out.println(mang2.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang2.isFull()? "=>mang da day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang2.toString() 
							+ "\nkich thuoc mang: " + mang2.size()
							+ "\ngetFront: " + mang2.getFront() 
							+ "\ndequeue: " + mang2.dequeue());
		System.out.println(mang2.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang2.toString() 
							+ "\nkich thuoc mang: " + mang2.size());
		mang2.enqueue(3.2);		mang2.enqueue(4.5);
		mang2.enqueue(0.6);		mang2.enqueue(8.4);
		mang2.enqueue(9.5);	
		System.out.println(mang2.isFull()? "=>mang day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang2.toString() 
							+ "\nkich thuoc mang: " + mang2.size() 
							+ "\n--------String--------");
		ArrayQueue<String> mang3 = new ArrayQueue<String>();
		System.out.println(mang3.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang3.toString() 
							+ "\nkich thuoc mang: " + mang3.size() 
							+ "\nthem phan tu cho mang");
		mang3.enqueue("Toan");		mang3.enqueue("Huy");
		mang3.enqueue("Thang");		mang3.enqueue("A");
		mang3.enqueue("S");		mang3.enqueue("D");		
		System.out.println(mang3.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang3.isFull()? "=>mang da day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang3.toString() 
							+ "\nkich thuoc mang: " + mang3.size()
							+ "\ngetFront: " + mang3.getFront() 
							+ "\ndequeue: " + mang3.dequeue());
		System.out.println(mang3.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang3.toString() 
							+ "\nkich thuoc mang: " + mang3.size());
		mang3.enqueue("ASD");		mang3.enqueue("naoT");
		mang3.enqueue("yuH");		mang3.enqueue("gnahT");
		mang3.enqueue("A");	
		System.out.println(mang3.isFull()? "=>mang day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang3.toString() 
							+ "\nkich thuoc mang: " + mang3.size() 
							+ "\n--------Character--------");
		ArrayQueue<Character> mang4 = new ArrayQueue<Character>();
		System.out.println(mang4.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang4.toString() 
							+ "\nkich thuoc mang: " + mang4.size()
							+ "\nthem phan tu cho mang");
		mang4.enqueue('a');		mang4.enqueue('B');
		mang4.enqueue('A');		mang4.enqueue('c');
		mang4.enqueue('b');		mang4.enqueue('C');		
		System.out.println(mang4.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang4.isFull()? "=>mang da day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang4.toString() 
							+ "\nkich thuoc mang: " + mang4.size()
							+ "\ngetFront: " + mang4.getFront() 
							+ "\ndequeue: " + mang4.dequeue());
		System.out.println(mang4.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println("In mang: \n" + mang4.toString() 
							+ "\nkich thuoc mang: " + mang4.size());
		mang4.enqueue('d');		mang4.enqueue('E');
		mang4.enqueue('D');		mang4.enqueue('a');
		mang4.enqueue('e');	
		System.out.println(mang4.isFull()? "=>mang day" : "=>mang chua day");
		System.out.println("In mang: \n" + mang4.toString() 
							+ "\nkich thuoc mang: " + mang4.size() 
							+ "\n\n\n<<<List>>>\n--------Integer--------");		
		ListQueue<Integer> list1 = new ListQueue<Integer>();
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("them phan tu vao danh sach: ");
		list1.enqueue(2);		list1.enqueue(4);
		list1.enqueue(6);		list1.enqueue(8);
		list1.enqueue(9);		list1.enqueue(0);
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("In danh sach: " + list1.toString() 
							+ "\nkich thuoc: " + list1.size() 
							+ "\ngetFront: " + list1.getFront() 
							+ "\nclear: ");
		list1.clear();
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("kich thuoc: " + list1.size() 
							+ "\nIn danh sach: " + list1.toString() 
							+ "\nthem phan tu vao danh sach: ");
		list1.enqueue(2);		list1.enqueue(4);
		list1.enqueue(6);		list1.enqueue(8);
		list1.enqueue(9);		list1.enqueue(0);
		System.out.println("dequeue: " + list1.dequeue());
		System.out.println("In danh sach: " + list1.toString() 
							+ "\nkich thuoc: " + list1.size() 
							+ "\n--------Double--------");
		ListQueue<Double> list2 = new ListQueue<Double>();
		System.out.println(list2.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("them phan tu vao danh sach: ");
		list2.enqueue(2.2);		list2.enqueue(4.43);
		list2.enqueue(6.2);		list2.enqueue(8.67);
		list2.enqueue(9.4);		list2.enqueue(0.10);
		System.out.println(list2.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("In danh sach: " + list2.toString() 
							+ "\nkich thuoc: " + list2.size() 
							+ "\ngetFront: " + list2.getFront() 
							+ "\nclear: ");
		list2.clear();
		System.out.println(list2.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("kich thuoc: " + list2.size() 
							+ "\nIn danh sach: " + list2.toString() 
							+ "\nthem phan tu vao danh sach: ");
		list2.enqueue(87.2);		list2.enqueue(4.56);
		list2.enqueue(9.656);		list2.enqueue(8.34);
		list2.enqueue(7.9);		list2.enqueue(0.1);
		System.out.println("dequeue: " + list2.dequeue());
		System.out.println("In danh sach: " + list2.toString() 
							+ "\nkich thuoc: " + list2.size() 
							+ "\n--------String--------");
		ListQueue<String> list3 = new ListQueue<String>();
		System.out.println(list3.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("them phan tu vao danh sach: ");
		list3.enqueue("Toan");		list3.enqueue("naoT");
		list3.enqueue("Huy");		list3.enqueue("yuH");
		list3.enqueue("Thang");		list3.enqueue("gnahT");
		System.out.println(list3.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("In danh sach: " + list3.toString() 
							+ "\nkich thuoc: " + list3.size() 
							+ "\ngetFront: " + list3.getFront() 
							+ "\nclear: ");
		list3.clear();
		System.out.println(list3.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("kich thuoc: " + list3.size() 
							+ "\nIn danh sach: " + list3.toString() 
							+ "\nthem phan tu vao danh sach: ");
		list3.enqueue("ASD");		list3.enqueue("AAA");
		list3.enqueue("ASD");		list3.enqueue("SAD");
		list3.enqueue("SDA");		list3.enqueue("XXX");
		System.out.println("dequeue: " + list3.dequeue());
		System.out.println("In danh sach: " + list3.toString() 
							+ "\nkich thuoc: " + list3.size() 
							+ "\n--------Character--------");
		ListQueue<Character> list4 = new ListQueue<Character>();
		System.out.println(list4.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("them phan tu vao danh sach: ");
		list4.enqueue('2');		list4.enqueue('A');
		list4.enqueue('6');		list4.enqueue('T');
		list4.enqueue('9');		list4.enqueue('O');
		System.out.println(list4.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("In danh sach: " + list4.toString() 
							+ "\nkich thuoc: " + list4.size() 
							+ "\ngetFront: " + list4.getFront() 
							+ "\nclear: ");
		list4.clear();
		System.out.println(list4.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println("kich thuoc: " + list4.size() 
							+ "\nIn danh sach: " + list4.toString() 
							+ "\nthem phan tu vao danh sach: ");
		list4.enqueue('N');		list4.enqueue('4');
		list4.enqueue('H');		list4.enqueue('8');
		list4.enqueue('G');		list4.enqueue('0');
		System.out.println("dequeue: " + list4.dequeue());
		System.out.println("In danh sach: " + list4.toString() 
							+ "\nkich thuoc: " + list4.size() 
							+ "\n");
	}
}
