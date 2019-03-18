package OOPConceptsPart1;

public class c_Methods_non_static {

	public static void main(String[] args) {	// main() method is void-- never returns a value.
		
		c_Methods_non_static m = new c_Methods_non_static();		// new Methods_non_static is Object
																// m is referring Methods_non_static --> reference variable
		
		m.test();
		
		int l = m.pqr();
		System.out.println(l);
		
		String st = m.qa();
		System.out.println(st);
		
		int result = m.division(30, 10);
		System.out.println(result);
		
		boolean boo = m.isOddNumber(3);
		System.out.println(boo);
		
	}
	
	//  void -- does not return any value -- return type
	public void test() {						// no input, no output
		System.out.println("test method");
	}
	
	public int pqr() {							// no input, some output
		System.out.println("pqr method");
		int a = 100;
		int b = 200;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {						// no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	
	//  return type - int
	public int division(int x, int y) {			// x, y -- inputs/arguments/parameter		
		System.out.println("division method");
		int d = x/y;
		return d;
	}
	
	public boolean isOddNumber(int n) {			// n -- input/parameter.
		if(n%2 != 0) {
			return true;
		}
		return false;							// boolean return by default false i.e 0.
	}

}
