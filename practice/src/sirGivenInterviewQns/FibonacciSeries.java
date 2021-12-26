package sirGivenInterviewQns;

public class FibonacciSeries {

	public static void main(String[] args) {

		int Number1 = 0, Number2 = 1, Number3;

		System.out.print(Number1 + " " + Number2+" ");

		int count = 9;

		for (int i = 2; i < count; i++) {
			Number3 = Number1 + Number2;
			Number1 = Number2;
			Number2 = Number3;
			System.out.print(Number3+" ");
		}

	}

}
