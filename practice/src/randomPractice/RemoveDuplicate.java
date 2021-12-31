package randomPractice;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] a = { 1, 8,9,2, 9, 4, 8, 7, 5, 3 };

		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}
		int n=a.length;
		
		System.out.println(Arrays.toString(a));
		int nn=removeDuplicate(a,n);
		for(int i=0;i<nn;i++) {
			System.out.println(a[i]+" ");
		}
	}
	
	
	
	public static int removeDuplicate(int[] arr, int n) {
		if(n==0||n==1) {
			return n;
		}
		
		int [] temp=new int[n];
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		
		temp[j++]=arr[n-1];
		
		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i];
		}
		return j;
	}

}
