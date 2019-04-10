package tuan14_1;

import java.util.*;

public class HashCodeDemo {
	public static void main(String[] args) {
		Integer obj1 = new Integer(2009);
		String obj2 = new String("2009");
		Double obj3 = new Double(123.56);
		Character obj4 = new Character('2');
		StringBuffer obj5 = new StringBuffer("2009"); 
		ArrayList<Integer> obj6 = new ArrayList<Integer>(); 
		obj6.add(new Integer(2009));
		String obj7 = new String("19999999999999999"); 
		Iterator obj8 = obj6.iterator(); 
		HashCodeDemo obj9 = new HashCodeDemo(); 
		
		System.out.println("Integer " + obj1 + " co hashCode for an integer is " + obj1.hashCode());
		System.out.println("String " + obj2 + " co hashCode for a string is " + obj2.hashCode());
		System.out.println("Double " + obj3 + " co hashCode for a Double is " + obj3.hashCode());
		System.out.println("Character " + obj4 + " co hashCode for a Character is " + obj4.hashCode());
		System.out.println("StringBuffer " + obj5 + " co hashCode for a String Buffer is " + obj5.hashCode());
		System.out.println("ArrayList" + obj6 + " co hashCode for a Array List is " + obj6.hashCode());
		System.out.println("String " + obj7 + " co hashCode can be negative  " + obj7.hashCode());
		System.out.println("hashCode for a Iterator is " + obj8.hashCode());
		System.out.println("hashCode for a HashCodeDemo is " + obj9.hashCode());
	}
}
