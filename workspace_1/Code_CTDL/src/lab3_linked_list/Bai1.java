package lab3_linked_list;

import java.util.NoSuchElementException;

public class Bai1<T> implements LinkedListInterface<T>
{
	final static int ASD = 4;
	Node<T> dau;
	
	int size;
	//Constructors
	public Bai1()
	{
		size = 0;
	}
	public Bai1(Node<T> dau)
	{
		this.dau = dau;
		size = 0;
	}
	public Bai1(T headData)
	{
		dau = new Node<T>(headData);
		size = 0;
	}
	//Methods
	private void kiemTraPhanTuIndex(int index)
	{
		if(index < 0 || size <= index)
			throw new IndexOutOfBoundsException("Index: " + index + ", Khich thuoc: " + size);
	}
	private void kiemTraViTriIndex(int index) {
        if (index < 0 || size < index)
            throw new IndexOutOfBoundsException("Index: " + index + ", Khich thuoc: " + size);
    }	
	public void themVaoDauDS(T item)
	{
		chenVaoDauDS(item);
		
	}
	@Override
	public void chenVaoDauDS(T item)
	{
		Node<T> newNode = new Node<T>(item);
		newNode.next = dau;
		dau = newNode;
		size++;		
	}

	@Override
	public void themVaoCuoiDS(T item)
	{
		if (dau == null)
            chenVaoDauDS(item);
        else 
        {
            Node<T> x = dau;
            while (x.next != null)
                x = x.next;

            x.next = new Node<T>(item);
            size++;
        }		
	}

	@Override
	public void themVaoDS(int index, T item) 
	{
		kiemTraViTriIndex(index);

        if (index == 0)
            chenVaoDauDS(item);
        else {
            Node<T> x = dau;
            for (int i = 0; i < index - 1; i++)
                x = x.next;

            x.next = new Node<T>(item, x.next);
            size++;
        }		
	}

	@Override
	public T xoaPhanTuDauDS()
	{
		if (size == 0)
            throw new NoSuchElementException();
        else {
            Object temp = dau.getData();
            dau = dau.next;
            size--;
            return (T) temp;
        }		
	}

	@Override
	public T xoaPhanTuCuoiDS() 
	{
		if (size <= 1)
            return xoaPhanTuDauDS();
        else {
            Node<T> x = dau;

            while (x.next.next != null)
                x = x.next;

            Object temp = x.next.getData();
            x.next = null;
            size--;
            return (T) temp;
        }		
	}

	@Override
	public void xoaPhanTu(int index)
	{
		Node<T> curr = dau;
		if(index == 0)
		{
			dau = dau.getNext();
		}
		else
		{
			for(int i = 1; i < index; i++)
			{
				curr = curr.getNext();
			}
			curr.setNext(curr.getNext().getNext());
		}
		this.size--;
	}
	
	@Override
	public T layMotNode(int index)
	{
		kiemTraPhanTuIndex(index);

        Node<T> x = dau;
        for (int i = 0; i < index; i++)
            x = x.next;

        return x.getData();
	}

	@Override
	public void thayDoiMotNode(int index, T item) 
	{
		Node<T> cur = dau;
		for(int i = 0; i < index; i++)
		{
			cur = cur.getNext();
		}
		cur.setData(item);	
	}
	@Override
	public int demSoNode() 
	{
		int count = 0;
		Node<T> newNode = dau;
		while(newNode != null)
		{
			count++;
			newNode = newNode.next;
		}
		return count;
	}
	@Override
	public void inRaDS()
	{
		Node<T> tmp = dau;
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
	
	public int size() 
	{
        return size;		
    }
	public String toString()
	{
		return "[ " + toString(dau) + " ]";
	}
	public String toString(Node<T> item)
	{
		String tamS = " ";
		if(item != null)
		{
			tamS = item.getData().toString();
			if(item.next != null)
			{
				tamS = tamS + "," + toString(item.next);
			}
		}
		return tamS;
	}
	/*public String toString1()
	{
		StringBuilder inRa = new StringBuilder("[");
		
		Node<T> curr = dau;
		for (int i = 0; i < size; i++) {
			inRa.append(curr.)
		}
	}*/
	public void lietKe(int n)
	{
		
	}
	public void divideAt(Bai1<T> otherList,T key)
	{
		Node<T> curr = dau;
		while((curr.next != null) && (!curr.next.getData().equals(key)))
				curr = curr.next;
		Node<T> tmp = curr.next;
		if(curr.next.getData().equals(key))
			curr.setNext(null);
		while(tmp != null)
		{
			otherList.themVaoCuoiDS(tmp.getData());
			tmp = tmp.next;	
		}
	}
	public static void main(String[] args) 
	{
		Bai1<Integer> list2 = new Bai1<Integer>();		
		
		list2.themVaoDauDS(7);
		list2.themVaoDauDS(5);
		list2.themVaoDauDS(10);
		list2.themVaoDS(3, 4);
		list2.themVaoDS(4, 8);
		list2.themVaoDS(1, 9);
		list2.themVaoDS(0, 2);
		list2.themVaoCuoiDS(11);
		list2.themVaoCuoiDS(13);
		list2.themVaoCuoiDS(19);
		list2.inRaDS();
		
		System.out.println("1.In danh sach theo toString: \n" +list2);
		System.out.println("2.lay khich thuoc: " + list2.size());
		System.out.println("3.lay node " + ASD + " ra: " + list2.layMotNode(ASD));
		System.out.println("4.xoa node : ");
		list2.xoaPhanTu(3);
		list2.inRaDS();
		System.out.println("lay khich thuoc sau khi xoa: " + list2.size());
		System.out.println("4.1.xoa node cuoi: " + list2.xoaPhanTuCuoiDS());
		list2.inRaDS();
		System.out.println("lay khich thuoc sau khi xoa: " + list2.size());
		System.out.println("5.thay doi node " + ASD + ": " );
		list2.thayDoiMotNode(ASD, ASD + 11);
		list2.inRaDS();
		System.out.println("lay khich thuoc sau khi thay doi: " + list2.size());
		System.out.println("");
		list2.divideAt(list2, 2);
	}
	
}
