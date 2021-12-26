package stringInt;

import java.util.StringTokenizer;

public class WordCount {
	
	public static void main(String[] args) {
		
		 String sentence = "Beauty lies in the eyes of beholder";  
	        int wordCount = 0;  
	        
	       String[] str= sentence.split("\\s");
	       
	      int len= str.length;
	      System.out.println(len);
	      
	      
	      
	      
	      //alternate
	      
	      
	      StringTokenizer token=new StringTokenizer(sentence);
	   int count=  token.countTokens();
	   System.out.println("using  StringTokenizer :"+count);
	}

}
