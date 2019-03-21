package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		// add
		ll.add("java");
		ll.add("Selenium");
		ll.add("Test");
		ll.add("Pune");
		ll.add("QTP");
		ll.add("Zero");
		
		// print 
		System.out.println("Contents of linked list "+ ll);// [java, Selenium, Test, Pune, QTP, Zero]
		
		// addfirst
		ll.addFirst("TOM");
		
		// addlast
		ll.addLast("PETER");
		
		System.out.println("Contents of linked list "+ ll); // [TOM, java, Selenium, Test, Pune, QTP, Zero, PETER]
		
		// get:
		System.out.println(ll.get(0)); // TOM
		
		//set: -- > to replace 
		ll.set(0, "TOMFather");
		System.out.println("Contents of linked list "+ ll); // [TOMFather, java, Selenium, Test, Pune, QTP, Zero, PETER]
		
		// remove first and last
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of linked list "+ ll); // [java, Selenium, Test, Pune, QTP, Zero]
		ll.remove(1);
		System.out.println("Contents of linked list "+ ll); // [java, Test, Pune, QTP, Zero]
		
		//-------------------------------------------------------------
		// how to print all the values of LinkedList?
		//1.using for loop
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i)); // [java, Test, Pune, QTP, Zero]
		}
		
		//==========================================================
		//2.** using advance for loop(IMP) also called for each loop
		for(String str : ll) {		// for one in all - and iterate 
			System.out.println(str);
		}
		
		
		//3.iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4.while loop
		int num = 0;
		while(ll.size()>num) {
			System.out.println();
			num++;
		}
	}

}
