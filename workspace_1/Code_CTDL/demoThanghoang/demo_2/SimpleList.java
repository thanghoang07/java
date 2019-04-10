package demo_2;

public class SimpleList {
	private HeaderSimpleNode myList;

	/*cac phuong thuc khoi tao*/
	public void SimpleNode() {
		myList = new HeaderSimpleNode();
	}

	/*phuong thuc chen them mot node vao vi tri position*/
	public void insert(Node value, int position)
	{
		//tao mot node moi
		SimpleNode newNode = new SimpleNode(value);
		if(position <= 0)
		{//chen vao dau
			newNode.setNext(myList.getHeader());
			myList.setHeader(newNode);
			if(myList.getNodeNumber() == 0)//danh sach ban dau trong
				myList.setTailer(newNode);
		}
		else if(position >= myList.getNodeNumber())
		//chen vao cuoi
			if(myList.getNodeNumber() == 0)
			{//danh sach ban dau trong
				myList.setHeader(newNode);
				myList.setTailer(newNode);
			}
			else
			{//danh sach khong rong
				myList.getTailer().setNext(newNode);
				myList.setTailer(newNode);
			}
			else
			{//chen vao giua
				int index = 0;
				SimpleNode prev = null;
				SimpleNode current = myList.getHeader();
				while(index < position)
				{
					index++;
					prev = current;
					current = current.getNext();
				}
				newNode.setNext(current);
				prev.setNext(newNode);
			}
		//cap nhap so luong node cua danh sach
		myList.setNodeNumber(myList.getNodeNumber() + 1);
	}
	/**/
	public SimpleNode remove(int position)
	{
		if((myList.getNodeNumber() == 0) 
				|| (position < 0) 
				|| (position >= myList.getNodeNumber()))
			return null;
		SimpleNode result = null;
		if(position == 0)
		{//loai phan tu dau
			result = myList.getHeader();
			myList.setHeader(myList.getHeader().getNext());
			if(myList.getNodeNumber() == 1)
				//danh sach chi co 1 phan tu
				myList.setTailer(null);
		}
		else if(position == myList.getNodeNumber() - 1)
		{//loai phan tu cuoi
			result = myList.getTailer();
			SimpleNode current = myList.getHeader();
			while(!current.getNext().equals(myList.getTailer()))
				current = current.getNext();
			current.setNext(null);
			myList.setTailer(current);
		}
		else
		{//loai phan tu nam o giua danh sach
			int index = 0;
			SimpleNode prev = null;
			SimpleNode current = myList.getHeader();
			while(index < position)
			{
				index++;
				prev = current;
				current = current.getNext();
			}
			prev.setNext(current.getNext());
			result = current;
		}
		//cap nhat so luong node cua danh sach
		myList.setNodeNumber(myList.getNodeNumber() - 1);
		result.setNext(null);
		return result;
	}
	/*phuong thuc duyet toan bo danh sach*/
	public Node[] travese()
	{//danh sach rong
		if(myList.getNodeNumber() == 0)
			return null;
	 //danh sach ko rong
		Node[] result = new Node[myList.getNodeNumber()];
		SimpleNode current = myList.getHeader();
		int index = 0;
		while(current != null)
		{
			result[index] = current.getValue();
			index++;
			current = current.getNext();
		}
		return result;
	}
}
