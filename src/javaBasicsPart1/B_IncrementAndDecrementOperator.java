package javaBasicsPart1;

public class B_IncrementAndDecrementOperator {

	public static void main(String[] args) {

		//++
		//--
		
		int i = 1;
		int j = i++;	//post increment --> first give the value of i to j then increment i by 1.
		
		System.out.println(i);	// 2
		System.out.println(j);	// 1
		
		int p = 1;
		int q = p--;	//post decrement --> first give the value of p to q then decrement p by 1.
		
		System.out.println(p);	//0
		System.out.println(q);	//1
		
		int m = 1;
		int n = ++m;	//pre increment --> first increment the value of m by 1 the give it to n.
		
		System.out.println(m);	//2
		System.out.println(n);	//2
		
		int x = 1;
		int y = --x;	// pre decrement --> first decrement the value of x by 1 then give it to y.
		
		System.out.println(x);	//0
		System.out.println(y);	//0
		
		
	}

}
