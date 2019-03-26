package JavaPrograms;

public class Array_FindMissingNumber {

	public static void main(String[] args) {


		//int a[] = { 1, 2, 4, 5 ....100};
		
		//1+2+4+5 = 12
		//1+2+3+4+5 = 15
		//missing no = 15-12 =3
		
		int a[] = { 1, 2, 4, 5 }; // should be in sorted order
		int sum =0;
		for(int i=0; i<a.length; i++) {
			sum += a[i]; 	// OR sum = sum + a[i];
		}
		System.out.println(sum); //12
		
		int sum1 = 0;
		for(int j =0; j<=5; j++) {
			sum1 += j;		// OR sum1 = sum1 + j;
		}
		System.out.println(sum1); //15
		
		System.out.println("Missing No is:::"+ (sum1 -sum)); //3
	}

}
