package JavaPrograms;

public class Number_LCM {

	public static void main(String[] args) {


		System.out.println(lcmOfTwoNumbers(72, 120)); //360
		System.out.println(lcmOfTwoNumbers(24, 36)); // 72

	}

	public static int lcmOfTwoNumbers(int n1, int n2) {
		int gcd = 1;
		for(int i = 1; i<= n1 && i<= n2; i++) {
			if(n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}		
		}
		int lcm = (n1 * n2) / gcd;
		return lcm;
		
	}
}
