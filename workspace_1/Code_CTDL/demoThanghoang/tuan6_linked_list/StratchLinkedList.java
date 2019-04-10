package tuan6_linked_list;

public class StratchLinkedList
{
	private Node1 head;
	private int size;

	public StratchLinkedList()
	{
		head = null;
		size = 0;
	}
	public void add(Object data)
	{
		Node1 temp = new Node1(data);
		Node1 curr = head;

		if (head == null)
		{
			head = temp;
		} 
		else
		{
			while (curr.getNext() != null)
			{
				curr = curr.getNext();
			}

			curr.setNext(temp);
		}
	}

	public void add(Object data, int index)
	{
		Node1 temp = new Node1(data);
		Node1 curr = head;

		if (index == 0)
		{
			temp.setNext(head);
			this.head = temp;
		} 
		else 
		{
			for (int i = 1; i < index; i++)
			{
				curr = curr.getNext();
			}
			temp.setNext(curr.getNext());
			curr.setNext(temp);
		}
		this.size++;
	}
	public void replace(Object data, int index)
	{
		Node1 curr = head;
		for (int i = 0; i < 0; i++)
		{
			curr = curr.getNext();
		}
		curr.setData(data);
	}
	public Object get(int index)
	{
		Node1 curr = head;
		for (int i = 0; i < index; i++)
		{
			curr = curr.getNext();
		}
		return curr.getData();
	}
	public void remove(int index)
	{
		Node1 curr = head;

		if (index == 0)
		{
			head = head.getNext();
		} 
		else
		{
			for (int i = 1; i < index; i++)
			{
				curr = curr.getNext();
			}
			curr.setNext(curr.getNext().getNext());
		}
		this.size--;
	}
	public int size()
	{
		return this.size;
	}
	public String toString()
	{
		String list = "";
		list += "[" + this.head.getData() + "]";

		Node1 curr = head.getNext();
		while (curr != null)
		{
			list += "[" + curr.getData() + "]";
			curr = curr.getNext();
		}
		return list;
	}
}
