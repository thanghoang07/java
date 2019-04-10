package tuan14_1;

import java.util.*;

public class HashSetDemo {
	public static void main(String[] args) {
        Set<String> objSet = new HashSet<String>();
        objSet.add("Patrick");
        objSet.add("Bill");
        objSet.add("Gene");
        objSet.add("Daniel");
        objSet.add("Claire");
        
        System.out.println("Contents of the set :");
        System.out.println(objSet);
        
        System.out.println("Size of the set : " + objSet.size());
        
        System.out.println("\nContents of the set after adding 2 elements :");
        objSet.add("Patrick");
        objSet.add("Yang Sun");
        System.out.println(objSet);
        System.out.println("Size of the set : " + objSet.size());
        
    }
}
