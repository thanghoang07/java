package demo_1;

import tuan10.Node;

public class ListNode1 {
	int val;
	ListNode1 next;
 
	ListNode1(int x) {
		val = x;
		next = null;
	}
	public ListNode1(int data, ListNode1 next)
	{
		this.val = data;
		this.next = next;
	}
	public int getData()
	{
		return val;
	}
	public void setData(int data)
	{
		this.val = data;
	}
	public ListNode1 getNext()
	{
		return next;
	}
	public void setNext(ListNode1 next)
	{
		this.next = next;
	}
}
