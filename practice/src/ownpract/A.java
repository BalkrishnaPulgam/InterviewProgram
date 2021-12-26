package ownpract;

public class A {
	public static void main(String[] args) {
		int rows=4;
		
	for(int i=0;i<=rows;i++) {
		for(int j=i*2;j<rows*2;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
		
	for(int i=rows-1;i>=0;i--) {
		for(int j=i*2;j<rows*2;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	

	
	
	

	}
}
