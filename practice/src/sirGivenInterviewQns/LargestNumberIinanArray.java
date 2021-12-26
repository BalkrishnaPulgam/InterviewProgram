package sirGivenInterviewQns;

import java.util.Scanner;

public class LargestNumberIinanArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter array lenght");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter array element : " + n );
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int[] aa = { 50, 10, 20, 40, 60, 70, 90, 80 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println(a[a.length - 1]);

	}

}
