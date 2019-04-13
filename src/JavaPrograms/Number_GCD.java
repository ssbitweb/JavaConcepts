package JavaPrograms;

public class Number_GCD {

	public static void main(String[] args) {


		System.out.println(gcdOfTwoNumbers(81, 153)); // 9
		System.out.println(gcdOfTwoNumbers(52, 56));  // 4
		
	}
	
	public static int gcdOfTwoNumbers(int n1, int n2) {
		int gcd = 1;
		for(int i = 1; i<= n1 && i<= n2; i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}

}
