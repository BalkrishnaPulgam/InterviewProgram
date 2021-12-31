package digitRelated;

import java.util.Arrays;

public class MissingElementsINArray {
	
	public static void main(String[] args) {
		
		int [] a= {5,10,20,25,30};
		
		Arrays.sort(a);
		int temp;
		for(int i=0;i<a.length-1;i++) {
			temp=a[i]+5;
			while(temp<a[i+1]) {
				System.out.println(temp);
				temp=temp+5;
			}
		}
		
	}

}
