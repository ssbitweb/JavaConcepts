package CollectionFramework;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {
	/* 	--HashMap is class implements Map Interface
	--Extends AbstractMap
	--it contain only unique elements
	--Stores the value in the form of <Key, Value> pair
	--It may have one null key and multiple null values
	--it maintains NO order
	--HashMap is non synchronized -- not thread safe
	--Concurrent modificatin Exception --Fail -fast condition

	Diff Methods-- 1.put() 2.putAll() 3.get(key) 4.constainsKey(key) 5.remove(key) 6.keySet() 7.entrySet()
	Diff e.g -- Error Code(1.2.1 : "fatal error"), Map of zip code, Headers in REST API, config/env variables, Map of Manager-Employee 

Hierarchy -->	 Map(I)<---SortedMap(I)
				  |				|
			--HashTable	 navigableMap(I)
			--HashMap		  --TreeMap
				--LinkedHashMap

*/

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		
		System.out.println(hm.get(1)); // Selenium
		System.out.println(hm.get(4)); // null -- does not store on the basis of index
		
		// To Print all values -- use for loop
		for(Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		System.out.println(hm); // {1=Selenium, 2=QTP, 3=TestComplete}
		
		// To remove
		hm.remove(3);
		System.out.println(hm); // {1=Selenium, 2=QTP}
		

		// Object Map
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("sachin", 25, "Computer");
		Employee e2 = new Employee("pallavi", 25, "Electronics");
		Employee e3 = new Employee("shivani", 25, "BSc");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		
		// Traverse hashmap
		for(Entry <Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println(key + " Info");
			
			System.out.println(e.name + " " + e.age + " " + e.dept);
		}
		
		
		
	}

}
