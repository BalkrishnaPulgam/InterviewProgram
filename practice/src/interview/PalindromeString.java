package interview;

public class PalindromeString {
	
	public static void main(String[] args) {
		
		String str="madam";
		
		StringBuilder sr= new StringBuilder(str);
		
		sr.reverse();
		
		String rev=sr.toString();
		
		if(str.equals(rev)) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
	}

}
