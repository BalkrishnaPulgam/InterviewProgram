package interview;

import java.util.Arrays;

public class RemovePra {

	public static int removeDuplicate(int[] arr, int n) {
		Arrays.sort(arr);

		if (n == 0 || n == 1) {
			return n;
		}

		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}

		temp[j++] = arr[n - 1];

		// changing original array

		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}

		return j;
	}
	
	public static void main(String[] args) {
		int[] arr= {50,60,40,20,30,20,10};
		int length=arr.length;
		length=removeDuplicate(arr, length);
		
		//printing array
		
		for(int i=0; i<length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
