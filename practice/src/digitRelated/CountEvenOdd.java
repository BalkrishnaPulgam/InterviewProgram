package digitRelated;

public class CountEvenOdd {
	public static void main(String[] args) {
		
		
		
		int n=789456123;
		
		int countEven=0;
		int countOdd=0;
		
		while(n>0) {
			int rem=n%10;
			if(rem%2==0)
				countEven++;
			else
				countOdd++;
			n=n/10;
		}
		
		System.out.println("Even Count :"+countEven);
		System.out.println("Odd Count :"+countOdd);
	}

}
