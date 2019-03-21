package OOPConceptsPart2.A_ConctrustorConcept;

// Constructor --Method name having same name as class name with NO return Type.
// Constructor automatically called the moment u creating an object -- default -its hidden 
// Constructor - used to initialize class variables
// **this keyword is used to initialize class variables -- this means current class - (imp)
	
// Constructor overloading - same constructor name with different number or different type of parameter.

public class a_ConstructorConcept_This {
	
	String name;  // class variables
	int age;
	
	public a_ConstructorConcept_This() {   //constructor 
		System.out.println("default-constructor");	// 0 parameter
	}
	
	public a_ConstructorConcept_This(int i) {		// 1 parameter -- constructor overloading		 
		System.out.println("1 param-constructor");
		System.out.println(i);
	}
	
	public a_ConstructorConcept_This(int i, int j) { // 2 parameter -- constructor overloading		 
		System.out.println("2 param-constructor");
		System.out.println(i+" "+j);
	}
	
	public a_ConstructorConcept_This(String name, int age) { // local variables	 
		this.name = name;	// initializing class variables.
		this.age = age;		// i.e this.class vars = local vars
		
//		name = name1;		// without using this keyword
			 
	}
	
	public static void main(String[] args) {
		
		a_ConstructorConcept_This m = new a_ConstructorConcept_This();	// creating objects
		a_ConstructorConcept_This m1 = new a_ConstructorConcept_This(10);
		a_ConstructorConcept_This m2 = new a_ConstructorConcept_This(20,30);
		a_ConstructorConcept_This m3 = new a_ConstructorConcept_This("sachin",25);
		
		System.out.println(m3.name);
		System.out.println(m3.age);
		
		
		
		
		
		
	}
	
	
	
	

}
