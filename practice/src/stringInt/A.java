package stringInt;

public class A {
	
	public static void main(String[] args) {
		
		String string="bASFFlkrishna Ganesh";
		
		StringBuffer sb= new StringBuffer(string);
		
		for(int i=0;i<string.length();i++) {
			if(Character.isLowerCase(i)) {
				sb.setCharAt(i, Character.toUpperCase(string.charAt(i)));
			}
			else if(Character.isUpperCase(i))
				sb.setCharAt(i, Character.toLowerCase(string.charAt(i)));
		}
		
		System.out.println("change Case :"+sb);
			
	}

}
