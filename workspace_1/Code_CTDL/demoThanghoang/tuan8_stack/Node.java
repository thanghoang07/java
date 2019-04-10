package tuan8_stack;

public class Node<T>
{
	public T data;    public Node<T> next;  
	   public Node(T data) 
	   {  
		   this(data, null);    
	   }    
	   public Node(T data, Node<T> n) 
	   {  
		   this.data = data;  
		   next = n;  
	   }
	public T getData() {
		// TODO Auto-generated method stub
		return data;
	}
	public Node<T> getNext() {
		// TODO Auto-generated method stub
		return next;
	}
}
