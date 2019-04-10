/*package khac;

public class SimpleList 
{
	private HeaderSimpleNode myList;

	 Các phương thức khởi dựng 
	public SimpleList()
	{
		myList = new HeaderSimpleNode();
	}

	 Phương thức chèn thêm một node vào vịtrí @position 
	public void chenVaoViTriBatKy(Node value, int position)
	{
		// Tạo một node mới
		SimpleNode newNode = new SimpleNode(value);
		if (position <= 0) 
		{ // Chèn vào đầu
			newNode.setNext(myList.getHeader());
			myList.setHeader(newNode);
			if (myList.getNodeNumber() == 0) // Danh sách ban đầu rỗng
				myList.setTailer(newNode);
		} 
		else if (position >= myList.getNodeNumber()) 
		{ // Chèn vào cuối
			if (myList.getNodeNumber() == 0)
			{ // Danh sách ban đầu rỗng
				myList.setHeader(newNode);
				myList.setTailer(newNode);
			} 
			else
			{ // Danh sách không rỗng
				myList.getTailer().setNext(newNode);
				myList.setTailer(newNode);
			}
		} 
		else
		{ // Chèn vào giữa
			int index = 0;
			SimpleNode prev = null;
			SimpleNode current = myList.getHeader();
			while (index < position)
			{
				index++;
				prev = current;
				current = current.getNext();
			}
			newNode.setNext(current);
			prev.setNext(newNode);
		}
		// Cập nhật sốlượng node của danh sách
		myList.setNodeNumber(myList.getNodeNumber() + 1);
	}

	 Phương thức loại bỏmột node ởvịtrí @position 
	public SimpleNode remove(int position)
	{
		if ((myList.getNodeNumber() == 0) 
				|| (position < 0) 
				|| (position >= myList.getNodeNumber()))
			return null;
		SimpleNode result = null;
		if (position == 0)
		{ // Loại phần tử đầu
			result = myList.getHeader();
			myList.setHeader(myList.getHeader().getNext());
			if (myList.getNodeNumber() == 1) // Danh sách chỉcó 1 phần tử
				myList.setTailer(null);
		} 
		else if 
		(position == myList.getNodeNumber() - 1) 
		{ // Loại phần tửcuối
			result = myList.getTailer();
			SimpleNode current = myList.getHeader();
			while (!current.getNext().equals(myList.getTailer()))
				current = current.getNext();
			current.setNext(null);
			myList.setTailer(current);
		} 
		else
		{ // Loại phần tửnằm giữa danh sách
			int index = 0;
			SimpleNode prev = null;
			SimpleNode current = myList.getHeader();
			while (index < position)
			{
				index++;
				prev = current;
				current = current.getNext();
			}
			prev.setNext(current.getNext());
			result = current;
		}
		// Cập nhật sốlượng node của danh sách
		myList.setNodeNumber(myList.getNodeNumber() - 1);
		result.setNext(null);
		return result;
	}

	 Phương thức duyệt toàn bộdanh sách 
	public Node[] travese()
	{
		// Danh sách rỗng
		if (myList.getNodeNumber() == 0)
			return null;
		// Danh sách không rỗng
		Node[] result = new Node[myList.getNodeNumber()];
		SimpleNode current = myList.getHeader();
		int index = 0;
		while (current != null) 
		{
			result[index] = current.getValue();
			index++;
			current = current.getNext();
		}
		return result;
	}
}
*/