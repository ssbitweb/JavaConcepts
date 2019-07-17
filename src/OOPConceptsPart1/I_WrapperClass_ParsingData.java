package OOPConceptsPart1;

public class I_WrapperClass_ParsingData {

	public static void main(String[] args) {
		
		// String to int:
		String x = "100";
		int c = Integer.parseInt(x); 
		System.out.println(c);			//	100
		
		// Integer, double, boolean, 
		
		// Int to String
		int a = 100;
		String s= String.valueOf(a);
		System.out.println(s); 			// "100"
		
		//While converting number and char --> givers exception-
		String d = "100A";				// string should be pure integer while parsing int.
		Integer.parseInt(d);
		System.out.println(d);			// NumberFormatException
		
		// String to boolean
		String b = "true";
		boolean boo = Boolean.parseBoolean(b);
		System.out.println(boo);		// true
		
		// String to double
		String f = "12.24";
		double g =Double.parseDouble(f);
		System.out.println(g); 			// 12.24
		
	}

}
