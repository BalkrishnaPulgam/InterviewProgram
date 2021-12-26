package stringInt;

public class SmallestAndLargestWord {
	
	public static void main(String[] args) {
		
		
		String string="Hello good morning";
		
		String word="",small="",large="";
		
		String[] words=new String[100];
		
		int lenght=0;
		
		string=string+ " ";
		
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)!=' ') {
				word=word+string.charAt(i);
			}
			else {
				words[lenght]=word;
				lenght++;
				word="";
			}
		}
		
		small=large=words[0];
		
		for(int k=0;k<lenght;k++) {
		
		if(small.length()>words[k].length())
			small=words[k];
		
		
		
		if(large.length()<words[k].length())
			small=words[k];
		}
		
		System.out.println("Smallest word :"+small);
		System.out.println("largest word :"+large);
		
	}

}
