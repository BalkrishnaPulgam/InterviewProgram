package interview;

import java.util.Scanner;

public class CheckCharaAlphaDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter char");
		char c = sc.next().charAt(0);

		if (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'a') {
			System.out.println(" c is Alphabet");
		} else if (c >= '0' && c <= '9') {
			System.out.println("c is digit");
		} else {
			System.out.println("c is special Character");
		}

	}

}
