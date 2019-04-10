package tuan9;

public class Test 
{
	public static void main(String[] args) 
	{
		ArrayQueue<Integer> mang1 = new ArrayQueue<Integer>();
		System.out.println(mang1.isEmpty()? "=>mang trong" : "=>mang khong trong");
		mang1.enqueue(2);		mang1.enqueue(4);
		mang1.enqueue(6);		mang1.enqueue(8);
		mang1.enqueue(9);		mang1.enqueue(0);		
		System.out.println(mang1.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang1.toString());
		System.out.println(mang1.size());
		System.out.println("getFront: " + mang1.getFront());
		System.out.println("dequeue: " + mang1.dequeue());
		System.out.println(mang1.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang1.toString());
		System.out.println(mang1.size() + "\n");
		
		ArrayQueue<Double> mang2 = new ArrayQueue<Double>();
		System.out.println(mang2.isEmpty()? "=>mang trong" : "=>mang khong trong");
		mang2.enqueue(0.2);		mang2.enqueue(8.4);
		mang2.enqueue(0.6);		mang2.enqueue(8.8);
		mang2.enqueue(9.9);		mang2.enqueue(0.7);		
		System.out.println(mang2.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang2.toString());
		System.out.println(mang2.size());
		System.out.println("getFront: " + mang2.getFront());
		System.out.println("dequeue: " + mang2.dequeue());
		System.out.println(mang2.isEmpty()? "=>mang trong" : "=>mang khong trong");
		System.out.println(mang2.toString());
		System.out.println(mang2.size() + "\n");
		
		ListQueue<Integer> list1 = new ListQueue<Integer>();
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		list1.enqueue(2);		list1.enqueue(4);
		list1.enqueue(6);		list1.enqueue(8);
		list1.enqueue(9);		list1.enqueue(0);
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println(list1.toString());
		System.out.println(list1.getFront());
		list1.clear();
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println(list1.toString());
		list1.enqueue(2);		list1.enqueue(4);
		list1.enqueue(6);		list1.enqueue(8);
		list1.enqueue(9);		list1.enqueue(0);
		System.out.println("dequeue: " + list1.dequeue());
		System.out.println(list1.toString() + "\n");
		
		ListQueue<Double> list2 = new ListQueue<Double>();
		System.out.println(list2.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		list2.enqueue(0.2);		list2.enqueue(4.7);
		list2.enqueue(6.9);		list2.enqueue(8.9);
		list2.enqueue(9.9);		list2.enqueue(0.0);
		System.out.println(list2.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println(list2.toString());
		System.out.println(list2.getFront());
		list2.clear();
		System.out.println(list2.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println(list2.toString());
		list2.enqueue(0.2);		list2.enqueue(4.7);
		list2.enqueue(6.9);		list2.enqueue(8.9);
		list2.enqueue(9.9);		list2.enqueue(0.0);
		System.out.println("dequeue: " + list2.dequeue());
		System.out.println(list2.toString() + "\n");
	}
}
