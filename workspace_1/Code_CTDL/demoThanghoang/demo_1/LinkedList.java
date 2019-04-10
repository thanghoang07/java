package demo_1;

import java.io.*;
import java.util.*;

/******************************************
 *
 * LinkedList: A circular (singly-linked) list with a last pointer and the
 * number of nodes.
 *
 ******************************************/

public class LinkedList {

	public class Node {
		public int item;
		public Node next;

		public Node(int newItem, Node newNext) {
			item = newItem;
			next = newNext;
		}
	}

	private Node last;
	private int nodeCount;
	private static Random generator = new Random(System.nanoTime());

	public LinkedList() {
		last = null;
		nodeCount = 0;
	}

	public int getSize() {
		return nodeCount;
	}

	/*******************************************
	 *
	 * insertNode: Insert a given node, newNode, into the list. Since the list
	 * is unordered and inserting at the front of the list is easiest, we'll
	 * insert there.
	 *
	 * Only special case: If the list is empty.
	 *
	 ********************************************/
	private void insertNode(Node newNode) {
		if (nodeCount == 0) {
			newNode.next = newNode;
			last = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
		}
		nodeCount++;
	}

	/*******************************************
	 *
	 * insertValue: Insert a given item, newItem, into the list. Since the list
	 * is unordered and inserting at the front of the list is easiest, we'll
	 * insert there.
	 *
	 * Only special case: If the list is empty.
	 *
	 ********************************************/
	private void insertValue(int newItem) {
		Node newNode = new Node(newItem, null);
		if (nodeCount == 0) {
			newNode.next = newNode;
			last = newNode;
		} else {
			newNode.next = last.next;
			last.next = newNode;
		}
		nodeCount++;
	}

	/***********************************************
	 *
	 * choosePivot: Randomly choose a pivot from the list, unlink it from the
	 * list and return a pointer to it.
	 *
	 * Assuming that the first node (last.next) is in position 0 and the last
	 * node is in position nodeCount-1, choose a random number, randomIndex, in
	 * the range 0 to nodeCount-1, and unlink the node in position randomIndex
	 * to be the pivot.
	 *
	 ************************************************/

	private Node choosePivot() {
		int randomIndex = generator.nextInt(nodeCount);
		Node pivot;
		Node prev;

		// *** PART 1 ***
		// simply use a for-loop to get the node at randomIndex
		// start at the first node (index 0), and keep grabbing the next node
		pivot = last.next;
		prev = last;
		for (int i = 0; i < randomIndex; i++) {
			prev = pivot;
			pivot = pivot.next;
		}

		// now we need to unhook pivot from the list
		// simply change prev.next to skip over pivot
		prev.next = pivot.next;
		nodeCount--;

		return pivot;
	} // end choosePivot

	/*******************************************
	 *
	 * partition: Given a node, pivot (not in the list), leave all the nodes
	 * containing items >= the pivot's item in the list and move all nodes
	 * containing items < the pivot's item into a new LinkedList. That is, at
	 * the end, the bigs remain in the list and the smalls are moved into a new
	 * list (which is returned).
	 *
	 * Create two LinkedLists smalls and bigs. Move each node in the calling
	 * LinkedList into the smalls or the bigs list (compare each node's item to
	 * pivot.item and then unlink it from the calling list and use method
	 * insertNode() to put it into the smalls or bigs).
	 *
	 * No Nodes should be created or destroyed by this method, and no item in a
	 * Node should be changed by this method. This method simply unlinks and
	 * links existing nodes.
	 *
	 *********************************************/

	public LinkedList partition(Node pivot) {
		LinkedList smalls = new LinkedList();
		LinkedList bigs = new LinkedList();
		Node curr;

		// *** PART 2 ***
		// walk through the list, removing nodes as we go, and adding them
		// to bigs or smalls as necessary
		for (int i = 0; i < nodeCount; i++) {
			// we'll always work on the first node in the list
			curr = last.next;

			// adjust the pointer coming out from last
			// so that we skip over curr
			last.next = curr.next;

			// add curr to the proper list
			// this will automatically change curr.next to point to
			// its new neighbour
			if (curr.item < pivot.item)
				smalls.insertNode(curr);
			else
				bigs.insertNode(curr);
		}

		last = bigs.last;
		nodeCount = bigs.nodeCount;

		return smalls;
	} // end partition

	/***********************************************
	 *
	 * rejoin: Given the sorted smalls list and a pointer to the pivot, relink
	 * into the sorted list (which contains the sorted bigs) into the correct
	 * positions.
	 *
	 ************************************************/

	private void rejoin(LinkedList smalls, Node pivot) {
		Node firstBig;

		smalls.insertNode(pivot); // insert pivot at front
		smalls.last = smalls.last.next; // pivot comes after all smalls

		// Now add smalls + pivot into the sorted bigs between
		// the last and first node.
		if (nodeCount != 0) {
			// There are some bigs.

			firstBig = this.last.next;
			this.last.next = smalls.last.next; // last big points at 1st small
			pivot.next = firstBig; // pivot at end of smalls points at 1st big
			nodeCount = nodeCount + smalls.nodeCount;
		} else {
			// There are no bigs.

			this.last = smalls.last;
			nodeCount = smalls.nodeCount;
		}

	} // end rejoin

