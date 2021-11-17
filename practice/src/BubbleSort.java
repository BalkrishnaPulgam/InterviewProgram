
public class BubbleSort {
	
	public static void main(String[] args) {
		
		 int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23}; 
		 int temp=0;
		for(int i=0; i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
