package practice;

import java.util.Arrays;

public class B {
	
	public static void main(String[] args) {
		
		String str="BalkriHHHFFFFFFFshhhhna";
		System.out.println(str.charAt(0)+1);
		
		int[] a=new int[127];
		
		for(int i=0; i<str.length(); i++) {
			a[str.charAt(i)]=a[str.charAt(i)]+1;
			
		}
		
	int max=-1;
	char c=' ';
	
	for(int i=0; i<str.length(); i++) {
		if(max<a[str.charAt(i)]) {
			max=a[str.charAt(i)];
			c=str.charAt(i);
		}
	}
		System.out.println("Max repeated character "+c);
		
	}

}
