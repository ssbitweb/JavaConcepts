package JavaPrograms;

//Q. write a program to check whether giver number is palindrome or not

// palindrome -- if number reversed gives the same number 

public class Palindrome {

	public static void main(String[] args) {

		int num = 121;
		int revNum = reversedNumber(num);
		if (num == revNum) {
			System.out.println("given number is palindrome");
		} else {
			System.out.println("not palindrome");
		}

	}

	public static int reversedNumber(int n) { // 121
		int rev = 0;
		while (n > 0) {
			rev = rev * 10 + n % 10;
			n /= 10;
		}
		return rev;
	}

}
