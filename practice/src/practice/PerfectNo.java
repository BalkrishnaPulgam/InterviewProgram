package practice;

import java.util.Scanner;

public class PerfectNo {
	
	
	//6=1+2+3
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum=sum+i;
			}
				
		}
		if(sum==num) {
			System.out.println("No is perfect");
		}
		else {
			System.out.println("no is not perfect");
		}
		
		
		
		sc.close();
	}
		
		
	
	
	
}
