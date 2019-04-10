package demo_2_2;

public class DoubleList
{
	private HeaderDoubleNode myList;
	//cac phuong thuc khoi dung
	public DoubleList()
	{
		myList = new HeaderDoubleNode();
	}
	//chen them mot node vao vi tri pos
	public void chen(Node value, int pos)
	{
		//tao mot node moi
		DoubleNode newNode = new DoubleNode(value);
		if(pos <= 0)
		{//chen vao dau ds
			newNode.setNext(myList.getHead());
			myList.getHead().setPrev(newNode);
			myList.setHead(newNode);
			if(myList.getNodeNumber() == 0)
				//danh sach ban dau rong
				myList.setTail(newNode);
		}
		else if(pos >= myList.getNodeNumber())
		{//chen vao cuoi ds
			if(myList.getNodeNumber() == 0)
			{//danh sach ban dau rong
				myList.setHead(newNode);
				myList.setTail(newNode);
			}
			else
			{//danh sach khong rong
				newNode.setPrev(myList.getTail());
				myList.getTail().setNext(newNode);
				myList.setTail(newNode);
			}
		}
		else
		{//chen vao giua
			int index = 0;
			DoubleNode cur = myList.getHead();
			while(index < pos)
			{
				index++;
				cur = cur.getNext();
			}
			newNode.setNext(cur);
			newNode.setPrev(cur.getPrev());
			cur.getPrev().setNext(newNode);
			cur.setPrev(newNode);
		}
		//cap nhat so luong node cua ds
		myList.setNodeNumber(myList.getNodeNumber() + 1);
	}
	//phuong thuc loai bo mot node o vi tri pos
	public DoubleNode remove(int pos)
	{
		if((myList.getNodeNumber() == 0)||
			(pos < 0) || (pos >= myList.getNodeNumber()))
			return null;
		DoubleNode res = null;
		if(pos ==0)
		{//loai b phan tu dau
			res = myList.getHead();
			
			myList.setHead(myList.getHead().getNext());
			if(myList.getHead() != null)
				myList.getHead().setPrev(null);
			
			if(myList.getNodeNumber() != 1)
				//danh sach chi cp mot phan tu
				myList.setTail(null);
		}
		else if(pos == myList.getNodeNumber() - 1)
		{//loai phan tu cuoi
			res = myList.getTail();
			
			myList.setTail(myList.getTail().getPrev());
			myList.getTail().setNext(null);
		}
		else
		{//loai phan tu nam giua ds
			int index = 0;
			DoubleNode cur = myList.getHead();
			while(index < pos)
			{
				index++;
				cur = cur.getNext();
			}
			cur.getPrev().setNext(cur.getNext());
			cur.getNext().setPrev(cur.getPrev());
			res = cur;
		}
		//cap nhat so luong node cua ds
		myList.setNodeNumber(myList.getNodeNumber() - 1);
		
		res.setPrev(null);
		res.setNext(null);
		return res;
	}
	//phuong thuc duyet toan bo ds
	public Node[] trav()
	{//danh sach rong
		if(myList.getNodeNumber() == 0)
			return null;
		//danh sach ko rong
		Node[] res = new Node[myList.getNodeNumber()];
		DoubleNode cur = myList.getHead();
		int index = 0;
		while(cur != null)
		{
			res[index] = cur.getValue();
			index++;
			cur = cur.getNext();
		}
		return res;
	}
	public static void main(String[] args) 
	{
		DoubleList list3 = new DoubleList();
		
		//list3.chen(3, 0);
		
	}
}
