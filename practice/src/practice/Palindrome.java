package practice;

public class Palindrome {
	
	/*
	 * A palindromic number is a number (such as 16461) that remains the same when
	 * its digits are reversed
	 */
	
	public static void main(String[] args) {
		
		int a, b=0,c=0;
		int n=121;
		a=n;
		
		while(n!=0) {
			c=n%10;
			b=(b*10)+c;
			n=n/10;
			
		}
		
		if(b==a) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not");
		}
	}

}
