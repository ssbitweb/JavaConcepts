package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* Collections in java is a Framework which is used or which provide an architecture -
 Framework -- used To store and manipulate the groups of Objects, to perform different operations like
 Operations -- Searching, Insertion, Manipulation, Deletion, Sorting etc., which include different interfaces and classes like-
 Interfaces -- List, Set, Queue, Dequeue
 Classes -- ArrayList, LinkedList, Vector, HashSet, TreeSet, PriorityQueue

 Hierarchy--
				  Iterable(I)
					  |
		--------->Collection(I)<---------
		|			  |					|
	List(I)			Queue(I)		   Set(I)
	 -ArrayList	  	  |	-PriorityQueue	| --HashSet
					  |					| --LinkedHashSet
	 -LinkedList--->Dequeue(I)		SortedSet(I)
	 -Vector		   -ArrayDequeue	  --TreeSet
		-Stack
	
*/

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; // static array --size is fixed
		
		// dynamic array--ArrayList
		// 1.Can contain duplicate value/element
		// 2.Maintains insertion order
		// 3.Synchronized
		// 4.Allow random access to fetch element because it store the value on the basis of index
		
		ArrayList ar = new ArrayList();	
		
		ar.add(10);	// 0 index
		ar.add(20);	// 1
		ar.add(30); // 2
		
		System.out.println(ar.size());	// 3
		ar.add(40);	// 3
		ar.add(50);	// 4
		ar.add(50);	// 5
		ar.add("test");
		ar.add(12.45);
		ar.add('A');
		ar.add(true); //9
		
		System.out.println(ar.size()); 	// 10 --size of array
		System.out.println(ar.get(5));	// 50 --index value
		
		// To print all valye fro, ArrayList -- use for loop
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//  non generics vs generics
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("sachin");
		ar2.add("pune");
		ar2.add("test");
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//Employee class object
		
		Employee e1 = new Employee("sachin", 25, "Computer");
		Employee e2 = new Employee("sachin", 25, "Computer");
		Employee e3 = new Employee("sachin", 25, "Computer");
		
		//create ArrayList of employee
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e2);
		
		// iterator to traverse the value
		
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//==================================================
		
		// addAll() --> to merge two Arraylist
		
		ArrayList<String> ar5 = new ArrayList<String>();
		
		ar5.add("Test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6); // addAll() method add all elements from ar6 to ar5
		
		for(int i = 0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//====================================================
		
		// removeAll: -- to remove previous added.
		
		ar5.removeAll(ar6);
		for(int i = 0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//=====================================================
		System.out.println("*****************");
		
		// retainAll() -- to print common between two array
		
		ArrayList<String> ar7 = new ArrayList<String>();
		
		ar7.add("Test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		
		ar8.add("Test");
		ar8.add("Java");
		
		ar7.retainAll(ar8);
		for(int i = 0; i<ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
		
		
		
	}

}
