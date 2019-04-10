package tuan14_1;

import java.util.*;

public class HashTableDemo {

	public static void main(String args[]) {
		// tao mot hash map
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;

		balance.put("Zara", new Double(3434.34));
		balance.put("Mahnaz", new Double(123.22));
		balance.put("Ayan", new Double(1378.00));
		balance.put("Daisy", new Double(99.22));
		balance.put("Qadir", new Double(-19.08));

		// Hien thi tat ca balance trong hash table.
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
		System.out.println();
		// Gui 1,000 vao tai khoan cua Zara
		bal = ((Double) balance.get("Zara")).doubleValue();
		balance.put("Zara", new Double(bal + 1000));
		System.out.println("Balance moi cua Zara la: " + balance.get("Zara"));
		// Gui 10,000 vao tai khoan cua Ayan
		bal = ((Double) balance.get("Ayan")).doubleValue();
		balance.put("Ayan", new Double(bal + 10000));
		System.out.println("Balance moi cua Ayan la: " + balance.get("Ayan"));
		// Rut 1,000 khoi tai khoan cua Qadir
		bal = ((Double) balance.get("Qadir")).doubleValue();
		balance.put("Qadir", new Double(bal - 1000));
		System.out.println("Balance moi cua Qadir la: " + balance.get("Qadir") + "\n");

		// Hien thi tat ca balance trong hash table.
		names = balance.keys();
		while (names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ": " + balance.get(str));
		}
	}
}
