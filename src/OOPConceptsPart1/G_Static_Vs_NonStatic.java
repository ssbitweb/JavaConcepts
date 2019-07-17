package OOPConceptsPart1;

public class G_Static_Vs_NonStatic {
	
	String name = "sachin";			// non static global variable
	static int age = 25;			// static global variable

	public static void main(String[] args) {
		
		//- how to call static variables and method?
		// 1. By direct calling:
		
		sum(); // calling static method
		System.out.println(age); // calling static variable
		
		int s = age;
		System.out.println(s);
		
		// 2. calling by classname:
		
		G_Static_Vs_NonStatic.sum();  // calling static method
		
		int j =G_Static_Vs_NonStatic.age; // calling static variable
		System.out.println(j);
		
		//------------------------------------------------------------------------------------------------------
		
		// how to call non static variables and method
		
		// 1. by creating object of class..
		G_Static_Vs_NonStatic m = new G_Static_Vs_NonStatic();
		m.sendMail();
		System.out.println(m.name);
		
		String a = m.name;
		System.out.println(a); 
		
	}
	
	public void sendMail() {		// non static method
		System.out.println("sendmail() Method");
	}
	
	public static void sum() {		// static method
		System.out.println("sum() Method");
	}

}
