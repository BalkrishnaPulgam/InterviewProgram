package hashmapUse;

import java.util.Arrays;

public class Angaram {
	
	public static void main(String[] args) {
		
		
		String str1="abcde";
		String str2="cdeab";
		boolean status=true;
		if(str1.length()!=str2.length()) {
			System.out.println("Given String is not Angaram");
		}else {
			char[] ch=str1.toLowerCase().toCharArray();
			char[] ch1=str1.toLowerCase().toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch1);
		status=	Arrays.equals(ch, ch1);
		}
		
		if(status) {
			System.out.println("Angaram");
		}else {
			System.out.println("Not Angaram");
		}
		
	}

}
