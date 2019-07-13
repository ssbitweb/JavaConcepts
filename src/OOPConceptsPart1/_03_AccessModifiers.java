package OOPConceptsPart1;

// Access Modifiers:
// -- Access modifiers are keywords in java,
//    that are used to specify access levels for 
//    classes, methods, variables, constructor and interfaces.

// NOTE: Classes and interfaces Can't be Private or protected.

// There are 4 type of access modifiers. 
// private is highly restrictive & public is least restrictive.

//---------------------------------------------------------------------------------------------
// access modifiers     Class    Package    subClass(same pkg)    subClass(diff pkg)    World
// 1--public              Y        Y               Y                   Y                  Y
// 2--protected           Y        Y               Y                   Y                  N
// 3--default             Y        Y               Y                   N                  N
// 4--private             Y        N               N                   N                  N
//---------------------------------------------------------------------------------------------

// 1-public access modifiers:
// -- classes, methods, members, constructor, declared as public 
//    can be accessible anywhere in world(within module)

// 2-protected access modifiers:
// NOTE: classes, interfaces can't be protected.
// -- methods, members, constructor declared as protected 
//    can be accessible within same class, same packages, subclass(child class) within package,
//    and outside package through inheritance only.

// 3- default/ No access modifiers:
// -- classes, methods, members, declared as NO Access modifiers then its default.
//    can be accessible within same class, same packages, subclass(child class) within package,
//    compile time error will be thrown, if tried to access outside the package.

// 4- private access modifiers:
// NOTE: classes, interfaces can't be private.
//    methods, members, constructor declared as private 
//    can be accessible within same class only.
//    compile time error will be thrown, if tried to access in different class within same package itself.

public class _03_AccessModifiers {
	
	private int i =10; // private
	protected int j =20; // protected
	int k =30; // No access modifiers(Default)
	public int l=40; // public

	public static void main(String[] args) {

		_03_AccessModifiers obj = new _03_AccessModifiers(); 
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.l);
	}

}
