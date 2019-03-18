package OOPConceptsPart1;

public class e_Static_Vs_NonStatic {
	
	String name = "sachin";			// non static global variable
	static int age = 25;			// static global variable

	public static void main(String[] args) {
		
		//- how to call static variables and method?
		// 1. By direct calling:
		
		sum();
		System.out.println(age);
		
		int s = age;
		System.out.println(s);
		
		// 2. calling by classname:
		
		e_Static_Vs_NonStatic.sum();
		
		int j =e_Static_Vs_NonStatic.age;
		System.out.println(j);
		
		//------------------------------------------------------------------------------------------------------
		
		// how to call non static variables and method
		
		// 1. by creating object of class..
		e_Static_Vs_NonStatic m = new e_Static_Vs_NonStatic();
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
