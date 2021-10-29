package interview;

import java.util.Scanner;

public class MissingArrayElement1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element you want in an array");
		int n = sc.nextInt();
		int[] inputArray = new int[n];
		System.out.println("enter (n-1) numbers: ");
		System.out.println("Enter element in array");
		for (int i = 0; i < n - 1; i++) {
			inputArray[i] = sc.nextInt();
		}

		// Finding the missing number
		int sumOfAll = (n * (n + 1)) / 2;
		int sumOfArray = 0;
		for (int i = 0; i < n - 1; i++) {
			sumOfArray = sumOfArray + inputArray[i];
		}

		sc.close();

		int missingNumber = sumOfAll - sumOfArray;
		System.out.println("Missing number is " + missingNumber);
	}

}
