package interview;

public class RemoveSpaceInString {
	
	public static void main(String[] args) {
		
		
		String str="Balkrishna Pulgam";
		
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				System.out.print(ch);
			}
		}
		
		
	}

}
