package interview;

public class LenghtOfString {

	public static void main(String[] args) {

		String s = "Balkrishna Vishal";

		int length = 0;

		for (int i = 0; i < s.length(); i++) {
			length++;
		}
		System.out.println(length);

		//alternate without using length() method
		String str = "Big black bug bit a big black dog on his big black nose";

		char[] strTocharArray = str.toCharArray();

		int length1 = 0;
		for (char ch : strTocharArray) {
			length1++;
		}

		System.out.println("length of String : " + length1);

	}

}
