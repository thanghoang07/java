package demo_2_2_1;

public class DoubleLinkedList<Double>
{
	final static int ASD = 0;
	
    protected int size;              // list size
    protected DoubleNode<Double> head; // first elt

    public DoubleLinkedList()
    {
        size = 0;
    }
    public DoubleLinkedList (DoubleNode<Double> head)
    {
    	this.head = head;
    	size = 0;
    }
    public void add(int item)
    {
        addToHead(item);
    }
    
    public void addToHead(int item)
    {
        DoubleNode<Double> newNode = new DoubleNode<Double>(item);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public double removeFromHead()
    {
    	DoubleNode<Double> temp = head;
        head = head.next;
        return size--;
       
    }

    public void addToTail(double item)
    {
    	DoubleNode<Double> temp = new DoubleNode<Double>(item);
        if (head != null) {
            
        	DoubleNode<Double> cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.setNext(temp);
        } else
            head = temp;
        size++;
    }

    public double removeFromTail()
    {
    	DoubleNode<Double> cur = head;
    	DoubleNode<Double> prev = null;
        while (cur.getNext() != null) 
        { 
            prev = cur;
            cur = cur.next;
        }
        if (prev == null)
        {
            head = null;
        } 
        else 
        {
           prev.setNext(null);
        }
        size--;
        return (double) cur.getData();
    }

    public double peek()
    
    {
        return (double) head.getData();
    }

    public double tailPeek()
    {
    	DoubleNode<Double> cur = head;
        if ( cur == null )
            return -1 ;  
        else 
        {
            while ( cur.getNext() != null ) 
                cur = cur.next;
            return (double) cur.getData();
        }
    }

    public boolean contains(double value)
    {
    	DoubleNode<Double>  cur = head;
        while (cur != null &&  cur.getData() != value)
        {
            cur = cur.next;
        }
        return  (cur != null);
    }

    public void remove(double value)
    {
    	DoubleNode<Double>  curr = head;
    	DoubleNode<Double>  prev = null;
        while (curr != null && curr.getData() != value) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) 
        {
            if (prev == null) 
            { 
                head = curr.next;
            } 
            else
            {          
                prev.setNext(curr.next);
            }
            //current.getData();
            curr.setNext(curr.getNext().getNext());
        }
        this.size--;
    }
    private void kiemTraPhanTuIndex(int index)
	{
		if(index < 0 || size <= index)
			throw new IndexOutOfBoundsException("Index: " + index + ", Khich thuoc: " + size);
	}
    public double layNode(int index)
    {
    	kiemTraPhanTuIndex(index);
    	
    	DoubleNode<Double> x = head;
    	for(int i = 0; i < index; i++)
    		x = x.next;
    	return x.getData();
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        return size() == 0;
    }    
    public void clear()
    {
        head = null;
        size = 0;
    }
    public String toString()
    {
        StringBuffer s = new StringBuffer();
        s.append( "<DoubleList:" );
        DoubleNode<Double>  cur = head; 
        while ( cur != null ) 
        {
            s.append(" " + cur.getData()); 
            cur = cur.next;       
        }
        s.append(">");
        return s.toString();
    }
    public static void main(String[] args)
    {
    	DoubleLinkedList<Integer> list1 = new DoubleLinkedList<Integer>();
    	
    	list1.addToHead(22);
    	list1.add(2);
    	list1.add(4);
    	list1.addToTail(100);
    	
    	System.out.println("lay size: " + list1.size());
    	System.out.println(list1.toString());
    	System.out.println("Xem Node cuoi: " + list1.tailPeek());
    	
    	list1.remove(2);
    	list1.removeFromHead();
    	System.out.println("lay size: " + list1.size());
    	System.out.println(list1.toString());
    	System.out.println(list1.contains(100));//kiem tra coi cos phan tu can tim ko??
    	
    	System.out.println("3.lay node " + ASD + " ra: " + list1.layNode(ASD));
    	
    	list1.addToHead(10);
    	list1.addToHead(5);
    	System.out.println("lay size: " + list1.size());
    	System.out.println(list1.toString());
    	System.out.println("Xem Node cuoi: " + list1.tailPeek());
    	
    	
    	
	}
}
/*public class DoubleLinkedList<T> implements Iterable<T> 
{	
	protected int size;
	protected DoubleNode<T> head;
	protected DoubleNode<T> tail;
	public DoubleLinkedList()
	{
		head = null;
		tail = null;
		size = 0;

	}
	public void addFirst(T item)
	{
		DoubleNode<T> newNode = new DoubleNode<T>(item);
		
		if(size++ == 0)
		{
			head = tail = newNode;
		}
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}
	public DoubleNode<T> add(T item)
	{
		DoubleNode<T> newNode = new DoubleNode<T>(item);
		if(size++ == 0) 
        { 
            tail = newNode; 
        } 
        else 
        { 
            newNode.prev = head; 
            head.next = newNode; 
        }  
        head = newNode;  
        return newNode; 
	}
	public DoubleNode<T> enqueue(T item)
	{
		DoubleNode<T> newNode = new DoubleNode<T>(item);
		if(size++ == 0) 
        { 
            head = newNode; 
        } 
        else 
        { 
            newNode.next = tail; 
            tail.prev = newNode; 
        }  
        tail = newNode;  
        return newNode;
	}
	public void add(DoubleNode<T> newNode)
	{
		newNode.prev = head;
		newNode.next = null;
		
		if(size++ == 0)
		{
			tail = newNode;
		}
		else
		{
			head.next = newNode;
		}
		head = newNode;
	}
	public void add1(T obj) {
		DoubleNode<T> newNode = new DoubleNode<T>(obj);

		if(head == null) {
		    head = tail = newNode;
		} else {
		    tail.next = newNode;
		    newNode.prev = tail;
		    tail = newNode;
		}

		size = size + 1;
	    }
 
	public DoubleNode<T> addAfter(DoubleNode<T> node, T item)
	{
		DoubleNode<T> newNode = new DoubleNode<T>(item);
		addAfter(node, newNode);
		return newNode;
	}
	public void addAfter(DoubleNode<T> node, DoubleNode<T> newNode) 
    { 
        newNode.next = node.next; 
        newNode.prev = node; 
        node.next = newNode; 
        if(newNode.next == null) 
        { 
            head = newNode; 
        } 
        else 
        { 
            newNode.next.prev = newNode; 
        } 
        size++; 
    } 
	public void remove(DoubleNode<T> node) 
    { 
        if(node == tail) 
        { 
            tail = node.next; 
        } 
        else 
        { 
            node.prev.next = node.next; 
        }  
        if(node == head) 
        { 
            head = node.prev; 
        } 
        else 
        { 
            node.next.prev = node.prev; 
        } 
        size--; 
    } 
	public int size() 
    { 
        return size; 
    }  
    public Iterator<T> iterator() 
    { 
        return new DoublyLinkedListIterator(this); 
    }  
    protected class DoublyLinkedListIterator implements Iterator<T> 
    { 
        protected DoubleLinkedList<T> list; 
        protected DoubleNode<T> itr; 
        protected int length; 
 
        public DoublyLinkedListIterator(DoubleLinkedList<T> list) 
        { 
            this.length = list.size; 
            this.list = list; 
            this.itr = list.tail; 
        } 
 
        @Override 
        public boolean hasNext() 
        { 
            return itr != null; 
        } 
 
        @Override 
        public T next() 
        { 
            if(length != list.size) throw new ConcurrentModificationException(); 
            T next = itr.getData(); 
            itr = itr.next; 
            return next; 
        } 
 
        @Override 
        public void remove() 
        { 
            throw new UnsupportedOperationException(); 
        }  
    }  
    public T first() 
    { 
        return tail == null ? null : tail.getData(); 
    }  
    public T last() 
    { 
        return head == null ? null : head.getData(); 
    }  
    public DoubleNode<T> head() 
    { 
        return head; 
    }  
    public DoubleNode<T> tail() 
    { 
        return tail; 
    } 
 
    public boolean isEmpty() 
    { 
        return size == 0; 
    }  
    @SuppressWarnings("unchecked") 
    public T[] toArray() 
    { 
        T[] a = (T[])new Object[size]; 
        int i=0; 
        for(T v : this) 
        { 
            a[i++] = v; 
        } 
        return a; 
    } 
    private void kiemTraPhanTuIndex(int index)
	{
    	if(index < 0 || index >= size())
			throw new IndexOutOfBoundsException("Index: " + index + ", Khich thuoc: " + size);
    	if(index >= size())
			throw new IndexOutOfBoundsException("Index: " + index + ", Khich thuoc: " + size);
	}
    public T get(int index)
    {
    	kiemTraPhanTuIndex(index);
    	DoubleNode<T> X = head;
    	for (int i = 0;X != null && i < index; i++)
            	X = X.next;    	
    	return X.getData();
    }
    public String toString()
    {
        StringBuffer result = new StringBuffer("[");
        for (int i = 0; i < size; i++)
            {
                if (i > 0)
                    {
                        result.append(", ");
                    }
                result.append(get(i).toString());
            }
        result.append("]");

        return result.toString();
    }
    public void displayFrwd() 
    {
        System.out.print("Im ra danh sach [head--->tail] : ");
        DoubleNode<T> tempDisplay = head; // start at the beginning of linkedList
        while (tempDisplay != null)
        { // Executes until we don't find end of list.
               tempDisplay.displayNode();
               tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println("");
    }
    public String toString(DoubleNode<T> head2)
	{
		return "[ " + toString(head) + " ]";
	}
    public String toString1()
    // post: returns a string representing list
    {
        StringBuffer s = new StringBuffer();
        s.append( "<DoubleList: " );
        DoubleNode<T>  current = head; // start from the head node
        while ( current != null ) {
            s.append(" " + current.getData()); // append the data
            current = current.next;       // go to next node
        }
        s.append(">");
        return s.toString();
    }
    public static void main(String[] args)
    {
		DoubleLinkedList<Integer> list1 = new DoubleLinkedList<Integer>();
		list1.addFirst(100);
		list1.add1(2);
		list1.add1(1);
		list1.add1(2);
		list1.add1(3);
		list1.add1(4);
		list1.add1(3);
		DoubleNode<Integer> node2 = list1.add(4);
		list1.add(1);
		DoubleNode<Integer> node1 = list1.add(2);
		list1.addAfter(node1, 3);
		list1.addAfter(node2, 2);
		list1.addAfter(new DoubleNode<Integer>(1), 4);
		list1.addAfter(new DoubleNode<Integer>(0), 10);
		list1.add(6);
		list1.remove(node1);
		list1.displayFrwd();
		
		System.out.println("In danh sach theo toString:\n" + list1.toString1());
		System.out.println("lay kich thuoc: " + list1.size());
		
		System.out.println("lay mot node: " + list1.get(4));
		
		System.out.println("lay kich thuoc: " + list1.size());
		System.out.println("in ra: " + list1.toArray() + "\n");
		list1.toString();
		list1.display();
		list1.inRaDS();
	}*/
    /*public String toString()
	{
		return "[ " + toString(head) + " ]";
	}
	public String toString(DoubleNode<T> item)
	{
		String tamS = " ";
		if(item != null)
		{
			tamS = item.getData().toString();
			if(item.next != null)
			{
				tamS = tamS + "," + toString(item.next);
			}
		}
		return tamS;
	}
	public void inRaDS()
	{
		DoubleNode<T> tmp = head;
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
	public void display()
	{
		System.out.println("\n.....= ");
		if(size == 0)
		{
			System.out.print("empty\n");
			return;
		}
		if(head.getNext() == null)
		{
			System.out.println(head.getData());
			return;
		}
		DoubleNode<T> ptr = head;
		System.out.print(head.getData() + "->");
		ptr = head.getNext();
		while(ptr.getNext() != null)
		{
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getNext();
		}
		System.out.print(ptr.getData() + "\n");
	}*/
	/*private static class DoubleNode<T>
	{
		private T data;
		private DoubleNode<T> prec;
		private DoubleNode<T> next;
		
	}
	private int size;
	private DoubleNode<T> head;
	private DoubleNode<T> tail;
	
	public void addFirst(T item)
	{
		DoubleNode<T> newNode = new DoubleNode<T>();
		newNode.data = item;
		if(size == 0)
		{
			head = tail = newNode;
		}
		else
		{
			newNode.next = head;
			head.prec = newNode;
			head = newNode;
		}
		size++;
	}
	public void addLast(T item)
	{
		DoubleNode<T> newNode = new DoubleNode<T>();
		newNode.data = item;
		if(size == 0)
		{
			head = tail = newNode;
		}
		else
		{
			newNode.prec = tail;
			tail.prec = newNode;
			tail = newNode;
		}
		size++;
	}
	public T removeFirst()
	{
		T item = null;
		if(size > 0)
		{
			item = head.data;
			if(size == 1)
			{
				head = tail = null;
			}
			else
			{
				head = head.next;
				head.prec = null;
			}
			size--;
		}
		return item;
	}
	public T removeLast()
	{
		T item = null;
		if(size > 0)
		{
			item = tail.data;
			if(size == 1)
			{
				head = tail = null;
			}
			else
			{
				tail = tail.prec;
				tail.next = null;
			}
			size--;
		}
		return item;
	}
	private void insertAfter(DoubleNode<T> node, T item)
	{
		DoubleNode<T> newNode = new DoubleNode<T>();
		newNode.data = item;
		
		newNode.next = node.next;
		newNode.prec = node;
		if(newNode.next != null)
		{
			newNode.next.prec = newNode;
		}
		size++;
	}
	private void remove(DoubleNode<T> node)
	{
		if(node.prec != null)
		{
			node.prec.next = node.next;
		}
		else if(node.next != null)
		{
			node.next.prec = node.prec;
		}
		size--;
	}
}*/
