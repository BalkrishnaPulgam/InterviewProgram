package sirGivenInterviewQns;

public class Swapstring {
	
	public static void main(String[] args) {
		
		
		String str1="Balkrishna";
		String str2="Vishal";
		//BalkrishnaVishal  ---str1
		str1=str1+str2;
		System.out.println(str1);
		str2=str1.substring(0, (str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		System.out.println("after swapping 1st String "+str1);
		System.out.println("after swapping 2nd String "+str2);
		
	}

}
