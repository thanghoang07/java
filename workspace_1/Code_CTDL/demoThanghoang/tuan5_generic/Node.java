package tuan5_generic;

public class Node
{
	int info;
	Node next;

	Node() {};

	Node(int x, Node p)
	{
		info = x;
		p = next;
	};

	Node(int x)
	{
		this(x, null);
	};

}
