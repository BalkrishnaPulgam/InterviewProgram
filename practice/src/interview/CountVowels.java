package interview;

public class CountVowels {

	public static void main(String[] args) {

		String str = "java by kiran";

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			if (character == 'a' || character == 'A' || character == 'i' || character == 'I' || character == 'e'
					|| character == 'E' || character == 'o' || character == 'O' || character == 'u'
					|| character == 'U') {
				count++;

			}
		}
		System.out.println(count);
	}

}
