
public class BB {
	public static void main(String[] args) {
		int flag = 1, row = 6;
		for (int i = 0; i < row; i++) {
			for (int s = 0; s < row - i; s++) {
				System.out.print("  ");
			}
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == 0) {
					flag = 1;
				} else
					flag = flag * (i - j + 1) / j;
				System.out.printf("%4d", flag);
			}
			System.out.println();
		}
	}
}
