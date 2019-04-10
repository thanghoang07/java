package demo_1;

public class ListNode<T> {
	T data;
	ListNode<T> next;

	public ListNode(T data) {
		this.data = data;
		next = null;
	}
	public ListNode(T data, ListNode<T> next)
	{
		this.data = data;
		this.next = next;
	}
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	public ListNode<T> getNext()
	{
		return next;
	}
	public void setNext(ListNode<T> next)
	{
		this.next = next;
	}

}
