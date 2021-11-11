package interview.recursion;

public class Factorial {

	static int facto(int n) {

		if (n == 1)
			return 1;
		else
			return (n * facto(n-1));
	}

	public static void main(String[] args) {
		System.out.println("factorial of 5 is :"+facto(5));

	}

}
