package OOPConceptsPart1;

public class f_MethodOverloading {
	
	// MethodOverloading-- > same method name with different numbers of parameter or different types of parameter.

	public static void main(String[] args) {
		
		f_MethodOverloading m = new f_MethodOverloading();
		m.sum();
		m.sum(10);
		m.sum(10, 20);
		m.sum(100, "sachin");
		
	}
	
	//Note:-1. You can not create method inside method
	//		2. Duplicate method are not allowed. i.e same type of parameter not allowed.
	
	//Q. Can main method be overloaded? -- YES.
	
	public static void main(int i) {
		
	}
	public static void main(String s) {
		
	}
	
	
	public void sum() {							// no parameter
		System.out.println("sum() method with no parameter");
	}
	
	public void sum(int i) {					// 1 parameter
		System.out.println("sum() method with 1 parameter");
		System.out.println(i);
		
	}
	
	public void sum(int i, int j) {				// 2 parameter
		System.out.println("sum() method with 2 parameter");
		System.out.println(i+j);
		
	}
	
	public void sum(int i, String j) {			// 2 different type of parameter
		System.out.println("sum() method with 2 different parameter");
		System.out.println(i+j);
		
	}
}
