package practice;

import java.util.Scanner;

public class MaxLengthOfString {

	// Enter 2 strings from user find the max length of string..

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st String");
		String s = sc.next();
		System.out.println("Enter 2nd String");
		String s1 = sc.next();

		int a = s.length();

		int b = s1.length();

		if (a > b) {
			System.out.println("Max length of String " + s);
		} else {
			System.out.println("Max length of String " + s1);
		}

	}

}
