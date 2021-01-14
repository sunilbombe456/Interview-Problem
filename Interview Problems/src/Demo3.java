import java.util.Scanner;

public class Demo3 {
	public static void main(String args[]) {
		int i, j, k, num, temp;
		int count = 5;

		Scanner sc = new Scanner(System.in);
		System.out.println("\n Enter the Number ");
		num = sc.nextInt();

		System.out.println(num);
		System.out.println();

		for (i = 5; i >= 1; i--) {
			temp = count;
			for (j = 5; j >= 1; j--) {
				if (count < 1) {
					System.out.print("\t -");
				} else {
					System.out.print("\t " + count);
				}
				count--;
			}

			count++;

			for (j = 2; j <= 5; j++) {
				count++;
				if (count < 1) {
					System.out.print("\t -");
				} else {
					System.out.print("\t " + count);
				}
			}

			System.out.println();
			temp--;
			count = temp;
		}

		count += 2;

		for (i = count; i <= 5; i++) {
			temp = count;
			for (j = 1; j <= 5; j++) {
				if (count < 1) {
					System.out.print("\t -");
				} else {
					System.out.print("\t " + count);
				}
				count--;

			}

			count += 2;

			for (j = 2; j <= 5; j++) {
				if (count < 1) {
					System.out.print("\t -");
				} else {
					System.out.print("\t " + count);
				}
				count++;
			}

			temp++;
			count = temp;
			System.out.println();
		}

	}
}
