package stringInt;



public class Palindrome {

	public static void main(String[] args) {

	
		String str="madam";
		str=str.toLowerCase();
		
		boolean flag=true;
		
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				flag=false;
				break;
			}
		}
		
		if(flag) 
			System.out.println("String is Palindrome");
		
		else 
			System.out.println("String is not Palindrome");
	}

}
