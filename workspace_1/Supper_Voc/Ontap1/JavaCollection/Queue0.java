package JavaCollection;

import java.util.*;

public class Queue0 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.offer("Oklahoma");
		queue.offer("Indiana");
		queue.offer("Georgia");
		queue.offer("Texas");
		System.out.println("\nPrint Queue: \n" + queue);
		while (queue.size() > 0) {
			System.out.print(queue.remove() + " ");
		}
		///////////////////////////////////////////
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		queue1.offer("Oklahoma");
		queue1.offer("Indiana");
		queue1.offer("Georgia");
		queue1.offer("Texas");
		System.out.println("\nPriority queue using Comparable:");
		System.out.println("\nPrint Queue: \n" + queue1);
		while (queue1.size() > 0) {
			System.out.print(queue1.remove() + " ");
		}
		///////////////////////////////////////////
		PriorityQueue<String> queue2 = new PriorityQueue<String>(4, Collections.reverseOrder());
		queue2.offer("Oklahoma");
		queue2.offer("Indiana");
		queue2.offer("Georgia");
		queue2.offer("Texas");
		System.out.println("\nPriority queue using Comparator:");
		System.out.println("\nPrint Queue: \n" + queue2);
		while (queue2.size() > 0) {
			System.out.print(queue2.remove() + " ");
		}
	}
}
