package arrayInterview;

public class RotateRight {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 3; i++) {
			int j, last;
			last = arr[arr.length - 1];

			for (j =arr.length-1; j>0;j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = last;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
