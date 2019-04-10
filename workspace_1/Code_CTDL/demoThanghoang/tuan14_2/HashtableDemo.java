package tuan14_2;

import java.util.*;

public class HashtableDemo {
	public static void main(String args[]) {
		// Creating Hashtable for example
		Hashtable companies = new Hashtable();
		// Java Hashtable example to put object into Hashtable
		// put(key, value) is used to insert object into map
		companies.put("Google", "United States");
		companies.put("Nokia", "Finland");
		companies.put("Sony", "Japan");
		// Java Hashtable example to get Object from Hashtable
		// get(key) method is used to retrieve Objects from Hashtable
		companies.get("Google");
		// Hashtable containsKey Example
		// Use containsKey(Object) method to check if an Object exits as key in
		// hashtable
		System.out.println("Does hashtable contains Google as key: " + companies.containsKey("Google"));
		// Hashtable containsValue Example
		// just like containsKey(), containsValue returns true if hashtable
		// contains specified object as value
		System.out.println("Does hashtable contains Japan as value: " + companies.containsValue("Japan"));
		// Hashtable enumeration Example
		// hashtabl.elements() return enumeration of all hashtable values
		Enumeration enumeration = companies.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println("hashtable values: " + enumeration.nextElement());
		}
		// How to check if Hashtable is empty in Java
		// use isEmpty method of hashtable to check emptiness of hashtable in
		// Java
		System.out.println("Is companies hashtable empty: " + companies.isEmpty());
		// How to find size of Hashtable in Java
		// use hashtable.size() method to find size of hashtable in Java
		System.out.println("Size of hashtable in Java: " + companies.size());
		// How to get all values form hashtable in Java
		// you can use keySet() method to get a Set of all the keys of hashtable
		// in Java
		Set hashtableKeys = companies.keySet();
		// you can also get enumeration of all keys by using method keys()
		Enumeration hashtableKeysEnum = companies.keys();
		// How to get all keys from hashtable in Java
		// There are two ways to get all values form hashtalbe first by using
		// Enumeration and second getting values ad Collection
		Enumeration hashtableValuesEnum = companies.elements();
		Collection hashtableValues = companies.values();
		// Hashtable clear example
		// by using clear() we can reuse an existing hashtable, it clears all
		// mappings.
		companies.clear();
	}
}
