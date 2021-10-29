package practice;

import java.util.Scanner;

public class AA {

	// Enter 2 strings from user find the max string..

	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter 1st string");
		 * String s = sc.next(); System.out.println("enter 2nd string"); String s1 =
		 * sc.next();
		 */

		String s = "Balkrishna";
		String s1 = "krishna";

		if (s.length() > s1.length()) {
			System.out.println(s + " is max string");
		} else {
			System.out.println(s1 + " is max string");
		}

	}

}
