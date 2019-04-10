package test;


public class LinkedList2<T> {

    Node_1<T> head;
	private int i;

    public LinkedList2(Node_1<T> head) {
        this.head = head;
    }

   /* public void create() {
        LinkedList2<T> danhsach = new LinkedList2<T>(head);
    }*/

    public void addFirst(T item) {
        Node_1<T> node = new Node_1<T>(item, head);
        head = node;
    }

    public void addLast(T item) {
        if (head == null) {
            addFirst(item);
        } else {
        	Node_1<T> tmp = head;
        	Node_1<T> newNode = new Node_1<T>(item, null);
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }

            tmp.setNext(newNode);
        }
    }

    public void insertAfter(int key, T item) {
    	Node_1<T> tmp = head;
        while (tmp != null && !tmp.getData().equals(key)) {
            tmp = tmp.next;
        }
        if (tmp != null) {
            tmp.next = new Node_1<T>(item, tmp.next);
        }
    }

    public void insertBefore(int key, T toInsert) {
        if (head == null) {
            return;
        }
        if (head.getData().equals(key)) {
            addFirst(toInsert);
            return;
        }
        Node_1<T> prev = null;
        Node_1<T> cur = head;
        while (cur != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.next;
        }
        if (cur != null) {
            prev.next = new Node_1<T>(toInsert, cur);
        }
    }

    public void add(T key, int index) {
        if (head == null || index <= 1) {
            addFirst(key);
        } else if (index > size()) {
            addLast(key);
        } else {
            i = 1;
            Node_1<T> tmp = head;
            while (tmp != null && tmp.getNext().equals(index)) {
                tmp = tmp.next;
            }
            if (tmp != null) {
                tmp.next = new Node_1<T>(key, tmp.next);
            }
        }
    }

    public void remove(T key) {
        if (head == null) {
            throw new RuntimeException("cannot delete");
        }
        if (head.getData().equals(key)) {
            head = head.next;
            return;
        }
        Node_1<T> cur = head;
        Node_1<T> prev = null;
        while (cur != null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.next;
        }
        if (cur == null) {
            throw new RuntimeException("cannot delete");
        }
        //delete cur node
        prev.next = cur.next;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.getNext();
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.getNext() == null) {
            head = null;
        }
        Node_1<T> previous = head;
        Node_1<T> current = head;
        while (current.getNext() != null) {
            previous = current;
            current = current.getNext();
        }
        previous.setNext(null);
    }

    public int size() {
    	Node_1<T> tmp = head;
        int size = 0;
        while (tmp != null) {
            tmp = tmp.next;
            size++;
        }
        return size;
    }

    public int count(T data) {
    	Node_1<T> tmp = head;
        int count = 0;
            while (tmp.getData().equals(data)) {
                count++;
            }
        return count;
    }

    public String toString() {
        String s = "";
        s += "[";
        Node_1<T> current = head;
        while (current != null) {
            s += current.getData().toString() + ", ";
            current = current.getNext();
        }
        if (s.length() > 2) {
            s = s.substring(0, s.length() - 2);
        }
        s += "]";
        return s;
    }
    public void inRaDS()
	{
		Node_1<T> tmp = head;
		boolean isDone = false;
		while (!isDone) 
		{
			System.out.print("|" + tmp.getData() + "|");
			if (tmp.getNext() == null)
			{
				isDone = true;
			}
			tmp = tmp.getNext();
		}
		System.out.println();		
	}
    public static void main(String[] args) 
    {
    	LinkedList2<Integer> danhsach = new LinkedList2<Integer>(null);
    	
    	danhsach.add(3, 2);
    	danhsach.addFirst(4);
    	danhsach.addLast(100);
    	System.out.println(danhsach);
    	System.out.println("lay size: "+danhsach.size());
    	danhsach.inRaDS();
    	System.out.println("lay node: "+danhsach.count(1));
	}
}
