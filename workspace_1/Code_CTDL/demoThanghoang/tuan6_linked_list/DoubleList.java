package tuan6_linked_list;
/*package tuan6;

import java.util.Iterator;

public class DoubleList<T> implements ListADT<T>
{
   protected DoubleNode<T> front,rear;
   protected int count;

   //-----------------------------------------------------------------
   //  Creates an empty list using the default capacity.
   //-----------------------------------------------------------------
   public DoubleList()
   {
      rear = null;
      front = null;
      count = 0;
   }


   //-----------------------------------------------------------------
   //  Removes and returns the last element in the list.
   //-----------------------------------------------------------------
   public T removeLast () throws EmptyCollectionException
   {
      T result;

      if (isEmpty())
         throw new EmptyCollectionException ("list");
      
      result = rear.getElement();
      rear = rear.getPrevious();
      
      if (rear==null)
        front = null;
      else
        rear.setNext(null);

      count--;

      return result;
   }

   //-----------------------------------------------------------------
   //  Removes and returns the first element in the list.
   //-----------------------------------------------------------------
   public T removeFirst() throws EmptyCollectionException
   {
      if (isEmpty())
         throw new EmptyCollectionException ("list");

      T result = front.getElement();
      front = front.getNext();

      if (front==null)
         rear = null;
      else
        front.setPrevious(null);
      
      count--;
 
      return result;
   }

   //-----------------------------------------------------------------
   //  Removes and returns the specified element.
   //-----------------------------------------------------------------
   public T remove (T element)
   {
      T result;
      DoubleNode<T> nodeptr = find (element);


      if (nodeptr == null)
      {
    	  
      }

      result = nodeptr.getElement();

      // check to see if front or rear
      if (nodeptr == front)
          result = this.removeFirst();
          
      else if (nodeptr == rear)
           result = this.removeLast();

           else
			{
             		nodeptr.getNext().setPrevious(nodeptr.getPrevious());
             		nodeptr.getPrevious().setNext(nodeptr.getNext());
				count--;
			}

      return result;
   }

   
   //-----------------------------------------------------------------
   //  Returns a reference to the element at the front of the list.
   //  The element is not removed from the list.  Throws an
   //  EmptyCollectionException if the list is empty.  
   //-----------------------------------------------------------------
   public T first() throws EmptyCollectionException
   {
      if (isEmpty())
         throw new EmptyCollectionException ("list"); 

      return front.getElement();
   }

   //-----------------------------------------------------------------
   //  Returns a reference to the element at the rear of the list.
   //  The element is not removed from the list.  Throws an
   //  EmptyCollectionException if the list is empty.  
   //-----------------------------------------------------------------
   public T last() throws EmptyCollectionException
   {
      if (isEmpty())
         throw new EmptyCollectionException ("list"); 

      return rear.getElement();
   }

   //-----------------------------------------------------------------
   //  Returns true if this list contains the specified element.
   //-----------------------------------------------------------------
   public boolean contains (T target)
   {
      return (find(target) != null);
   }

   //-----------------------------------------------------------------
   //  Returns a reference to the specified element, or
   //  null if it is not found.
   //-----------------------------------------------------------------
   private DoubleNode<T> find (T target)
   {
      boolean found = false;
      DoubleNode<T> traverse = front;
      DoubleNode<T> result = null;

      if (! isEmpty())
         while (! found && traverse != null)
            if (target.equals(traverse.getElement()))
               found = true;
            else
               traverse = traverse.getNext();

      if (found)
         result = traverse;

      return result;
   }

   //-----------------------------------------------------------------
   //  Returns true if this list is empty and false otherwise. 
   //-----------------------------------------------------------------
   public boolean isEmpty()
   {
      return (count == 0);
   }
 
   //-----------------------------------------------------------------
   //  Returns the number of elements currently in this list.
   //-----------------------------------------------------------------
   public int size()
   {
      return count;
   }

   //-----------------------------------------------------------------
   //  Returns an iterator for the elements currently in this list.
   //-----------------------------------------------------------------
   public Iterator<T> iterator()
   {
      return new DoubleIterator<T> (front, count);
   }

   //-----------------------------------------------------------------
   //  Returns a string representation of this list. 
   //-----------------------------------------------------------------
   public String toString()
   {
      String result = "";
      DoubleNode<T> traverse = front;

      while (traverse != null)
         { 
         result = result + (traverse.getElement()).toString() + "\n";
         traverse = traverse.getNext();
         }
      return result;
   }

}
*/