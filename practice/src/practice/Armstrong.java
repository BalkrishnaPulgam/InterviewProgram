package practice;

public class Armstrong {
	
	//sum of the cubes of its digits is equal to the number itself(153,370,371,407)
	
	public static void main(String[] args) {
		
		int a, b=0,c=0;
		
		int n=370;           
		
		a=n;
		
		while(n!=0) {
			c=n%10;
			b=b+(c*c*c);
			n=n/10;
			
		}
		
		if(b==a) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not");
		}
		
	}

}
