package interview;

import java.util.Arrays;

public class DescendingArrayWithRemoveDuplicate {
	
	public static void main(String[] args) {
		
		int [] arr= {10,70,30,30,50,80,90};
		
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
		
		int length=arr.length;
		length=removeDup(arr, length);
		//printing new array
		for(int i=0; i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("Second lowest number : "+arr[arr.length-2]);
		
	}
	
	
	
	public static int removeDup(int[] arr, int n) {
		if(n==0||n==1) {
			return n;
			}
			
			int[] temp=new int[n];
			int j=0;
			for(int i=0;i<n-1;i++) {
				if(arr[i]!=arr[i+1]) {
					temp[j++]=arr[i];
				}
			}
			
			temp[j++]=arr[n-1];
			
			//changing original array
			
			for(int i=0;i<j;i++) {
				arr[i]=temp[i];
			}
			
			return j;	
			
			
		}
	}


