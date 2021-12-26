package stringInt;

public class FrequencyCharacter {
	
	 public static void main(String[] args) {
		 String str = "picture perfect";  
	
		 int n=str.length();
		 
		 int[] freq=new int[n];
		 
		 char []string=str.toCharArray();
		 
		 
		 for(int i=0;i<n;i++) {
			 freq[i]=1;
			 for(int j=i+1;j<n;j++) {
				 if(string[i]==string[j]) {
					 freq[i]++;
					 string[j]='0';
				 }
			 }
		 }
		 
		 for(int i=0;i<freq.length;i++) {
			 if(string[i]!=' '&& string[i]!='0') {
				 System.out.println(string[i]+" - "+freq[i]);
			 }
		 }
		 
		 
	}

}