	/***********************************
	 *
	 * quickSort: Recursively quick sort a a circular linked list with no dummy
	 * nodes.
	 *
	 * (Since the partition method puts the smalls into a new circular linked
	 * list, after the recursive calls, the smalls must be joined back into the
	 * list.)
	 * 
	 **************************************/
	public void quickSort() {
		Node pivot;
		LinkedList smalls;

		if (nodeCount > 2) {
			pivot = choosePivot(); // removes a pivot
			smalls = partition(pivot); // bigs stay in original list
			smalls.quickSort();
			quickSort(); // recursively quick sort the bigs
			rejoin(smalls, pivot); // rejoin into one circular list
		}
		if (nodeCount == 2) {
			if (last.item < last.next.item) {
				// swap them: first becomes last
				last = last.next;
			}
		}
		// else do nothing for nodeCount 0 or 1
	} // end quickSort

	/***********************************
	 *
	 * bubbleSort: do a bubble sort on the list This is completely optional, and
	 * was really just added for fun Implementing the bubble sort on a linked
	 * list is a very good way to get comfortable linking and unlinking nodes,
	 * swapping them around, and suchlike. You should be able to understand all
	 * the code here; nothing is new or significantly different than anything
	 * you've seen in class
	 * 
	 **************************************/
	public void bubbleSort() {
		// we need three node pointers; the current node we're looking at (curr)
		// next (the node after curr, that we may need to swap with curr)
		// and the node before curr (prev)
		Node prev;
		Node curr;
		Node next;

		// we never want to swap last with last.next, since that would be
		// swapping
		// the first and last items in the list -- something a bubble sort never
		// does. that's why we need the -1 in there
		for (int i = 0; i < nodeCount - 1; i++) {
			// set up the pointers to the current, previous, and next nodes
			prev = last;
			curr = last.next;
			next = curr.next;

			// do one iteration of the bubble sort
			for (int j = 0; j < nodeCount - i; j++) {
				// swap curr and next
				// to do this we simply point prev.next to skip over curr,
				// point curr.next to next.next, and next.next points to curr.
				// in ASCII art pictures:
				// BEFORE:
				// ... --> prev --> curr --> next --> next+1 --> ...
				// AFTER:
				// ... --> prev --> next --> curr --> next+1 --> ...
				if (curr.item > next.item) {
					prev.next = next;
					curr.next = next.next;
					next.next = curr;

				}
			}
		}
	}

	/***********************************
	 *
	 * isSorted: Returns true if the list is sorted, false otherwise.
	 * 
	 **************************************/
	public boolean isSorted() {
		boolean sorted = true;
		Node curr = last.next;

		if (nodeCount > 1) {
			do {
				if (curr.next.item < curr.item)
					sorted = false;
				curr = curr.next;
			} while ((curr != last) && sorted);
		}

		return sorted;
	} // end isSorted

	/***********************************
	 *
	 * printList: print out all the items in a list (for debugging purposes)
	 * 
	 **************************************/

	public void printList() {
		Node curr;

		if (nodeCount > 0) {
			curr = last.next;
			do {
				System.out.println(curr.item);
				curr = curr.next;
			} while (curr != last.next);
		}
	} // end printList

	/***********************************
	 *
	 * createRandomList: create a random list of 10000 items This was originally
	 * in main, but was moved to a separate method to avoid duplicate code
	 * 
	 **************************************/
	public static LinkedList createRandomList() {
		LinkedList list = new LinkedList();
		for (int i = 0; i < 10000; i++)
			list.insertValue(generator.nextInt(100000));

		return list;
	}

	public static void main(String[] args) {
		LinkedList list = createRandomList(), smalls;
		Node pivot;
		long start, stop, elapsed, diff;

		// Time the quicksort call.
		start = System.nanoTime();
		list.quickSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		System.out.println("Time for plain quick sort: " + elapsed + " nanoseconds.");
		System.out.println("Quick sort " + (list.isSorted() ? "" : "un") + "successfully sorted " + list.getSize()
				+ " elements.\n");

		diff = elapsed;

		// Just for fun let's see how a bubble sort compares to the quicksort.
		// This is completely optional, but implementing the bubble sort is
		// a very good exercise when it comes to linking and unlinking nodes
		// Time the bubble sort call.
		start = System.nanoTime();
		list.bubbleSort();
		stop = System.nanoTime();
		elapsed = stop - start;
		System.out.println("Time for bubble sort: " + elapsed + " nanoseconds.");
		System.out.println("Bubble sort " + (list.isSorted() ? "" : "un") + "successfully sorted " + list.getSize()
				+ " elements.\n");

		// print how much slower the bubble sort was
		diff = elapsed - diff;
		System.out.println("Bubble sort took " + diff + "ns longer");

	} // end main

} // end class LinkedList
