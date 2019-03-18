package OOPConceptsPart1;

public class h_CallByValAndCallByRef {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		h_CallByValAndCallByRef m = new h_CallByValAndCallByRef();
		
		int a = 10;
		int b = 20;
		int d = m.sum(a, b);		// call by value
		System.out.println(d);
		
		
		
		m.p = 50;
		m.q = 60;
		
		m.swap(m);
		// after swap
		System.out.println(m.p);	// 60
		System.out.println(m.q); 	// 50

	}
	
	public int sum(int x, int y) {
		x = 30;
		y = 40;
		int c = x+y;
		return c;
	}
	
	public void swap(h_CallByValAndCallByRef t) {  	// Call by reference
		int temp;
		temp = t.p;		// 50
		t.p  = t.q;		// 60 --> t.p
		t.q  = temp;	// 50 --> t.q
		
	}

}
