package interview;

public class CountCharacters {
	
	public static void main(String[] args) {
		
		String input="Balkrishna Vishal";
		
		int count=0;
		
		for(int i=0; i<input.length();i++) {
			char c=input.charAt(i);
			if(c!=' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
