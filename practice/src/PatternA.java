
public class PatternA {

	public static void main(String[] args) {
		int num = 5;
		int number = 4;
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = number; k >= i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
