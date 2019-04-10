package tuan9;

public class Node1<T>
{
	public T data;    public Node1<T> next;  
	   public Node1(T data) 
	   {  
		   this(data, null);    
	   }    
	   public Node1(T data, Node1<T> n) 
	   {  
		   this.data = data;  
		   next = n;  
	   }
	public T getData() {
		// TODO Auto-generated method stub
		return data;
	}
	public Node1<T> getNext() {
		// TODO Auto-generated method stub
		return next;
	}
}
