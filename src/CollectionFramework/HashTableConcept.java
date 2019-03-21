package CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

// It is similar to HashMap but it is synchronized
// Stores data in <Key, value > pair
// Key -->Object --HashCode --> Value
// 

public class HashTableConcept {

	public static void main(String[] args) {

		Hashtable h1 = new Hashtable();
		h1.put(1, "selenium");
		h1.put(2, "test");
		h1.put(3, "automation");
		
		// create a clone copy/ shallow copy
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable)h1.clone();
		
		System.out.println("the value of h1 " + h1); // {3=automation, 2=test, 1=selenium}
		System.out.println("the value of h2 " + h2); // {3=automation, 2=test, 1=selenium}
		
		h1.clear();
		System.out.println("the value of h1 " + h1); // {}
		System.out.println("the value of h2 " + h2); // {3=automation, 2=test, 1=selenium}
		
		Hashtable st = new Hashtable();
		st.put("A", "sachin");
		st.put("B", "bhagat");
		st.put("C", "pune");
		
		if(st.containsValue("sachin"))
			System.out.println("value is found");
		
		// print all the values from hashTable using -- Enumeration --elements()
		Enumeration e = st.elements();
		System.out.println("print values of st using enumeration");
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
			
		// get all the values of hashtable -- using entrySet()-- set of Hashtable value
		System.out.println("print values of st using enumeration");
		
		Set s = st.entrySet();
		System.out.println(s); // [A=sachin, C=pune, B=bhagat]
		//----------------------------------------------
		
		Hashtable st1 = new Hashtable();
		st1.put("A", "sachin");
		st1.put("B", "bhagat");
		st1.put("C", "pune");
		st1.put("C", "pune"); // it contain unique values
//		st1.put(null, "pune"); // give u null pointer exception
//		st1.put("C", null); // give u null pointer exception
		
		// to check both the hashtable are equal or not
		if(st.equals(st1))
			System.out.println("both are equal");  // both are equal
		
		// get the value from a key
		System.out.println(st1.get("A"));
		
		// get the hashcode of hashtable object
		System.out.println(" the hash code value of st1 " +st1.hashCode());
		
		// generics
		Hashtable <String, String>st3 = new Hashtable<String, String>();
	}

}
