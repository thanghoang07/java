package tuan9;

public class Test1 
{
	private static final int ADS = 15;
	
	public static void main(String[] args) 
	{
		ArrayQueue1<Integer> mang1 = new ArrayQueue1<Integer>();
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
		System.out.println(mang1.size());
		
		ArrayQueue1<Double> mang2 = new ArrayQueue1<Double>();
		System.out.println(mang1.isEmpty()? "=>mang trong" : "=>mang khong trong");
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
		System.out.println(mang2.size());
		
		ListQueue1<Integer> list1 = new ListQueue1<Integer>();
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		list1.enqueue(2);		list1.enqueue(4);
		list1.enqueue(6);		list1.enqueue(8);
		list1.enqueue(9);		list1.enqueue(0);
		System.out.println(list1.isEmpty()? "=>danh sach trong" : "=>danh sach khong trong");
		System.out.println(list1.toString());
		System.out.println(list1.getFront());
	}
}
