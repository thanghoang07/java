package javaBasic_0;

import java.io.*;
import java.util.Scanner;

public class Linked {
	public Linkedlist dau, cuoi;

	Linked() {
		dau = null;
		cuoi = null;
	}
	
	/* Insert node or create linked list */
	void chenVao(int value) {
		Linkedlist node = new Linkedlist(value);
		node.next = null;
		if(dau == null) {
			dau = cuoi = node;
			System.out.println("Linked list created successfully!");
		}
		else {
			cuoi.next = node;
			cuoi = node;
			System.out.println("Node inserted successfully!");
		}
	}

	/* Delete node from linked list */
	void delete() {
		int count = 0, number, i;
		Linkedlist node, node1;
		Scanner input = new Scanner(System.in);
		
		for(node = dau; node != null; node = node.next)
			count++;
		display();
		node = node1 = dau;
		System.out.println(count+" nodes available here!");
		System.out.println("Enter the node number which you want to delete:");
		number = Integer.parseInt(input.nextLine());
		if(number != 1) {
			if(number <= count) {
				for(i = 2; i <= number; i++)
					node = node.next;

				for(i = 2; i <= number-1; i++)
					node1 = node1.next;

				node1.next = node.next;
				node.next = null;
				node = null;
			}
			else
				System.out.println("Invalid node number!\n");
		}
		else {
			dau = node.next;
			node = null;
		}

		System.out.println("Node has been deleted successfully!\n");
	}

	/* Display linked list */
	void display() {
		Linkedlist node = dau;
		System.out.println("List of node:");
		while(node != null) {
			node.display();
			node = node.next;
		}
	}
}



