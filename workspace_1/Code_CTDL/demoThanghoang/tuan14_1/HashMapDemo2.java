package tuan14_1;

import java.util.*;

public class HashMapDemo2 {
	public static void main(String[] args) {
		String[] data = new String("Nothing is as easy as it looks").split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String key : data) {
			Integer freq = hm.get(key);
			if (freq == null)
				freq = 1;
			else
				freq++;
			hm.put(key, freq);
		}
		System.out.println(hm);
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
