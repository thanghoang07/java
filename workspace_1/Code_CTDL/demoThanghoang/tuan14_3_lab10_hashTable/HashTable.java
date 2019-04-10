package tuan14_3_lab10_hashTable;

import java.io.*;
import java.util.*;

public class HashTable {
	private Node[] node;
	private int tableSize = 26;

	// constructor
	public HashTable() throws IOException {
		node = new Node[tableSize];
		for (int i = 0; i < node.length; i++) {
			node[i] = null;
		}
		init();
	}

	// xây dựng từ điển
	public void init() throws IOException {
		File file = new File("dictionary2.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()){
		String s =sc.nextLine();
		String[] str = s.split(":");
		put(str[0], str[1]);
		}
		sc.close();
	}

	public int keyHashTable(String key) {
		return (int) key.charAt(0) - 97;
	}

	// insert
	public void put(String key, String value) {
		if (node[keyHashTable(key)] == null) {
			node[keyHashTable(key)] = new Node(key, value);
		} else {
			Node entry = node[keyHashTable(key)];
			while (entry.next != null && !entry.getKey().equals(key)) {
				entry = entry.next;
			}
			entry.next = new Node(key, value);
		}
	}
	//
	public String get(String key) {
		if (node[keyHashTable(key)] == null)
			return "";
		else {
			Node entry = node[keyHashTable(key)];
			while (entry != null && !entry.key.equals(key))
				entry = entry.next;
			if (entry == null)
				return "";
			else
				return entry.value;
		}
	}

	// tra tu dien
	public void translate(String key) {
		if (get(key) == "") {
			System.out.println("tu nay chua co trong tu dien");
		} else
			System.out.println(key + " :" + get(key));
	}

	// xem theo ki tu dau
	public void viewFirst(String key) {
		Node e = node[keyHashTable(key)];// lấy ra node mà chứa kí tự đầu để search
		while (e != null) {
			System.out.println(keyHashTable(key) + ". " + e.key + ": " + e.value);
			e = e.next;
		}
	}

	// xem toan bo tu dien
	public void viewAll() {
		for (int i = 0; i < tableSize; i++) {
			Node e = node[i];
			while (e != null) {
				System.out.println(keyHashTable(e.key) + ". " + e.key + " :" + e.value);
				e = e.next;
			}
		}
	}

	// xoa 1 tu
	public void remove(String key) {
		Node e = node[keyHashTable(key)];
		Node tmp = null;
		while (e != null && !e.key.equals(key)) {
			tmp = e;
			e = e.next;
		}
		tmp.next = e.next;
	}

	// xoa toan bo tu dien
	public void deleteAll() {
		for (int i = 0; i < node.length; i++) {
			node[i] = null;
		}
	}

}
