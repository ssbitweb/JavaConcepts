package JavaPrograms;

//Q. Write a program to check whether armstrong number?

// Armstrong Number -- if sum of n power of n digit number remains the same then -Armstrong
// e.g 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
// e.g 371 = 3*3*3 + 7*7*7 + 1*1*1 = 371


public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 370;
		int an = isArmstrongNumber(num);
		if(num == an) {
			System.out.println("This is armstrong number");
		}else {
			System.out.println("Not Armstrong");
		}
		
	}
	// for 3 didit no's
	public static int isArmstrongNumber(int n) { // 153
		int d = 0;
		int sum = 0;
		while(n > 0) {
			d = n % 10;
			n /= 10; 	// n = n/10 
			sum = sum + (d*d*d);
			
		}
		return sum;
		
		
	}
	

}
