package interview.recursion;

public class PrintNumber {
	static int num = 1;

	public static void main(String[] args) {
		if (num <= 100) {
			System.out.printf("%d ", num++);
			main(null);
			
		}
	}

}
