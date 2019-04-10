package demo_linked_list;

import java.util.Scanner;

public class LinkedList<T> implements LinkedListinterface<T>
{
	private Node<T> head;
	private Node<T> tail;
	private static LinkedList<Integer> list1;
	private static Scanner nhapVao;
	
	@Override
	public void chenVaoDau(T item) 
	{
		Node<T> newNode = new Node<T>(item, head);
		head = newNode;
	}

	@Override
	public void chenVaoCuoi(T item)
	{
		if(head == null)
			chenVaoDau(item);
		else
		{
			Node<T> newNode = new Node<T>(item, null);
			Node<T> tmp = head;
			while(tmp.next != null)
				tmp = tmp.next;
			tmp.next = newNode;
		}		
	}

	@Override
	public void chenVao(T item, int index) 
	{
		/*Node<T> tmp = head;
		while (item != tmp && tmp != null)
		{
			tmp = tmp.next;
		}
		if(head == null)
			chenVaoDau(item);
		else 
		{
			index.next = tmp.next;
			tmp.next = index;
		}*/
		/*Node<T> tmp = new Node<T>(item, null);
		tmp.setData(item);
		System.out.println("them vao: " + item);
		if(head == null)
		{
			head = tmp;
			tail = tmp;
		}
		else
		{
			tail.setNext(tmp);
			tail = tmp;
		}*/


	}
	@Override
	public void chenNhieu(T[] a)
	{
		int i, n;
		n = a.length;
		for(i = 0; i <n ;i++)
			chenVaoCuoi(a[i]);
	}

	@Override
	public void xoa(T key)
	{
		Node<T> cur = head;
		Node<T> prev = null;
		if(head == null)
		{
			System.out.println("loi rui!!!!!");
		}
		else if(head.getData().equals(key))
		{
			head = head.next;
			return;
		}
		while(cur != null 
				&& !cur.getData().equals(key))
		{
			prev = cur;
			cur = cur.next;
		}
		if(cur == null)
		{
			System.out.println("loi rui!!!");
		}
		prev.next = cur.next;		
	}
	public String toString()
	{
		String tmpStr = "[";
		Node<T> tmp = head;
		while(tmp.next != null)
		{
			tmpStr += tmp.getData() + " ";
			tmp = tmp.next;
		}
		return tmpStr + "]";		
	}

	@Override
	public int size()
	{
		Node<T> tmp = head;
		int count = 0;
		while(tmp.next != null)
		{
			++count;
			tmp = tmp.next;
		}
		return count;
	}

	@Override
	public int thayDoiMotNode(T item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void layMotNode(int index) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void inRa()
	{
		Node<T> tmp = head;
		boolean isDone = false;
		while (!isDone) 
		{
			System.out.print(tmp.getData() + " ");
			if (tmp.getNext() == null)
			{
				isDone = true;
			}
			tmp = tmp.getNext();
		}
		System.out.println();
	}

	@Override
	public void xoaPhanTuDau()
	{
		if(head == null)
			System.out.println("loi rui!!");
		Node<T> tmp = head;
		
		head = head.getNext();
		tmp.setNext(null);
	}

	@Override
	public void xoaPhanTuCuoi(T key) 
	{
		Node<T> tmp = head;
		if(tmp == null)
		{
			while(tmp.next != null)
			{
				tmp = tmp.next;
			}
		}
		tmp = null;
	}
	public static void main(String[] args)
	{
		list1 = new LinkedList<Integer>();
		
		System.out.print("1.Danh sach lien ket la: \n");
		// them vao
		list1.chenVaoDau(3);
		list1.chenNhieu(null);
		list1.chenVaoDau(2);		
		list1.inRa();
		//lay khich thuoc
		System.out.print("Khich thuoc cua danh sach lien ket: \n" 
				+ list1.size() + "\n");
		nhapVao = new Scanner(System.in);	
		//chen
		System.out.println("Nhap so de chen: ");
		int num = nhapVao.nextInt();
		System.out.println("Nhap vi tri chen: ");
		int viTri = nhapVao.nextInt();
		if (viTri <= 1 )
		{
			list1.chenVaoDau(num);
			System.out.print("In ra danh sach lien ket da chen: \n");
			list1.inRa();
			System.out.print("Khich thuoc cua danh sach lien ket: \n" 
					+ list1.size() + "\n");
		}
		else if(viTri > list1.size())
		{
			list1.chenVaoCuoi(num);
			System.out.print("In ra danh sach lien ket da chen: \n");
			list1.inRa();
			System.out.print("Khich thuoc cua danh sach lien ket: \n" 
					+ list1.size() + "\n");
		}
		else
		{
			System.out.print("In ra danh sach lien ket da chen: \n");
			list1.inRa();
			System.out.print("Khich thuoc cua danh sach: \n" 
					+ list1.size() + "\n");
		}		
		//xoa phan tu dau danh sach
		System.out.print("Xoa phan tu dau dang sach: \n");
		list1.xoaPhanTuDau();
		System.out.print("In ra danh sach lien ket da chen: \n");
		list1.inRa();
		System.out.print("Khich thuoc cua danh sach: \n" 
				+ list1.size() + "\n");
		//Xoa mot Node
		System.out.println("Nhap vi tri de xoa: ");
		int viTri1 = nhapVao.nextInt();
		list1.xoa(viTri1);
		System.out.print("In ra danh sach lien ket da xoa: \n");
		list1.inRa();
		System.out.print("Khich thuoc cua danh sach lien ket: \n" 
				+ list1.size() + "\n");
		//toString
		System.out.println("8.In danh sach lien ket theo toString\n" 
				+ list1.toString());
	}

	
}
