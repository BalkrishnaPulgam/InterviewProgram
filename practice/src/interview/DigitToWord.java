package interview;

import java.util.Scanner;

public class DigitToWord {
	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 3 digit number ");
		int n=sc.nextInt();
		if(n<0 || n>999)
			System.out.println("invalid number");
		else {
			int u=n%10; // last digit
			int tt=n/10;
			int t=tt%10; // second digit
			int h=n/100;
			
			String uw[]= {" ", "One", "Two","Three", "Four", "Five","Six", "Seven", "Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen","Fifteen", "Sixteen","Seventeen", "Eighteen","Nineteen"};
			String tw[]= {" ", "Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
			String hw=" Hundred";
			if(n<20)
				System.out.println(uw[n]);
			else if(n<100)
				System.out.println(tw[t]+" "+uw[u]);
			else 
				System.out.println(uw[h]+hw+" "+tw[t]+" "+uw[u]);
			
		}
	}

}
