package stringInt;

public class ChangeCase {
	
	public static void main(String[] args) {
		
		String string="Balkrishna Vishal";
		
		StringBuffer sb=new StringBuffer(string);
		
		for(int i=0;i<string.length();i++) {
			if(Character.isLowerCase(string.charAt(i))) {
				sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
			}
			
			else if(Character.isUpperCase(string.charAt(i)))
				sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
		}
		
		System.out.println("after changing case :"+sb);
		
	}

}
