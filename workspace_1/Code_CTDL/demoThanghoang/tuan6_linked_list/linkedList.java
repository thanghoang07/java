package tuan6_linked_list;

public class linkedList
{
	protected Node diemBatDau;
	protected Node diemKetThuc;	
	public int size;
	
	public linkedList()
	{
		diemBatDau = null;
		diemKetThuc = null;
		size = 0;		
	}
	public boolean isEmpty()
	{
		return diemBatDau == null;
	}
	public int getSize()
	{
		return size;
	}
	public void chenVaoDiemBatDau(int value)
	{
		Node nptr = new Node(value, null);
		size++;
		if(diemBatDau == null)
		{
			diemBatDau = nptr;
			diemKetThuc = diemBatDau;
		}
		else
		{
			nptr.setLink(diemBatDau);
			diemBatDau = nptr;
		}
	}
	public void chenVaoDiemKetThuc(int valuae)
	{
		Node nptr = new Node(valuae, null);
		size++;
		if(diemBatDau == null)
		{
			diemBatDau = nptr;
			diemKetThuc = diemBatDau;
		}
		else
		{
			diemKetThuc.setLink(nptr);
			diemKetThuc = nptr;
		}
	}
	public void chenVaoDiemBatKy(int valuae, int pos)
	{
		Node nptr = new Node(valuae, null);
		Node ptr = diemBatDau;
		pos = pos - 1;
		for (int i = 0; i < size; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.getLink();
				ptr.setLink(nptr);
				nptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size++;
	}
	public void xoaDiemBatKy(int pos)
	{
		if(pos == 1)
		{
			diemBatDau = diemBatDau.getLink();
			size--;
			return;
		}
		if(pos == size)
		{
			Node s = diemBatDau;
			Node t = diemBatDau;
			while(s != diemKetThuc)
			{
				t = s;
				s = s.getLink();				
			}
			diemKetThuc = t;
			diemKetThuc.setLink(null);
			size--;
			return;
		}
		Node ptr = diemBatDau;
		pos = pos - 1;
		for (int i = 0; i < size - 1; i++)
		{
			if(i == pos)
			{
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}
	public void display()
	{
		System.out.println("\n.....= ");
		if(size == 0)
		{
			System.out.print("empty\n");
			return;
		}
		if(diemBatDau.getLink() == null)
		{
			System.out.println(diemBatDau.getData());
			return;
		}
		Node ptr = diemBatDau;
		System.out.print(diemBatDau.getData() + "->");
		ptr = diemBatDau.getLink();
		while(ptr.getLink() != null)
		{
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}
}
