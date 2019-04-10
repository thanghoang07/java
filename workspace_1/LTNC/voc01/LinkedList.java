public class LinkedList<T>
{
	private Node<T> head;
	private Node<T> last;
	
	public int size()
	{
		Node<T> tmp = head;
		int count = 0;
		while(tmp.next != null)
		{
			count++;
			tmp = tmp.next;
		}
		return count;
	}
	public LinkedList()
	{// tao node dau tien
		this.head = null;
		this.last = this.head;
	}
	public Node<T> getFirst()
	{
		return head;
	}
	public void setFirst(Node<T> first)
	{
		this.head = first;
	}
	public Node<T> getLast() 
	{
		return last;
	}
	public void setLast(Node<T> last)
	{
		this.last = last;
	}
	public void themVao(T item)
	{
		Node<T> linkNode = new Node<T>(item, head);
		// kiem tra xem no co phai Node dau tien hay khong
		if (this.head.getData() == null) 
		{
			head = linkNode;
			last = linkNode;
		} 
		else
		{
			last.setNext(linkNode);
			last = linkNode;
		}		
	}
	public void xoaDi(T item)
	{
		Node<T> cur = head;
		Node<T> prev = null;
		if(head == null)
		{
			System.out.println("loi rui!!!!!");
		}
		if(head.getData().equals(item))
		{
			head = head.next;
			return;
		}
		while(cur != null 
				&& !cur.getData().equals(item))
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
	public void themVaoDau(T obj)
	{
		head = new Node<T>(obj, head);
		//head = linkNode;
	}
	public void chenVaoDiemBatKy(T giaTri,int diemDo)
	{
		Node<T> nptr = new Node<T>(giaTri, null);
		Node<T> ptr = head;
		diemDo = diemDo - 1;
		for (int i = 0; i < size(); i++)
		{
			if(i == diemDo)
			{
				Node<T> tmp = ptr.getNext();
				ptr.setNext(nptr);
				nptr.setNext(tmp);
				break;
			}
			ptr = ptr.getNext();
		}
	}
	public void chenVaoCuoi(T item)
	{
		if(head == null)
			themVaoDau(item);
		else
		{
			Node<T> newNode = new Node<T>(item, null);
			Node<T> tmp = head;
			while(tmp.next != null)
				tmp = tmp.next;
			tmp.next = newNode;
		}
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
	
}
