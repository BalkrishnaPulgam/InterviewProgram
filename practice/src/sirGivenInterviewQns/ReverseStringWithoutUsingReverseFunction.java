package sirGivenInterviewQns;

public class ReverseStringWithoutUsingReverseFunction {

	public static void main(String[] args) {

		String string = "Balkrishna";

		char[] ch = string.toCharArray();

		String reverse = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			reverse += ch[i];
		}

		System.out.println(reverse);

		// alternate

		String str = "BAlkrishna";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		System.out.println(rev);

	}

}
