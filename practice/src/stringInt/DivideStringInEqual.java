package stringInt;

public class DivideStringInEqual {

	public static void main(String[] args) {

		String str = "aaabbbccc";

		int len = str.length();

		int n = 3;
		int temp = 0;
		int chars = len / 3;
		
		String[] st=new String[n];
		
		
		if(len%3!=0) {
			System.out.println("given string are not divided equal");
		}
		else {
			for(int i=0;i<len;i=i+chars) {
				String s=str.substring(i,i+chars);
				st[temp]=s;
				temp++;
			}
		}
		
		for(int i=0;i<st.length;i++) {
			System.out.println(st[i]);
		}
		
		
	}

}
