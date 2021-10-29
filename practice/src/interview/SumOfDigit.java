package interview;

//Write a program for sum of digits 123 - 6

public class SumOfDigit {
	
	
public static void main(String[] args) {
	
	int n=123;
	
	int sum=0;
	
	
	while(n!=0) {
		sum=sum+n%10;
		n=n/10;
	}
	
	System.out.println(sum);
	
}
}
