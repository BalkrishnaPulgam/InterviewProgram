package interview;

public class ChangeCase {
	
	
	static void changecase(String s) {
		for(int i=0; i<s.length();i++) {
			int ch=s.charAt(i);
			if(ch>96&&ch<123) {
				ch=ch-32;
				System.out.print((char)ch);
			}else if(ch>64&&ch<91) {
				ch=ch+32;
				System.out.print((char)ch);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		changecase("BALKRISHNA");
	}

}
