package lab6_queue_by_thang_hoang;

import java.util.Scanner;

public class Bai2 
{
	private static Scanner nhapVao;
	public static void main(String[] args) 
	{
		System.out.println("-----------Array---------");
		ArrayQueue<Integer> bai2 = new ArrayQueue<>();
		bai2.enqueue(5);
		bai2.enqueue(11);
		bai2.enqueue(34);
		bai2.enqueue(67);
		bai2.enqueue(43);
		bai2.enqueue(55);
		System.out.print("nhap vao vi tri can chuyen: ");
		nhapVao = new Scanner(System.in);
		int a = nhapVao.nextInt();
		if(a <= bai2.size() && a != 0)
		{
			System.out.println("mang ban dau la: \n" + bai2);
			bai2.move(a);
			System.out.println("mang ban sau khi chuyen la: \n" + bai2);
		}
		else
		{
			System.out.println("vi tri khong hop le");
		}
		
		System.out.println("-----------List---------");
		ListQueue<Integer> bai2_2 = new ListQueue<Integer>();
		bai2_2.enqueue(5);
		bai2_2.enqueue(11);
		bai2_2.enqueue(34);
		bai2_2.enqueue(67);
		bai2_2.enqueue(43);
		bai2_2.enqueue(55);
		System.out.print("nhap vao vi tri can chuyen: ");
		nhapVao = new Scanner(System.in);
		int b = nhapVao.nextInt();
		if (b <= ListQueue.count && a != 0)
		{
			System.out.println("danh sach ban dau: \n" + bai2_2);
			bai2_2.moveNthFront(bai2_2, b);
			System.out.println("danh sach sau khi chuyen: \n" + bai2_2);
		} 
		else 
		{
			System.out.println("vi tri khong hop le");
		}
	}
}
