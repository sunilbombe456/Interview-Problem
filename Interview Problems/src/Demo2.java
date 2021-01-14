import java.util.Scanner;

public class Demo2 {
	public static void main(String args[]) {
		int i, j, num, temp;
		int count = 5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the Number ");
		num = sc.nextInt();
		
		for(i=0;i<9;i++) {
			temp = count;
			for(j=0;j<9;j++) {
				if(j<temp) {
				System.out.print("\t "+ count);
				count--;
				}
				if(j==temp) {
					count++;
				}
				if(j>temp){
//					++count;
//					System.out.print("\t "+ count);
					
				}
			}
			System.out.print("\n");
			temp--;
			count = temp;
			
		}
	}
}
