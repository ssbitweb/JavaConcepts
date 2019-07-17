package OOPConceptsPart2.B_Constructor;

// super - super keyword is used to call parent class constructor.(imp)
// if u don't write super keyword by default default constructor will be called from parent
// super should be written in child class
// constructor call should be first statement in constructor

public class E_Constructor_Super_Child extends D_Constructor_Super_Parent {

	public E_Constructor_Super_Child() { // default child - constructor

		super(); // super keyword
		System.out.println("default-child Constructor");

		// super(30); --> ERROR - constructor call after print statement. it should be first.
	}

	public E_Constructor_Super_Child(int i) {
		super(10);
	}

	public E_Constructor_Super_Child(int i, int j) {
		super(10, 20);
	}

	public E_Constructor_Super_Child(int i, int j, int k) {
		super(10, 20, 30);
	}

	public static void main(String[] args) {

		E_Constructor_Super_Child m = new E_Constructor_Super_Child();
		E_Constructor_Super_Child m1 = new E_Constructor_Super_Child(10);
		E_Constructor_Super_Child m2 = new E_Constructor_Super_Child(10, 20);
		E_Constructor_Super_Child m3 = new E_Constructor_Super_Child(10, 20, 30);
	}

}
