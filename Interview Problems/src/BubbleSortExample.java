
public class BubbleSortExample {

	static void bubbleSort(int arr[]) {
		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = {5,3,6,8,9,5,2};
		System.out.println("Before sorting");
		System.out.println();
		for(int a: arr) {
			System.out.print("\t "+ a);
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("After Sorting the code..!");
		System.out.println();
		for(int a : arr) {
			System.out.print("\t "+a);
		}
		
		
	}

}
