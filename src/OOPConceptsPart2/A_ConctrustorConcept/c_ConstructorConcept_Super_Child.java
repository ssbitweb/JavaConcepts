package OOPConceptsPart2.A_ConctrustorConcept;

// super - super keyword is used to call parent class constructor.(imp)
// if u don't write super keyword by default default constructor will be called from parent
// super should be written in child class
// constructor call should be first statement in constructor

public class c_ConstructorConcept_Super_Child extends b_ConstructorConcept_Super_Parent {

	public c_ConstructorConcept_Super_Child() { // default child - constructor

		super(); // super keyword
		System.out.println("default-child Constructor");

		// super(30); --> ERROR - constructor call after print statement. it should be first.
	}

	public c_ConstructorConcept_Super_Child(int i) {
		super(10);
	}

	public c_ConstructorConcept_Super_Child(int i, int j) {
		super(10, 20);
	}

	public c_ConstructorConcept_Super_Child(int i, int j, int k) {
		super(10, 20, 30);
	}

	public static void main(String[] args) {

		c_ConstructorConcept_Super_Child m = new c_ConstructorConcept_Super_Child();
		c_ConstructorConcept_Super_Child m1 = new c_ConstructorConcept_Super_Child(10);
		c_ConstructorConcept_Super_Child m2 = new c_ConstructorConcept_Super_Child(10, 20);
		c_ConstructorConcept_Super_Child m3 = new c_ConstructorConcept_Super_Child(10, 20, 30);
	}

}
