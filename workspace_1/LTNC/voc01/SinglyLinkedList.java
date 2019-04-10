import java.util.NoSuchElementException;

public class SinglyLinkedList {
    SinglyLinkedNode head;
    int size;

    // Constructors
    public SinglyLinkedList() {
        size = 0;
    }


    public SinglyLinkedList(SinglyLinkedNode head) {
        this.head = head;
        size = 0;
    }


    public SinglyLinkedList(Object headData) {
        head = new SinglyLinkedNode(headData);
        size = 0;
    }

    // Methods
    private void checkElementIndex(int index) {
        if (index < 0 || size <= index)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }


    private void checkPositionIndex(int index) {
        if (index < 0 || size < index)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
    }


    public void add(Object data) {
        addFirst(data);
    }


    public void addFirst(Object data) {
        SinglyLinkedNode e = new SinglyLinkedNode(data);
        e.next = head;

        head = e;
        size++;
    }


    public void addLast(Object data) {
        if (head == null)
            addFirst(data);
        else {
            SinglyLinkedNode x = head;

            while (x.next != null)
                x = x.next;

            x.next = new SinglyLinkedNode(data);
            size++;
        }
    }


    public void add(int index, Object data) {
        checkPositionIndex(index);

        if (index == 0)
            addFirst(data);
        else {
            SinglyLinkedNode x = head;

            for (int i = 0; i < index - 1; i++)
                x = x.next;

            x.next = new SinglyLinkedNode(data, x.next);
            size++;
        }
    }


    public Object get(int index) {
        checkElementIndex(index);

        SinglyLinkedNode x = head;
        for (int i = 0; i < index; i++)
            x = x.next;

        return x.data;
    }


    public int size() {
        return size;
    }


    public Object remove() {
        return removeFirst();
    }


    public Object removeFirst() {
        if (size == 0)
            throw new NoSuchElementException();
        else {
            Object temp = head.data;
            head = head.next;
            size--;
            return temp;
        }
    }


    public Object removeLast() {
        if (size <= 1)
            return removeFirst();
        else {
            SinglyLinkedNode x = head;

            while (x.next.next != null)
                x = x.next;

            Object temp = x.next.data;
            x.next = null;
            size--;
            return temp;
        }
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(0);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(3, 2);
        System.out.println(list);
        /*System.out.println(list.contains(0));
        System.out.println(list.contains(2));
        System.out.println(list.contains(5));*/
        System.out.println();

        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);

        /*list.set(0, "set");
        list.set(7, "set");*/
        System.out.println(list);


        list.removeFirst();
        list.removeLast();
        System.out.println(list);


        // Removes the item in the specified index
        /*list.remove(2);
        System.out.println(list);

        // Removes the first occurrence of the specified object
        list.remove(new Integer(1));
        System.out.println(list);

        list.removeFirst(2);
        System.out.println(list);

        list.removeLast(4);
        System.out.println(list);

        list.removeAll(5);
        System.out.println(list);*/

        list.remove();
        System.out.println(list);

        list.add("****");
        list.add("~~~~");
        list.add("....");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("lay size" + list.size());
        /*list.clear();
        System.out.println(list);*/
    }

}
