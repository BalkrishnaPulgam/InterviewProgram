package interview;

import java.util.Arrays;
import java.util.Scanner;

public class DescendingArray {
	public static void main(String[] args) {
		
		
		int[] arr= {50,10,20,40,60,70,90,80};
		
		int temp;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		/* // taking input from user
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of element you want to enter in array");
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("enter element");
			
			a[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		*/
	}

}
