package sirGivenInterviewQns;

public class FibonacciWithRecursion {

	static int Number1 = 0, Number2 = 1, Number3;

	static void fibo(int count) {

		if (count > 0) {
			Number3 = Number1 + Number2;
			Number1 = Number2;
			Number2 = Number3;
			System.out.print(" " + Number3);
			fibo(count - 1);
		}

	}

	public static void main(String[] args) {
		int count = 9;
		// print 0 and 1
		System.out.print(Number1 + " " + Number2);
		// 2 numbers are already printed so using recursion we print the remaining n-2
		// number
		fibo(count - 2);
	}

}
