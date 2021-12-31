package digitRelated;

import java.util.Scanner;

public class MissingArrayElement {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no element in array ");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter n-1 elements");
		for(int i=0;i<n-1;i++) {
			a[i]=sc.nextInt();
		}
		
		//finding missing number
		int sumOfAll=(n*(n+1))/2;
		int sumOfArray=0;
		for(int i=0;i<n-1;i++) {
			sumOfArray=sumOfArray+a[i];
		}
		
		int missingNumber=sumOfAll-sumOfArray;
		System.out.println("Missing Number : "+missingNumber);
		
		
	}

}
