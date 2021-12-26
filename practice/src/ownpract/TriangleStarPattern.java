package ownpract;

public class TriangleStarPattern {
	public static void main(String[] args) {
	int rows=9;
	for(int i=0;i<=rows;i++) {
		for(int j=i;j<rows;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) {
			if(k==1||k==(2*i-1)) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	
	for(int i=rows-1;i>=0;i--) {
		for(int j=i;j<rows;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=(2*i-1);k++) {
			if(k==1||k==(2*i-1)) {
				System.out.print("*");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
	}

}
