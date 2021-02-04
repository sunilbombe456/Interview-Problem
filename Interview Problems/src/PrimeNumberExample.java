import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		int n;
		int mode;
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number..!");
		
		n = sc.nextInt();
		
		for (int i=2; i<n; i++) {
			mode = n%i;
			if(mode == 0) {
				isPrime = false;
			}
		}
		
		if(isPrime) {
			System.out.println("The Number "+ n +" is Prime");
		}else {
			System.out.println("The Number "+ n +" is Not Prime");
		}
	}
	
}
