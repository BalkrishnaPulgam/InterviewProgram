package interview;

import java.util.HashSet;

public class StringAllUniqueCharacter {
	
	public static void main(String[] args) {
		
		String input="Balkrishna";
		
		boolean result=false;
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0; i<input.length();i++) {
			result=hs.add(input.charAt(i));
			if(result==false)
				break;
		}
		
		if(result==false) {
			System.out.println("The String " + input + " has duplicate characters");
		}
		else {
			 System.out.println("The String " + input + " has all unique characters");
		}
	}

}
