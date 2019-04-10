package tuan14_3_lab10_hashTable;

import java.io.*;

public class Dictionary3 {

	public static void main(String[] args) throws IOException {
		HashTable tab = new HashTable();
		tab.translate("like");
		System.out.println("xem toan bo tu dien: ");
		tab.viewAll();
		System.out.println();
		System.out.println("xem theo ki tu dau: ");
		tab.viewFirst("a");
		tab.remove("angel");
		System.out.println();
		System.out.println("sau khi xoa tu angel:");
		tab.viewAll();
	}
}
