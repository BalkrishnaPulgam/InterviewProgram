package practice;

public class PrimeNo {
	
	public static void main(String[] args) {
	int n=10;
		int temp=0;
		
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("not prime");
		}
	}

}
