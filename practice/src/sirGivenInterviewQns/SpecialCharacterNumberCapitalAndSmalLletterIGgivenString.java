package sirGivenInterviewQns;

import java.util.Scanner;

public class SpecialCharacterNumberCapitalAndSmalLletterIGgivenString {
	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter String ");
		// String str = sc.next();
		String str = "Balkrishna";
		int upper = 0, lower = 0, number = 0, special = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch < '9') {
				number++;
			} else if (ch >= 'A' && ch <= 'Z') {

				upper++;
			} else if (ch >= 'a' && ch <= 'z') {
				lower++;

			} else {
				special++;

			}

		}

		System.out.println("Number :" + number);
		System.out.println("Capital letter :" + upper);
		System.out.println("Small letter :" + lower);
		System.out.println("Special :" + special);

	}
}
