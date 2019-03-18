package javaBasicsPart1;

import java.util.Hashtable;

public class I_HashTableConcepts {

	public static void main(String[] args) {

		Hashtable h = new Hashtable();
		
		h.put("A", "TEST");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 200);
		h.put(2, 500);
		h.put(3, 600);
		
		System.out.println(h.size()); // 6
		
		h.put(4, "sachin");
		
		System.out.println(h.get(3)); // 600
		System.out.println(h.get(4)); //TEST
		
		//to restrict data type
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();	
		
		h1.put(1, 100);
		h1.put(2, 200);
		h1.put(3, 300);
		h1.put(4, 400);
		
		System.out.println(h1.get(2));
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();	
		
		h2.put(1, "sachin");
		h2.put(2, "pallavi");
		h2.put(3, "shivani");
		h2.put(4, "sayali");
		
		System.out.println(h2.get(2));
	}

}
