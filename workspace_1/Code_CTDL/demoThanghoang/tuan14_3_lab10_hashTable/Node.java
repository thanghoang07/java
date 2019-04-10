package tuan14_3_lab10_hashTable;

public class Node {
	String key;
	String value;
	Node next;

	Node(String key, String value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}

	public String getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}
