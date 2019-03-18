package OOPConceptsPart2.A_ConctrustorConcept;

public class b_ConstructorConcept_Super_Parent {
	
	public b_ConstructorConcept_Super_Parent() {							// default -hidden
		
		System.out.println("defaulf-parent constructor");	
	}
	
	public b_ConstructorConcept_Super_Parent(int i) {						// 1 parameter
		
		System.out.println("parent constructor with 1 param value of i is " + i);	
	}
	
	public b_ConstructorConcept_Super_Parent(int i, int j) {				// 2 parameter
		
		System.out.println("parent constructor with 2 param, value of i is " + i);
		System.out.println("parent constructor with 2 param, value of j is " + j);
	}
	
	public b_ConstructorConcept_Super_Parent(int i, int j, int k) {				// 3 parameter
		
		System.out.println("parent constructor with 3 param, value of i is " + i);
		System.out.println("parent constructor with 3 param, value of j is " + j);
		System.out.println("parent constructor with 3 param, value of j is " + k);
	}
	
	

}
