package javaBasicsPart1;

import java.util.ArrayList;

public class H_ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		
		ar.add(100);	// index 0
		ar.add(200);
		ar.add(300);	// index 2
		
		System.out.println(ar.size()); //3
		
		ar.add(500);
		ar.add(600);	// index 4
		System.out.println(ar.size()); // 5
		
		System.out.println(ar.get(4)); // 600
		
		ar.add("sachin");
		ar.add("bhagat");
		ar.add(12.25);
		ar.add('A');
		
		System.out.println(ar.size()); // 9
		
		ar.remove(7);
		
		System.out.println(ar.size()); // 8
		
		//to print all the values of arrayList use for loop
		for(int i =0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// to restrict perticular data type
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		
		ar1.add(200);
		ar1.add(600);
		ar1.add(500);
		ar1.add(300);
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		ar2.add("sachin");
		ar2.add("pallavi");
		ar2.add("shivani");
		ar2.add("sayali");
		
		
		
		
		
		
		
		
		
		
	}

}
