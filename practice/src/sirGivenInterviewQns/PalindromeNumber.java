package sirGivenInterviewQns;

public class PalindromeNumber {
	public static void main(String[] args) {

		int a, b = 0, c = 0;
		int n = 121;

		a = n;

		while (n != 0) {
			c = n % 10; // 1 2 1
			b = b * 10 + c; // 1 12 121
			n = n / 10; // 12 1 0

		}
		if (b == a) {

			System.out.println("Number is Palindrome");
		} else {
			System.out.println("Number is not Palindrome");
		}

	}
}
