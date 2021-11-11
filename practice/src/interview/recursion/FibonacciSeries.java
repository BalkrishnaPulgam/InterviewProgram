package interview.recursion;

public class FibonacciSeries {
	
	static int n1=0,n2=1,n3;
	
	static void fiboPrint(int count) {
		if(count>0) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			fiboPrint(count-1);
		}
	}
	
	public static void main(String[] args) {
		System.out.print(n1+" "+n2);
		fiboPrint(10);
		
	}

}
