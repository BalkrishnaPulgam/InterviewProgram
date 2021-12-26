package stringInt;

public class AA {

	public static void main(String[] args) {

		String string = "Hello good Morning";
		string = string + " ";

		String word = "", small = "", large = "";
		String words[] = new String[127];

		int lenght = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				word = word + string.charAt(i);
			else {
				words[lenght] = word;
				lenght++;
				word = "";
			}

		}
		
		small = large = words[0];
		
		for(int k=0;k<lenght;k++) {
		if(small.length()>words[k].length())
			small=words[k];
		
		if(large.length()<words[k].length())
			large=words[k];
		
		}
		System.out.println("Small :"+small);
		System.out.println("large :"+large);

	}

}
