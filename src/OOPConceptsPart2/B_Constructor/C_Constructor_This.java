package OOPConceptsPart2.B_Constructor;

// Constructor --Method name having same name as class Name with NO return Type(like int ,char, double).
// Constructor automatically called the moment u creating an object -- default -its hidden 
// Constructor - used to initialize class/instance variables.
// Constructors are used to initialize the object’s state-->use to set initial values for field variables

// Why?-->

/*
  Think of a Box. If we talk about a box class then it will have some class variables (say length, breadth, and height). 
  But when it comes to creating its object(i.e Box will now exist in computer’s memory), 
  then can a box be there with no value defined for its dimensions. The answer is no.
  So constructors are used to assign values to the class variables at the time of object creation, 
  either explicitly done by the programmer or by Java itself (default constructor).

*/

// **this keyword is used to initialize class variables -- this means current class - (imp)
// **this keyword is used to call current class constructor.

// A constructor in Java can not be abstract, final, static and Synchronized.
	
// Constructor overloading - same constructor name with different number or different type of parameter.

public class C_Constructor_This {
	
	String name;  // class variables
	int age;
	
	public C_Constructor_This() {   //constructor 
		System.out.println("default-constructor");	// 0 parameter
	}
	
	public C_Constructor_This(int i) {		// 1 parameter -- constructor overloading		 
		System.out.println("1 param-constructor");
		System.out.println(i);
	}
	
	public C_Constructor_This(int i, int j) { // 2 parameter -- constructor overloading		 
		System.out.println("2 param-constructor");
		System.out.println(i+" "+j);
	}
	
	public C_Constructor_This(String name, int age) { // local variables	 
		this.name = name;	// initializing class variables.
		this.age = age;		// i.e this.class vars = local vars
		
//		name = name1;		// without using this keyword
			 
	}
	
	public static void main(String[] args) {
		
		C_Constructor_This m = new C_Constructor_This();	// creating objects
		C_Constructor_This m1 = new C_Constructor_This(10);
		C_Constructor_This m2 = new C_Constructor_This(20,30);
		C_Constructor_This m3 = new C_Constructor_This("sachin",25);
		
		System.out.println(m3.name);
		System.out.println(m3.age);
		
		
		
		
		
		
	}
	
	
	
	

}
