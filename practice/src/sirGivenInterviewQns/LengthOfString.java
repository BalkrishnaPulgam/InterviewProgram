package sirGivenInterviewQns;

public class LengthOfString {
	//How to find the length of the string without using length?
	public static void main(String[] args) {
		
		String str = "Big black bug bit a big black dog on his big black nose";
		
		char[] strTocharArray=str.toCharArray();
		
		int length=0;
		for(char ch:strTocharArray) {
			length++;
		}
		
		System.out.println("length of String : "+length);
		
	
	}

}
