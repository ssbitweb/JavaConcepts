package OOPConceptsPart2.B_Constructor;

public class D_Constructor_Super_Parent {
	
	public D_Constructor_Super_Parent() {  // default constructor -hidden
		
		System.out.println("defaulf-parent constructor");	
	}
	
	public D_Constructor_Super_Parent(int i) {	// 1 parameter
		
		System.out.println("parent constructor with 1 param value of i is " + i);	
	}
	
	public D_Constructor_Super_Parent(int i, int j) { // 2 parameter
		
		System.out.println("parent constructor with 2 param, value of i is " + i);
		System.out.println("parent constructor with 2 param, value of j is " + j);
	}
	
	public D_Constructor_Super_Parent(int i, int j, int k) {	// 3 parameter
		
		System.out.println("parent constructor with 3 param, value of i is " + i);
		System.out.println("parent constructor with 3 param, value of j is " + j);
		System.out.println("parent constructor with 3 param, value of j is " + k);
	}
	
	

}
