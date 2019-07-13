package OOPConceptsPart1;

// Access Modifiers-- Access modifiers in java are keywords
// that are used to specify access levels for classes, methods,
// variables, and constructor.

// There are 4 type of access modifiers. 
// private is highly restrictive & public is least restrictive.
//
// access M. |	Class  |  Package |	subClass  |	subClass   |   world
//			 |		   |		  |(same Pkg) |(diff Pkg)  |
//------------------------------------------------------------------
// 1-public		  Y			Y		   Y		   Y		   Y
// 2-protected	  Y			Y		   Y		   Y		   N
// 3-default	  Y			Y		   Y		   N		   N
// 4-private      Y         N          N           N           N
//-------------------------------------------------------------------



public class _01_AccessModifiers {
	
	private int i =10;	 // private
	protected int j =20; // protected
	int k =30;			 // No access modifiers(Default)
	public int l=40;     // public

	public static void main(String[] args) {

		_01_AccessModifiers obj = new _01_AccessModifiers(); 
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.l);
	}

}
